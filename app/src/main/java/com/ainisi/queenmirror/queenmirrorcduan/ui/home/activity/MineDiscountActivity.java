package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.fragment.HistorydiscountFragment;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.fragment.MinediscountFragment;
import com.ainisi.queenmirror.queenmirrorcduan.utils.NoScrollViewPager;
import com.ainisi.queenmirror.queenmirrorcduan.utils.ViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;
//优惠券
public class MineDiscountActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView discounttitle;
    @Bind(R.id.mine_tab)
    TabLayout minetab;
    @Bind(R.id.mine_pager)
    NoScrollViewPager minepager;
    private List<Fragment> minefrlist = new ArrayList<>();
    private List<String> list = new ArrayList<>();

    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_discount;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        discounttitle.setText(R.string.coupon);
        initDate();

        ViewPager viewPager = new ViewPager(getSupportFragmentManager(), minefrlist, list);
        minepager.setAdapter(viewPager);
        minepager.setScanScroll(false);
        minetab.setupWithViewPager(minepager);


    }

    private void initDate() {
        //我的优惠券
        minefrlist.add(new MinediscountFragment());
        //历史优惠券
        minefrlist.add(new HistorydiscountFragment());

        list.add("我的优惠券");
        list.add("历史优惠券");
        minetab.addTab(minetab.newTab().setText(list.get(0).toString().trim()));
        minetab.addTab(minetab.newTab().setText(list.get(1).toString().trim()));

    }

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, MineDiscountActivity.class));
    }

    @OnClick({R.id.title_back})
    public void click(View view) {
        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            default:
                break;


        }

    }
}