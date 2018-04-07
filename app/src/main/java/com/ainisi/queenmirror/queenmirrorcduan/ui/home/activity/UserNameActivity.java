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
//修改用户名
public class UserNameActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView usertitle;
    @Bind(R.id.title_right)
    TextView titleright;
    public static void startActivity(Context context) {
        context.startActivity(new Intent(context,UserNameActivity.class));
    }
    @Override
    public int getLayoutId() {
        return R.layout.activity_user_name;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        usertitle.setText("修改用户名");
        titleright.setText("确定");
        initDate();

    }

    private void initDate() {

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
