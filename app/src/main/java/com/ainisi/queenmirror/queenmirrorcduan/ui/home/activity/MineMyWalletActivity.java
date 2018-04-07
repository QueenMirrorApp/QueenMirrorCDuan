package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity.InstallActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity.MinePaymentsettingActivity;


import butterknife.Bind;
import butterknife.OnClick;

//我的钱包
public class MineMyWalletActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView wallTitle;
    @Bind(R.id.tv_balance)
    TextView tvbalance;
    @Bind(R.id.tv_addcart)
    TextView tvaddcart;
    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, MineMyWalletActivity.class));
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_my_wallet;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        wallTitle.setText(R.string.my_wallet);

    }

    @OnClick({R.id.title_back, R.id.rc_name, R.id.rc_setup, R.id.img_addcart,R.id.img_balance
    })
    public void click(View view) {

        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            //添加银行卡号
            case R.id.img_addcart:
                Intent intent=new Intent(this, MineAddcartActivity.class);
                intent.putExtra("name",tvaddcart.getText().toString().trim());
                startActivity(intent);
                break;
            //余额
            case R.id.img_balance:

                Intent intent1=new Intent(this,MineBalanceActivity.class);
                intent1.putExtra("name",tvbalance.getText().toString().trim());
                startActivity(intent1);
                break;
            //实名认证
            case R.id.rc_name:

                break;

            //支付设置
            case R.id.rc_setup:
                MinePaymentsettingActivity.startActivity(this);
                break;
            default:
                break;

        }


    }
}
