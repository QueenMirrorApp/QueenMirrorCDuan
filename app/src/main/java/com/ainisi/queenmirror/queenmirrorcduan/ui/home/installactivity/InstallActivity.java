package com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.UserpassActivity;

import butterknife.Bind;
import butterknife.OnClick;

public class InstallActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView settitle;
    @Bind(R.id.iv_unselected)
    ImageView unselscetd;
    @Bind(R.id.iv_selected)
    ImageView selscetd;

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, InstallActivity.class));
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_install;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        settitle.setText("隐私");
    }

    @OnClick({R.id.title_back, R.id.iv_unselected, R.id.iv_selected, R.id.layout_privacy
    })
    public void click(View view) {

        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            //隐私
            case R.id.layout_privacy:
                ReplaceActivity.startActivity(InstallActivity.this);
                break;

            case R.id.iv_unselected:
                selscetd.setVisibility(View.VISIBLE);
                unselscetd.setVisibility(View.GONE);
                break;
            case R.id.iv_selected:
                selscetd.setVisibility(View.GONE);
                unselscetd.setVisibility(View.VISIBLE);
                break;
            default:
                break;

        }


    }
}
