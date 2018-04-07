package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;

import android.content.res.Resources;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.fragment.sonfragment.MineMagessageFragment;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.fragment.sonfragment.MineServiceFragment;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.fragment.sonfragment.MineSheduleFragment;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.orderfragment.AssessedFragment;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.orderfragment.RefundFragment;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.orderfragment.WholeFragment;
import com.ainisi.queenmirror.queenmirrorcduan.utils.NoScrollViewPager;
import com.ainisi.queenmirror.queenmirrorcduan.utils.ViewPager;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/*
服务中心
 */
public class MineMyServiceActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView serviceTitle;
    @Bind(R.id.tab_service)
    TabLayout serviceTab;
    @Bind(R.id.pager_service)
    NoScrollViewPager servicePager;


    private List<String> tablist = new ArrayList<>();
    private List<Fragment> pagerlist = new ArrayList<>();

    @Override
    public int getLayoutId() {
        return R.layout.activity_mein_my_service;
    }

    @Override
    public void initPresenter() {


    }

    @Override
    public void initView() {
        serviceTitle.setText("服务中心");
        initDate();


    }

    private void initDate() {
        tablist.add("意见与反馈");
        tablist.add("帮助");
        tablist.add("信息");
        serviceTab.addTab(serviceTab.newTab().setText(tablist.get(0)));
        serviceTab.addTab(serviceTab.newTab().setText(tablist.get(1)));
        serviceTab.addTab(serviceTab.newTab().setText(tablist.get(2)));

         /**
            退款进度
            服务进度
            信息中心
         */
        pagerlist.add(new MineSheduleFragment());
        pagerlist.add(new MineServiceFragment());
        pagerlist.add(new MineMagessageFragment());
        ViewPager viewPager = new ViewPager(getSupportFragmentManager(), pagerlist, tablist);
        servicePager.setAdapter(viewPager);
        servicePager.setScanScroll(false);
        serviceTab.setupWithViewPager(servicePager);
        serviceTab.post(new Runnable() {
            @Override
            public void run() {
                setIndicator(serviceTab,30,30);
            }
        });

    }
    @OnClick({R.id.title_back, R.id.layout_schedule, R.id.layout_service, R.id.layout_magessage
    })
    public void click(View view) {

        switch (view.getId()) {
            case R.id.title_back:
                finish();

                break;
            case R.id.layout_schedule:
                break;
            case R.id.lay_service:
                break;
            case R.id.layout_magessage:
                MessageActivity.startActivity(this);
                break;
            default:
                break;

        }


    }
    public void setIndicator(TabLayout tabs, int leftDip, int rightDip) {
        Class<?> tabLayout = tabs.getClass();
        Field tabStrip = null;
        try {
            tabStrip = tabLayout.getDeclaredField("mTabStrip");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        tabStrip.setAccessible(true);
        LinearLayout llTab = null;
        try {
            llTab = (LinearLayout) tabStrip.get(tabs);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        int left = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, leftDip, Resources.getSystem().getDisplayMetrics());
        int right = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, rightDip, Resources.getSystem().getDisplayMetrics());

        for (int i = 0; i < llTab.getChildCount(); i++) {
            View child = llTab.getChildAt(i);
            child.setPadding(0, 0, 0, 0);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, 1);
            params.leftMargin = left;
            params.rightMargin = right;
            child.setLayoutParams(params);
            child.invalidate();
        }
    }



}
