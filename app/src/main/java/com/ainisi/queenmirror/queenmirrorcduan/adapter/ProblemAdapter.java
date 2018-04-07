package com.ainisi.queenmirror.queenmirrorcduan.adapter;

import android.content.Context;
import android.widget.TextView;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.bean.ProblemBean;
import com.ainisi.queenmirror.queenmirrorcduan.utils.BaseRecyclerAdapter;
import com.ainisi.queenmirror.queenmirrorcduan.utils.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2018/4/
 *
 *
 */

public class ProblemAdapter extends BaseRecyclerAdapter<ProblemBean> {

    public ProblemAdapter(Context context, List<ProblemBean> datas, int layoutId) {
        super(context, datas, layoutId);

    }

    @Override
    protected void bindData(BaseViewHolder holder, ProblemBean data, int position) {
       TextView replace=holder.itemView.findViewById(R.id.tv_replace);
        replace.setText(data.getName());
    }
}
