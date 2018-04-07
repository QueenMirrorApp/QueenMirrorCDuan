package com.ainisi.queenmirror.queenmirrorcduan.ui.home.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ainisi.queenmirror.common.base.BaseFragment;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.adapter.MyAdapter;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.bean.SortBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by EWorld on 2018/3/6.
 * 综合排序
 */

public class FullshortFragment extends BaseFragment{
    @Bind(R.id.full_sore_recycler)
    RecyclerView recycler;
    List<SortBean> sortlist=new ArrayList<>();
    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_fullshort;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {
        for (int i = 0; i <10 ; i++) {
            SortBean sortBean=new SortBean();
            sortBean.setName("MOCO美容美发沙龙");
            sortBean.setTime("营业时间 9:00-20:00");
            sortBean.setLogo(R.drawable.ic_sortrecyle_logo);
            sortBean.setStars(R.drawable.icon_home_recommend);
            sortBean.setDistance("875m");
            sortlist.add(sortBean);
        }
        MyAdapter sortAdapter=new MyAdapter(getActivity(),sortlist,R.layout.item_fullshortrecycler);
        recycler.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        recycler.setAdapter(sortAdapter);

    }
}
