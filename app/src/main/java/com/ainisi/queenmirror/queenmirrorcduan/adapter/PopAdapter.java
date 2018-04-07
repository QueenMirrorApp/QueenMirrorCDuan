package com.ainisi.queenmirror.queenmirrorcduan.adapter;

import android.content.Context;

import com.ainisi.queenmirror.common.base.BaseAdapter;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.bean.ProblemBean;
import com.ainisi.queenmirror.queenmirrorcduan.utils.BaseRecyclerAdapter;
import com.ainisi.queenmirror.queenmirrorcduan.utils.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2018/4/4.
 */

public class PopAdapter extends BaseRecyclerAdapter<ProblemBean> {

    public PopAdapter(Context context, List<ProblemBean> datas, int layoutId) {
        super(context, datas, layoutId);
    }

    @Override
    protected void bindData(BaseViewHolder holder, ProblemBean data, int position) {

    }
}
