package com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.fragment;

import android.content.Intent;
import android.view.View;

import com.ainisi.queenmirror.common.base.BaseFragment;
import com.ainisi.queenmirror.common.commonutils.ToastUtils;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.MessageActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.MineBeanActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.MineBeautyActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.MineCollectionActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.MineDiscountActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.MineEvaluateActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.MineFollowActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.MineGiftActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.MineMyServiceActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.MineMyWalletActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.MineProblemActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.MineQueenActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.MineFriendsActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.MineInvincibleActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.MineMyFootActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.MinePositionActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.activity.PortraitActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity.InstallActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity.MinePaymentsettingActivity;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.installactivity.MineSettingActivity;

import butterknife.OnClick;

/**
 * Created by EWorld on 2018/3/6.
 * 我的
 */

public class MineFragment extends BaseFragment {
    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_mine;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {

    }
    @OnClick({R.id.iv_title, R.id.iv_install, R.id.img_information,
            R.id.layout_collection, R.id.layout_follow, R.id.layout_foot, R.id.layout_evaluate, R.id.img_position, R.id.img_friends
            , R.id.ly_mine_discount, R.id.ly_mine_invincible, R.id.ly_mine_foot, R.id.ly_mine_bean, R.id.layout_gift, R.id.layout_beauty
            , R.id.layout_problem, R.id.lay_service,R.id.ly_mine_wallet

    })

    public void click(View view) {
        switch (view.getId()) {
            //更改头像和个人信息
            case R.id.iv_title:
                PortraitActivity.startActivity(getActivity());
                break;
            //设置
            case R.id.iv_install:
                InstallActivity.startActivity(getActivity());
                break;
            //信息
            case R.id.img_information:
                MessageActivity.startActivity(getActivity()
                );
                break;
            //我的收藏
            case R.id.layout_collection:
                MineCollectionActivity.startActivity(getActivity());
                break;
            //关注店铺
            case R.id.layout_follow:
                MineFollowActivity.startActivity(getActivity());
                break;
            //我的足迹
            case R.id.layout_foot:
                MineMyFootActivity.startActivity(getActivity());
                break;
            //评价
            case R.id.layout_evaluate:
                MineEvaluateActivity.startActivity(getActivity());
                break;
            //我的位置
            case R.id.img_position:
                startActivity(new Intent(getActivity(), MinePositionActivity.class));
                break;
            //我的好友
            case R.id.img_friends:
                startActivity(new Intent(getActivity(), MineFriendsActivity.class));
                break;
            //优惠券
            case R.id.ly_mine_discount:
                MineDiscountActivity.startActivity(getActivity());
                break;
            //无敌劵
            case R.id.ly_mine_invincible:
                MineDiscountActivity.startActivity(getActivity());
                break;
            //我的资产（女王卡）
            case R.id.ly_mine_foot:
                MineQueenActivity.startActivity(getActivity());
                break;
            //我的钱包
            case R.id.ly_mine_wallet:

                MineMyWalletActivity.startActivity(getActivity());
                break;
            //我的魔豆
            case R.id.ly_mine_bean:
                MineBeanActivity.startActivity(getActivity());
                break;
            //邀请有奖
            case R.id.layout_gift:
                MineGiftActivity.startActivity(getActivity());
                break;
            //成为美业人
            case R.id.layout_beauty:
                MineBeautyActivity.startActivity(getActivity());
                break;
            //帮助与反馈
            case R.id.layout_problem:
                getActivity().startActivity(new Intent(getActivity(), MineProblemActivity.class));
                break;
            //客服
            case R.id.lay_service:
                getActivity().startActivity(new Intent(getActivity(), MineMyServiceActivity.class));
                break;
            default:
                break;

        }

    }
}

