package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity.MineAskproblemActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity.MineFeedbackActivity;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * 帮助与反馈
 */
public class MineProblemActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView proTitle;

    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_problem;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        proTitle.setText(R.string.refund_progress);
    }

    @OnClick({R.id.title_back,R.id.layout_feedback,R.id.layout_problem
    })
    public void click(View view) {

        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            /**
             * 意见与反馈
             */
            case R.id.layout_feedback:
                this.startActivity(new Intent(this, MineFeedbackActivity.class));

                break;
            /**
             * 常见问题
             */
            case R.id.layout_problem:
                this.startActivity(new Intent(this, MineAskproblemActivity.class));
                break;
            default:
                break;

        }


    }
}
