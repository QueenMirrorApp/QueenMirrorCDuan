package com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.fragment.sonfragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.ainisi.queenmirror.common.base.BaseFragment;
import com.ainisi.queenmirror.common.commonutils.ToastUtils;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.adapter.MyAdapter;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.bean.SortBean;
import com.ainisi.queenmirror.queenmirrorcduan.utils.BaseRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by Administrator on 2018/3/19.
 */

public class SortFragment extends BaseFragment {
    @Bind(R.id.sore_recycler)
    RecyclerView recycler;
    List<SortBean> sortlist = new ArrayList<>();

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_sort;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {

        for (int i = 0; i < 10; i++) {
            SortBean sortBean = new SortBean();
            sortBean.setName("MOCO美容美发沙龙");
            sortBean.setTime("营业时间 9:00-20:00");
            sortBean.setLogo(R.drawable.ic_sortrecyle_logo);
            sortBean.setStars(R.drawable.icon_home_recommend);
            sortBean.setDistance("875m");
            sortlist.add(sortBean);
        }
        MyAdapter sortAdapter = new MyAdapter(getActivity(), sortlist, R.layout.item_shortrecycler);
        recycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recycler.setAdapter(sortAdapter);
        sortAdapter.setOnItemClickListner(new BaseRecyclerAdapter.OnItemClickListner() {
            @Override
            public void onItemClickListner(View v, int position) {
                switch (position) {
                    case 1:
                        ToastUtils.showShort("你点击了item1");
                        break;
                    case 2:
                        ToastUtils.showShort("您点击了item2，因为代码设定之后的无法点击了");
                        break;
                }
            }
        });
    }
}
