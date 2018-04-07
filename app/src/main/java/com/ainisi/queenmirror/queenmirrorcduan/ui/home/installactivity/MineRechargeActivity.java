package com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity;

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

/**
 * 余额充值
 */
public class MineRechargeActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView reTitle;
    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_recharge;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        initText();

    }

    private void initText() {
        reTitle.setText(R.string.balance_recharge);
        reTitle.setTextColor(ContextCompat.getColor(this,R.color.alpha_95_black));
    }

    @OnClick({R.id.title_back,R.id.bt_binding
    })
    public void click(View view) {

        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            case R.id.bt_binding:
                break;
            default:
                break;

        }


    }
}
