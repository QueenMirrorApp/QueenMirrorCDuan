package com.ainisi.queenmirror.common.commonutils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by EWorld on 2018/1/26.
 */

public class CrashHandler implements Thread.UncaughtExceptionHandler {
    private static final String TAG = "CrashHandler";
    private static final boolean DEBUG = true;

    private static final String PATH = Environment.getExternalStorageDirectory().getPath() + "/CrashTest/log/";
    private static final String FILE_NAME = "crash";
    private static final String FILE_NAME_SUFFIX = ".trace";

    private static CrashHandler sInstance = new CrashHandler();
    private Thread.UncaughtExceptionHandler mDefaultCrashHandler;
    private Context mContext;

    public CrashHandler() {
    }

    public static CrashHandler getInstance(){
        return sInstance;
    }

    public void init(Context context){
        mDefaultCrashHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        mContext = context.getApplicationContext();
    }

    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        try{
            dumpExceptionToSDCard(ex);
            uploadExceptionToServer();//上传到服务器
        }catch (IOException e){
            e.printStackTrace();
        }

        ex.printStackTrace();
        if (mDefaultCrashHandler != null){
            mDefaultCrashHandler.uncaughtException(thread,ex);
        }else {
            Process.killProcess(Process.myPid());
        }
    }

    /**
     * 上传到服务器
     */
    private void uploadExceptionToServer() {

    }

    private void dumpExceptionToSDCard(Throwable ex) throws  IOException{
        if (!Environment.getExternalStorageDirectory().equals(Environment.MEDIA_MOUNTED)){
            if (DEBUG){
                Log.w(TAG,"sdcard unmounted,skip dump exception");
                return;
            }
        }

        File dir = new File(PATH);
        if (!dir.exists()){
            dir.mkdirs();
        }
        long current = System.currentTimeMillis();
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(current));
        File file = new File(PATH + FILE_NAME + time + FILE_NAME_SUFFIX);

        try{
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            pw.println(time);
            dumpPhoneInfo(pw);
            pw.println();
            ex.printStackTrace(pw);
            pw.close();

        }catch (Exception e){
            Log.d(TAG,"dump crash info failed");
        }
    }


    private void dumpPhoneInfo(PrintWriter pw) throws PackageManager.NameNotFoundException{
        PackageManager pm = mContext.getPackageManager();
        PackageInfo pi = pm.getPackageInfo(mContext.getPackageName(),PackageManager.GET_ACTIVITIES);
        pw.print("APP Version:");
        pw.print(pi.versionName);
        pw.print("_");
        pw.println(pi.versionCode);

        //Android版本号
        pw.print("OS version:");
        pw.print(Build.VERSION.RELEASE);
        pw.print("_");
        pw.println(Build.VERSION.SDK_INT);

        //手机制造商
        pw.print("Vendor:");
        pw.println(Build.MANUFACTURER);

        //手机型号
        pw.print("Model:");
        pw.println(Build.MODEL);

        //cpu架构
        pw.print("CPU ABI:");
        pw.println(Build.CPU_ABI);
    }


}
