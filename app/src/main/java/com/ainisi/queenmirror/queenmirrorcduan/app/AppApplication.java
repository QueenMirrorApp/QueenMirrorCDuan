package com.ainisi.queenmirror.queenmirrorcduan.app;

import android.os.StrictMode;

import com.ainisi.queenmirror.common.baseapp.BaseApplication;
import com.ainisi.queenmirror.common.commonutils.CrashHandler;
import com.ainisi.queenmirror.common.commonutils.ToastUtils;


/**
 * APPLICATION
 */
public class AppApplication extends BaseApplication {
    private static final String TAG = "AppApplication";

    /*
    友盟分享静态加载注册信息
    */
    static {
       // PlatformConfig.setSinaWeibo("263819347", "235e107f378a3440c78928d55dcb688c", "http://sns.whalecloud.com");
       // PlatformConfig.setQQZone("1106548988", "ppRwmD6Zb8I2gZt3");
       // PlatformConfig.setWeixin(APP_ID, APP_SECRET);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //QueuedWork.isUseThreadPool = false;
        //初始化吐司
        ToastUtils.getInstance(this);

        //解决API大于等于24 调用相机图库崩溃问题
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        builder.detectFileUriExposure();

        //umen 推送
        //PushAgent mPushAgent = PushAgent.getInstance(this);
//        mPushAgent.setDebugMode(true);
//        //sdk开启通知声音
//        mPushAgent.setNotificationPlaySound(MsgConstant.NOTIFICATION_PLAY_SDK_ENABLE);
//        //注册推送服务 每次调用register都会回调该接口
//        mPushAgent.register(new IUmengRegisterCallback() {
//            @Override
//            public void onSuccess(String deviceToken) {
//                UmLog.i(TAG, "device token: " + deviceToken);
//                SPManager.getInstance().putString("device_token", deviceToken);
//            }
//
//            @Override
//            public void onFailure(String s, String s1) {
//                UmLog.i(TAG, "register failed: " + s + " " + s1);
//            }
//        });
//        mPushAgent.setPushIntentServiceClass(MyPushIntentService.class);

        //LeakCanary.install(this);

        //Stetho.initializeWithDefaults(this);

        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(this);

    }


}
