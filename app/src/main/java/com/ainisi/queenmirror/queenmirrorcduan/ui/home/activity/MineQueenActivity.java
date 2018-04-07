package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity.RechargeActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity.SeeActivity;
import com.ainisi.queenmirror.queenmirrorcduan.utils.ViewPager;

import butterknife.Bind;
import butterknife.OnClick;

//女王卡
public class MineQueenActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView queentitle;

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, MineQueenActivity.class));
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_queen;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        queentitle.setText("我的女王卡");
    }

    @OnClick({R.id.title_back, R.id.bt_recharge,R.id.bt_see
    })
    public void click(View view) {

        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            //我要充值
            case  R.id.bt_recharge:
                RechargeActivity.startActivity(this);
            break;
            //查看订单记录
            case R.id.bt_see:
                SeeActivity.startActivity(this);
                break;
            default:
                break;

        }


    }
}
