package com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.adapter.ProblemAdapter;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.bean.ProblemBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

public class MineCommonProblemActivity extends BaseActivity {
    @Bind(R.id.rc_common)
    RecyclerView rccommon;
    @Bind(R.id.title_title)
    TextView commonTitle;
    String[] problem = {"什么是余额？", "充值限制", "提现限制","余额提现额度超限怎么办？","余额支付额度超限怎么办？","提现到账时间","余额明细里的余额结转是什么？"};
    private List<ProblemBean> list = new ArrayList<>();

    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_common_problem;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {

        initText();
        initDate();
    }

    private void initText() {
        commonTitle.setText("常见问题");
        commonTitle.setTextColor(ContextCompat.getColor(this,R.color.alpha_95_black));
    }

    private void initDate() {
        for (int i = 0; i < problem.length; i++) {
            ProblemBean problemBean = new ProblemBean();
            problemBean.setName(problem[i]);
            list.add(problemBean);
        }
        ProblemAdapter problemAdapter=new ProblemAdapter(this,list,R.layout.item_rccommon_problem);
        rccommon.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        rccommon.setAdapter(problemAdapter);


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
