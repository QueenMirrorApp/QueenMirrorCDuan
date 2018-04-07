package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
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
 * Created by EWorld on 2017/11/12.
 * 搜索
 */

public class SearchActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView title;
    @Bind(R.id.titleimg_right)
    ImageView imgright;
    @Bind(R.id.title_search)
    TextView search;
    @Bind(R.id.layout_title)
    LinearLayout layouttitle;
    @Bind(R.id.root_title)
    RelativeLayout poplayout;
    @Bind(R.id.title_layout)
    LinearLayout titlelayout;
    @Bind(R.id.rc_hot)
    RecyclerView rchot;
//    @Bind(R.id.rc_history)
//    RecyclerView rchistory;
   private List<SortBean> list=new ArrayList<>();
    public static void startActivity(Context context) {
        Intent in = new Intent(context, SearchActivity.class);
        context.startActivity(in);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_search;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView(){
        showpopid();
        initHot();
        initHistory();
    }
    private void initHot() {

    }
    private void initHistory() {

    }




    private void showpopid() {
        title.setVisibility(View.GONE);
        imgright.setVisibility(View.GONE);
        titlelayout.setVisibility(View.VISIBLE);
        poplayout.setBackgroundColor(ContextCompat.getColor(this,R.color.alpha_05_black));
        search.setBackgroundColor(ContextCompat.getColor(this,R.color.alpha_40_black));
       layouttitle.setBackgroundColor(ContextCompat.getColor(this,R.color.alpha_40_black));
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
