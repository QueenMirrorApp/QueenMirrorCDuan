package com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;

import butterknife.Bind;
import butterknife.OnClick;

public class MineSettingActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView setText;
    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, MineSettingActivity.class));
    }
    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_setting;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {

        initText();

    }

    private void initText() {
        setText.setText(R.string.paymentpassword);
        setText.setTextColor(ContextCompat.getColor(this,R.color.alpha_95_black));
    }

    @OnClick({R.id.title_back
    })
    public void click(View view) {

        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            default:
                break;



        }


    }
}
