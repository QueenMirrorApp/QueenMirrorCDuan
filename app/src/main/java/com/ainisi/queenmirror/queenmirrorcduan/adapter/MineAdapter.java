package com.ainisi.queenmirror.queenmirrorcduan.adapter;

import android.content.Context;

import com.ainisi.queenmirror.queenmirrorcduan.ui.home.bean.SortBean;
import com.ainisi.queenmirror.queenmirrorcduan.utils.BaseRecyclerAdapter;
import com.ainisi.queenmirror.queenmirrorcduan.utils.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2018/3/
 *
 * jl
 */

public class MineAdapter extends BaseRecyclerAdapter<SortBean> {
    public MineAdapter(Context context, List<SortBean> datas, int layoutId) {
        super(context, datas, layoutId);

    }

    @Override
    protected void bindData(BaseViewHolder holder, SortBean data, int position) {

    }
}
