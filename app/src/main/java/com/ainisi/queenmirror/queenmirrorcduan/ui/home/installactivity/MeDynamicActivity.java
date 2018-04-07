package com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity;

import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;

import butterknife.Bind;

public class MeDynamicActivity extends BaseActivity {
    @Bind(R.id.newtitle_title)
    TextView meTitle;
    private String title;

    @Override
    public int getLayoutId() {
        return R.layout.activity_me_dynamic;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        title=getIntent().getStringExtra("dynamic");
        meTitle.setText(title);
    }
}
