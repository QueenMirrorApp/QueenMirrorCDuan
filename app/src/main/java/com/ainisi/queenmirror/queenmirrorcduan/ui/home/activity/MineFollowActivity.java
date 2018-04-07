package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.adapter.MyAdapter;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.bean.SortBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;
//关注店铺
public class MineFollowActivity extends BaseActivity{
    @Bind(R.id.mine_follow_recycler)
    RecyclerView recycler;
    @Bind(R.id.title_title)
    TextView folltitle;
    List<SortBean> sortlist=new ArrayList<>();
    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, MineFollowActivity.class));
    }
    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_follow;
    }
    @Override
    public void initPresenter() {

    }
    @Override
    public void initView() {
        folltitle.setText("关注店铺");

        for (int i = 0; i <10 ; i++) {
            SortBean sortBean=new SortBean();
            sortBean.setName("MOCO美容美发沙龙");
            sortBean.setTime("营业时间 9:00-20:00");
            sortBean.setLogo(R.drawable.ic_sortrecyle_logo);
            sortBean.setStars(R.drawable.icon_home_recommend);
            sortBean.setDistance("875m");
            sortlist.add(sortBean);
        }

        MyAdapter sortAdapter=new MyAdapter(this,sortlist,R.layout.item_fullshortrecycler);
        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recycler.setAdapter(sortAdapter);

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
