package com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * 余额提现
 */
public class MineWithdrawalsActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView wTitle;
    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_withdrawals;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        initText();
    }

    private void initText() {
        wTitle.setText(R.string.balance);
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
