package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;

import android.content.Intent;
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
//提交订单
public class PurchaseActivity extends BaseActivity {
    @Bind(R.id.recycle_order)
    RecyclerView precycler;
    @Bind(R.id.title_title)
    TextView purtitle;
    private List<SortBean> list=new ArrayList<>();
    @Override
    public int getLayoutId() {
        return R.layout.activity_purchase;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        purtitle.setText("提交订单");
        for (int i = 0; i <8 ; i++) {
            SortBean sortBean=new SortBean();
            sortBean.setName("");
            sortBean.setTime("");
            sortBean.setDistance("");
            list.add(sortBean);
        }
        MyAdapter sortAdapter2=new MyAdapter(this,list,R.layout.item_purchase);
        precycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        precycler.setAdapter(sortAdapter2);

    }
    @OnClick({R.id.tv_submit,R.id.title_back
    })
    public void click(View view) {
        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            //提交订单
            case R.id.tv_submit:
                startActivity(new Intent(PurchaseActivity.this,SubmitActivity.class));
                break;
        }


    }

}
