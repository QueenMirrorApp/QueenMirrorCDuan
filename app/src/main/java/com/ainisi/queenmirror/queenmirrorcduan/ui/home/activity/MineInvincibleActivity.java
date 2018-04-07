package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;

import android.content.Context;
import android.content.Intent;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;
//无敌劵
public class MineInvincibleActivity extends BaseActivity {


    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_invincible;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {

    }

    public static void startActivity(Context context) {
       context.startActivity(new Intent(context,MineInvincibleActivity.class));
    }
}
