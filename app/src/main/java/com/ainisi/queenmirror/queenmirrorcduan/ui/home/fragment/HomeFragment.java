package com.ainisi.queenmirror.queenmirrorcduan.ui.home.fragment;

import com.ainisi.queenmirror.common.base.BaseFragment;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.GlideImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by EWorld on 2018/3/6.
 */

public class HomeFragment extends BaseFragment {
    @Bind(R.id.banner)
    Banner banner;
    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_home;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {
       List<String> images = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            images.add("http://test.meiyaoni.com.cn/Uploads/adver/2017-05-11/5914298d12262.png");
        }
        banner.setImageLoader(new GlideImageLoader());
        banner.setImages(images);
        banner.start();
    }
}
