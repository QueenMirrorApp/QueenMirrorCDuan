package com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity;

import android.content.Context;
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

public class OrderMessageActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView title;
    @Bind(R.id.recycler_ordmessage)
    RecyclerView ordrecycler;
    private List<SortBean> orelist=new ArrayList<>();
    public static void startActivity(Context context) {
        context.startActivity(new Intent(context,OrderMessageActivity.class));
    }
    @Override
    public int getLayoutId() {
        return R.layout.activity_order_mgs;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        for (int i = 0; i <6 ; i++) {
            SortBean sortBean=new SortBean();
            sortBean.setName("MOCO美容美发沙龙");
            sortBean.setTime("营业时间 9:00-20:00");
            sortBean.setLogo(R.drawable.ic_sortrecyle_logo);
            sortBean.setStars(R.drawable.icon_home_recommend);
            sortBean.setDistance("875m");
            orelist.add(sortBean);
        }
        MyAdapter sortAdapter=new MyAdapter(this,orelist,R.layout.item_oremesage);
        ordrecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        ordrecycler.setAdapter(sortAdapter);
        title.setText(R.string.message_center);

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
