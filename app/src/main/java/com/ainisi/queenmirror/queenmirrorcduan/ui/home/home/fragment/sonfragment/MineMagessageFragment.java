package com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.fragment.sonfragment;


import android.support.v4.app.Fragment;
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
 * 信息中心
 */
public class MineMagessageFragment extends BaseFragment {
    @Bind(R.id.rc_shedule)
    RecyclerView rcshedule;
    List<SortBean> sortlist=new ArrayList<>();
    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_mine_magessage;
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
        MyAdapter sortAdapter=new MyAdapter(getActivity(),sortlist,R.layout.item_rcshedule);
        rcshedule.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        rcshedule.setAdapter(sortAdapter);
    }
}
