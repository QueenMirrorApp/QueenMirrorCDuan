package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
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
//我的收藏
public class MineCollectionActivity extends BaseActivity{

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, MineCollectionActivity.class));
    }
    @Bind(R.id.recyler_collection)
    RecyclerView collrecycler;
    @Bind(R.id.title_title)
    TextView colltitle;
    private List<SortBean> list=new ArrayList<>();
    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_collection;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        initText();

        for (int i = 0; i <8 ; i++) {
            SortBean sortBean=new SortBean();
            sortBean.setName("");
            sortBean.setTime("");
            sortBean.setDistance("");
            list.add(sortBean);
        }
        MyAdapter sortAdapter2=new MyAdapter(this,list,R.layout.item_collection);
        collrecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        collrecycler.setAdapter(sortAdapter2);

    }

    private void initText() {
        colltitle.setText(R.string.help_and_feedback);

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
