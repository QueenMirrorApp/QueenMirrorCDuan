package com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity;


import android.content.res.Resources;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.fragment.sonfragment.AllDetailFragment;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.fragment.sonfragment.ExpenseFragment;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.fragment.sonfragment.IncomeDetailsFragment;
import com.ainisi.queenmirror.queenmirrorcduan.utils.NoScrollViewPager;
import com.ainisi.queenmirror.queenmirrorcduan.utils.ViewPager;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

public class MineDetailedActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView detailedTitle;
    @Bind(R.id.tab_detailed)
    TabLayout detailedTab;
    @Bind(R.id.pager_detailed)
    NoScrollViewPager detailedPager;
    private List<String> tabList = new ArrayList<>();
    private List<Fragment> pagerList = new ArrayList<>();

    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_detailed;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        initText();
        initDete();

    }

    private void initDete() {
        tabList.add("全部");
        tabList.add("收入");
        tabList.add("支出");
        /**
         * 全部
         * 收入
         * 支出
         */
        pagerList.add(new AllDetailFragment());
        pagerList.add(new IncomeDetailsFragment());
        pagerList.add(new ExpenseFragment());
        for (int i = 0; i < tabList.size(); i++) {
            detailedTab.addTab(detailedTab.newTab().setText(tabList.get(i)));
        }
        ViewPager pager = new ViewPager(getSupportFragmentManager(), pagerList, tabList);
        detailedPager.setAdapter(pager);
        detailedPager.setScanScroll(false);
        detailedTab.setupWithViewPager(detailedPager);
        detailedTab.post(new Runnable() {
            @Override
            public void run() {
                setIndicator(detailedTab,40,40);
            }
        });

    }

    private void initText() {
        detailedTitle.setText(getIntent().getStringExtra("name"));
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