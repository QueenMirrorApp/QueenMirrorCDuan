package com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.UserpassActivity;

import butterknife.Bind;
import butterknife.OnClick;
//隐私
public class ReplaceActivity extends BaseActivity {
    @Bind(R.id.title_title)
    TextView replacetitle;
    @Bind(R.id.dynamic_unselected)
    ImageView undynamic;
    @Bind(R.id.dynamic_selected)
    ImageView dynamic;
    @Bind(R.id.iv_unstrange)
    ImageView unstrange;
    @Bind(R.id.iv_strange)
    ImageView strange;
    @Bind(R.id.tv_me)
    TextView metext;
    @Bind(R.id.tv_her)
    TextView hertext;

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context,ReplaceActivity.class));
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_replace;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        replacetitle.setText("隐私");
    }

    @OnClick({R.id.dynamic_selected,R.id.dynamic_unselected,R.id.iv_unstrange,R.id.iv_strange,R.id.title_back
     ,R.id.layout_me,R.id.layout_her
    })
    public void click(View view) {

        switch (view.getId()) {
            case R.id.title_back:
                finish();
                break;
            case R.id.dynamic_selected:
                undynamic.setVisibility(View.VISIBLE);
                dynamic.setVisibility(View.GONE);
                break;
            case R.id.dynamic_unselected:
                undynamic.setVisibility(View.GONE);
                dynamic.setVisibility(View.VISIBLE);
                break;
            case R.id.iv_unstrange:
                strange.setVisibility(View.VISIBLE);
                unstrange.setVisibility(View.GONE);
                break;
            case R.id.iv_strange:
                strange.setVisibility(View.GONE);
                unstrange.setVisibility(View.VISIBLE);
                break;
            case R.id.layout_me:
                Intent intent=new Intent(this,MeDynamicActivity.class);
                intent.putExtra("dynamic",metext.getText().toString().trim());
                startActivity(intent);
                break;
            case R.id.layout_her:
                Intent intent1=new Intent(this,HerDynamicActivity.class);
                intent1.putExtra("dynamic",hertext.getText().toString().trim());
                startActivity(intent1);
                break;

        }


    }
}
