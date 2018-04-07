package com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity.OrderMessageActivity;

import butterknife.Bind;
import butterknife.OnClick;
//消息
public class MessageActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView title;



    public static void startActivity(Context context) {
        context.startActivity(new Intent(context,MessageActivity.class));
    }
    @Override
    public int getLayoutId() {
        return R.layout.activity_meage;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        initText();


    }

    private void initText() {
        title.setText(R.string.message_center);
        title.setTextColor(ContextCompat.getColor(this,R.color.alpha_95_black));
    }

    @OnClick({R.id.title_back,R.id.layout_order
    })
    public void click(View view) {

        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            case R.id.layout_order:
                OrderMessageActivity.startActivity(MessageActivity.this);
                break;
            default:
                break;

        }


    }
}
