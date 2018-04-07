package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.adapter.MyAdapter;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.bean.SortBean;
import java.util.ArrayList;
import java.util.List;
import butterknife.Bind;
//我的位置
public class MinePositionActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView postitle;
    @Bind(R.id.title_right)
    TextView postitleright;
    @Bind(R.id.rc_position)
    RecyclerView posrctcle;
    public List<SortBean> sortlist=new ArrayList<>();
    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_position;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        postitle.setText(R.string.myposition);
        postitleright.setText(R.string.administration);
        postitle.setTextColor(ContextCompat.getColor(this,R.color.alpha_95_black));
        initDate();
    }

    private void initDate() {
        for (int i = 0; i <10 ; i++) {
            SortBean sortBean=new SortBean();
            sortBean.setName("MOCO美容美发沙龙");
            sortBean.setTime("营业时间 9:00-20:00");
            sortBean.setLogo(R.drawable.ic_sortrecyle_logo);
            sortBean.setStars(R.drawable.icon_home_recommend);
            sortBean.setDistance("875m");
            sortlist.add(sortBean);
        }

        MyAdapter sortAdapter=new MyAdapter(this,sortlist,R.layout.item_rcposition);
       posrctcle.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        posrctcle.setAdapter(sortAdapter);
    }
}
