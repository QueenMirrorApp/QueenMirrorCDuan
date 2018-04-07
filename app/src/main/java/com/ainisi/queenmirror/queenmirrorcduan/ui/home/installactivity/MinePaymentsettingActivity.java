package com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity;


import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;

import butterknife.Bind;
import butterknife.OnClick;

//支付设置

public class MinePaymentsettingActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView settingTitle;
    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, MinePaymentsettingActivity.class));
    }
    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_paymentsetting;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        initText();
    }

    private void initText() {
        settingTitle.setText(R.string.payment_setting);
        settingTitle.setTextColor(ContextCompat.getColor(this,R.color.alpha_95_black));
    }

    @OnClick({R.id.title_back,R.id.layout_setting
    })
    public void click(View view) {

        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            case R.id.layout_setting:
                MineSettingActivity.startActivity(this);
                break;
            default:
                break;


        }


    }
}
