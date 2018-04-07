package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;


import android.view.View;
import android.widget.ImageView;
import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;

import butterknife.Bind;
import butterknife.OnClick;
//支付订单
public class SubmitActivity extends BaseActivity {
    @Bind(R.id.img_wechat_unpayment)
    ImageView wcunpayment;
    @Bind(R.id.img_wechat_payment)
    ImageView wcpayment;
    @Bind(R.id.img_queen_unpayment)
    ImageView queenunpayment;
    @Bind(R.id.img_queen_payment)
    ImageView queenpayment;

    @Override
    public int getLayoutId() {
        return R.layout.activity_submit;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {

    }

    @OnClick({R.id.img_wechat_unpayment, R.id.img_wechat_payment, R.id.img_queen_unpayment,R.id.img_queen_payment,R.id.title_back
    })
    public void click(View view) {
        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            case R.id.img_wechat_unpayment:
                wcunpayment.setVisibility(View.GONE);
                wcpayment.setVisibility(View.VISIBLE);
                queenunpayment.setVisibility(View.VISIBLE);
                queenpayment.setVisibility(View.GONE);
                break;
            case R.id.img_queen_unpayment:
                queenunpayment.setVisibility(View.GONE);
                queenpayment.setVisibility(View.VISIBLE);
                wcunpayment.setVisibility(View.VISIBLE);
                wcpayment.setVisibility(View.GONE);
                break;

        }


    }
}
