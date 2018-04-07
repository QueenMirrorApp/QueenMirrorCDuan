package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;

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
//我的好友
public class MineFriendsActivity extends BaseActivity {
    @Bind(R.id.rc_friends)
    RecyclerView rcfriends;
    @Bind(R.id.title_title)
    TextView frtitile;
    private List<SortBean> list=new ArrayList<>();
    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_friends;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        frtitile.setText("我的好友");
        initDate();

    }

    private void initDate() {

        for (int i = 0; i <8 ; i++) {
            SortBean sortBean=new SortBean();
            sortBean.setName("");
            sortBean.setTime("");
            sortBean.setDistance("");
            list.add(sortBean);
        }
        MyAdapter sortAdapter2=new MyAdapter(this,list,R.layout.item_rcfriends);
        rcfriends.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        rcfriends.setAdapter(sortAdapter2);
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
