package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;

import butterknife.Bind;

public class MineBeautyActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView beautyTitle;
    @Bind(R.id.title_right)
    TextView titleRight;
    public static void startActivity(Context context) {
        context.startActivity(new Intent(context,MineBeautyActivity.class));
    }
    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_beauty;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        beautyTitle.setText(R.string.beauty);

        titleRight.setText(R.string.reservation);
    }
}
