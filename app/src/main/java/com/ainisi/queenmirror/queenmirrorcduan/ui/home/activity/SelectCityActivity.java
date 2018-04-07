package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;


import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.adapter.MyAdapter;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.bean.SortBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;


/**
 * @author weikailiang
 * @function Created on 2017/8/4.
 * 位置
 */

public class SelectCityActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView StTitle;
    @Bind(R.id.rc_selsctcity)
    RecyclerView HmSelecity;

    private List<SortBean> sortlist = new ArrayList<>();

    @Override
    public int getLayoutId() {
        return R.layout.activity_selectcity_layout;
    }

    @Override
    public void initPresenter() {
    }

    @Override
    public void initView() {
        StTitle.setText(R.string.search_the_shop);
        initDate();

    }

    private void initDate() {
        for (int i = 0; i < 10; i++) {
            SortBean sortBean = new SortBean();
            sortBean.setName("MOCO美容美发沙龙");
            sortBean.setTime("营业时间 9:00-20:00");
            sortBean.setLogo(R.drawable.ic_sortrecyle_logo);
            sortBean.setStars(R.drawable.icon_home_recommend);
            sortBean.setDistance("875m");
            sortlist.add(sortBean);
        }

        MyAdapter sortAdapter = new MyAdapter(this, sortlist, R.layout.item_rcselect);
        HmSelecity.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        HmSelecity.setAdapter(sortAdapter);

    }

    @OnClick({R.id.title_back
    })
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
