package com.ainisi.queenmirror.queenmirrorcduan.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.ainisi.queenmirror.common.commonutils.ToastUtils;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.bean.SortBean;
import com.ainisi.queenmirror.queenmirrorcduan.utils.BaseRecyclerAdapter;
import com.ainisi.queenmirror.queenmirrorcduan.utils.BaseViewHolder;

import java.util.List;

/**
 * Created by 王军超 on 2018/3/22.
 *
 * jl
 *
 */

public class MyAdapter extends BaseRecyclerAdapter<SortBean> {

    public MyAdapter(Context context, List<SortBean> datas, int layoutId) {
        super(context, datas, layoutId);

    }

    @Override
    protected void bindData(BaseViewHolder holder, final SortBean data, int position) {


    }
}
