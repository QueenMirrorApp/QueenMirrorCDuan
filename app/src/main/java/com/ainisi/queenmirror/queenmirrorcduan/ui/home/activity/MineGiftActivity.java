package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;


import butterknife.Bind;
import butterknife.OnClick;

//邀请有奖
public class MineGiftActivity extends BaseActivity {

    @Bind(R.id.title_title)
    TextView giftTitle;
    @Bind(R.id.titleimg_right)
    ImageView giftTitleImage;


    public static void startActivity(Context context) {
        context.startActivity(new Intent(context,MineGiftActivity.class));
    }
    @Override
    public int getLayoutId() {
        return R.layout.activity_mine_gift;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        giftTitle.setText("邀请好友");
        giftTitleImage.setImageResource(R.mipmap.icon_mine_share);
    }
    @OnClick({R.id.title_back,R.id.bt_confirm
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
