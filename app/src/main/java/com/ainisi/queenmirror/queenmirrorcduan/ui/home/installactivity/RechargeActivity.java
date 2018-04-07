package com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.MineBeanActivity;

import butterknife.Bind;
import butterknife.OnClick;

//充值
public class RechargeActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView reTitle;
    public static void startActivity(Context context) {
        context.startActivity(new Intent(context,RechargeActivity.class));
    }
    @Override
    public int getLayoutId() {
        return R.layout.activity_recharge;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        reTitle.setText(R.string.rcharge);
    }
    @OnClick({R.id.title_back
    })
    public void click(View view) {

        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;



        }


    }
}
