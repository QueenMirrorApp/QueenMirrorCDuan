package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;

import android.graphics.Color;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.adapter.ProblemAdapter;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.bean.ProblemBean;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.fragment.FullFragment;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.orderfragment.AssessedFragment;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.orderfragment.RefundFragment;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.orderfragment.WholeFragment;
import com.ainisi.queenmirror.queenmirrorcduan.utils.BaseRecyclerAdapter;
import com.ainisi.queenmirror.queenmirrorcduan.utils.CustomPopWindow;
import com.ainisi.queenmirror.queenmirrorcduan.utils.NoScrollViewPager;
import com.ainisi.queenmirror.queenmirrorcduan.utils.ViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * 美学汇（美甲美手）
 */
public class EstheticsActivity extends BaseActivity {

    @Bind(R.id.exthetis_tab)
    TabLayout etablayout;
    @Bind(R.id.esthetics_mypager)
    NoScrollViewPager emypager;
    @Bind(R.id.bar_esthetice)
    AppBarLayout esthetics;
    String[] problem = {"销量最高", "价格最低", "距离最近", "优惠最多", "满减优惠", "新用最好", "用户最好"};
    private List<ProblemBean> list = new ArrayList<>();
    private List<String> tablist;
    private List<Fragment> pagerlist = new ArrayList<>();


    private void initDate() {
        tablist = new ArrayList<>();
        tablist.add("全部");
        tablist.add("指甲笔绘");
        tablist.add("指甲勾绘");
        tablist.add("指甲喷绘");
        tablist.add("待评价");
        tablist.add("退款");
        for (int i = 0; i <tablist.size() ; i++) {
            etablayout.addTab(etablayout.newTab().setText(tablist.get(i)));
        }
        /**
         //全部订单
         //待评价
         //退款
         */
        pagerlist.add(new FullFragment());
        pagerlist.add(new AssessedFragment());
        pagerlist.add(new RefundFragment());
        pagerlist.add(new WholeFragment());
        pagerlist.add(new AssessedFragment());
        pagerlist.add(new RefundFragment());
    }


    @Override
    public int getLayoutId() {
        return R.layout.activity_esthetics;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        initDate();
        ViewPager viewPager = new ViewPager(getSupportFragmentManager(), pagerlist, tablist);
        emypager.setAdapter(viewPager);
        emypager.setScanScroll(false);
        etablayout.setupWithViewPager(emypager);
    }

    @OnClick({R.id.title_back,R.id.iv_screening})
    public void click(View view) {
        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            case R.id.iv_screening:
                View popview=View.inflate(this,R.layout.pop_screening,null);
                showpopid(popview);
                CustomPopWindow popWindow = new CustomPopWindow.PopupWindowBuilder(this)
                        .setView(popview)
                        .setFocusable(true)
                        .size(CollapsingToolbarLayout.LayoutParams.MATCH_PARENT, CollapsingToolbarLayout.LayoutParams.WRAP_CONTENT)
                        .setOutsideTouchable(true)
                        .enableBackgroundDark(true) //弹出popWindow时，背景是否变暗
                        .setBgDarkAlpha(0.7f) // 控制亮度
                        .setAnimationStyle(R.style.CustomPopWindowStyle)
                        .create()
                        .showAtLocation(esthetics, Gravity.TOP,0,0);
                break;
            
        }

    }

    private void showpopid(View popview) {
        TextView title=popview.findViewById(R.id.title_title);
        ImageView imgright=popview.findViewById(R.id.titleimg_right);
        TextView search=popview.findViewById(R.id.title_search);
        LinearLayout layouttitle=popview.findViewById(R.id.layout_title);
        RelativeLayout poplayout=popview.findViewById(R.id.root_title);
        LinearLayout titlelayout=popview.findViewById(R.id.title_layout);
        title.setVisibility(View.GONE);
        imgright.setVisibility(View.GONE);
        titlelayout.setVisibility(View.VISIBLE);
        poplayout.setBackgroundColor(Color.parseColor("#EC5990"));
        search.setBackgroundColor(Color.parseColor("#F371BB"));
        layouttitle.setBackgroundColor(Color.parseColor("#F371BB"));

        RecyclerView rcscreen=popview.findViewById(R.id.rc_screen);

        for (int i = 0; i < problem.length; i++) {
            ProblemBean problemBean = new ProblemBean();
            problemBean.setName(problem[i]);
            list.add(problemBean);
        }
        ProblemAdapter problemAdapter = new ProblemAdapter(this, list, R.layout.item_pop_rcscreen);
        rcscreen.setLayoutManager(new GridLayoutManager(this,4));
        rcscreen.setAdapter(problemAdapter);


    }

}