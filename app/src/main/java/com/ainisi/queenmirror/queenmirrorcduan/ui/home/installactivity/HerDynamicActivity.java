package com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;

import butterknife.Bind;

public class HerDynamicActivity extends BaseActivity
{
    @Bind(R.id.newtitle_title)
    TextView hertitle;
    private String title;

    @Override
    public int getLayoutId() {
        return R.layout.activity_her_dynamic;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        title =getIntent().getStringExtra("dynamic");
        hertitle.setText(title);
    }
}
