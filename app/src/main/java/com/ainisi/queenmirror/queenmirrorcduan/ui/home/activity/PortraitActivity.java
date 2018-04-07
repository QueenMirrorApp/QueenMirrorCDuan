package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.utils.CustomPopWindow;

import butterknife.Bind;
import butterknife.OnClick;
//我的账号
public class PortraitActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView title;


    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, PortraitActivity.class));
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_portrait;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        title.setText("我的账号");
    }

    @OnClick({R.id.layout_userimg, R.id.layout_username, R.id.layout_password, R.id.layout_passphone, R.id.title_back})
    public void click(View view) {
        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            case R.id.layout_userimg:
                View popview=View.inflate(this,R.layout.alert_dialog,null);
                CustomPopWindow popWindow = new CustomPopWindow.PopupWindowBuilder(this)
                        .setView(popview)
                        .setFocusable(true)
                        .size(CollapsingToolbarLayout.LayoutParams.MATCH_PARENT, CollapsingToolbarLayout.LayoutParams.WRAP_CONTENT)
                        .setOutsideTouchable(true)
                        .enableBackgroundDark(true) //弹出popWindow时，背景是否变暗
                        .setBgDarkAlpha(0.7f) // 控制亮度
                        .setAnimationStyle(R.style.CustomPopWindowStyle)
                        .create()
                        .showAtLocation(this.findViewById(R.id.main), Gravity.BOTTOM,0,0);

                break;
            //修改用户名
            case R.id.layout_username:

                UserNameActivity.startActivity(this);
                break;
            //账户密码
            case R.id.layout_password:
                UserpassActivity.startActivity(this);
                break;
            //修改手机号
            case R.id.layout_passphone:
                UserphoneActivity.startActivity(this);
                break;
            default:
                break;
        }

    }

}
