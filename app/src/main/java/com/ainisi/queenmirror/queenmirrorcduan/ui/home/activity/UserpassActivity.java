package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;

import butterknife.Bind;
import butterknife.OnClick;

public class UserpassActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView passtitle;
    public static void startActivity(Context context) {
        context.startActivity(new Intent(context,UserpassActivity.class));
    }
    @Override
    public int getLayoutId() {
        return R.layout.activity_userpass;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        passtitle.setText("重设密码");
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
