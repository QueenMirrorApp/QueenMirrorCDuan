package com.ainisi.queenmirror.queenmirrorcduan.ui.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioButton;
import com.ainisi.queenmirror.common.base.BaseActivity;
import com.ainisi.queenmirror.queenmirrorcduan.R;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.fragment.HomeFragment;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.fragment.MasterFragment;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.fragment.MineFragment;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.fragment.OrderFragment;
import com.ainisi.queenmirror.queenmirrorcduan.ui.home.home.fragment.ShopMallFragment;
import butterknife.Bind;
import butterknife.OnClick;

/**
 * 主页面
 */
public class MainActivity extends BaseActivity {
    //首页
    private HomeFragment mHomeFragment;
    //商城
    private ShopMallFragment mShopMallFragment;
    //订单
    private OrderFragment mOrderFragment;
    //大咖
    private MasterFragment mMasterFragment;
    //我的
    private MineFragment mMineFragment;
    private FragmentManager fm;
    @Bind(R.id.rb_home)
    RadioButton mHomeBtn;
    @Bind(R.id.rb_shop_mall)
    RadioButton mShopMall;
    @Bind(R.id.rb_order)
    RadioButton mOrder;
    @Bind(R.id.rb_master)
    RadioButton mMaster;
    @Bind(R.id.rb_mine)
    RadioButton mMine;

    @Override
    public int getLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        mHomeFragment = new HomeFragment();
        fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fl_main_content_layout, mHomeFragment);
        transaction.commit();
        mHomeBtn.setChecked(true);

    }

    @OnClick({R.id.rb_home, R.id.rb_shop_mall, R.id.rb_order, R.id.rb_master, R.id.rb_mine})
    public void click(View view) {
        FragmentTransaction transaction = fm.beginTransaction();
        switch (view.getId()) {
            case R.id.rb_home:
                mHomeBtn.setChecked(true);
                if (mHomeFragment == null) {
                    mHomeFragment = new HomeFragment();
                    transaction.add(R.id.fl_main_content_layout, mHomeFragment);
                } else {
                    transaction.show(mHomeFragment);
                }
                hideFragment(mShopMallFragment, transaction);
                hideFragment(mOrderFragment, transaction);
                hideFragment(mMasterFragment, transaction);
                hideFragment(mMineFragment, transaction);
                break;
            case R.id.rb_shop_mall:
                mShopMall.setChecked(true);
                if (mShopMallFragment == null) {
                    mShopMallFragment = new ShopMallFragment();
                    transaction.add(R.id.fl_main_content_layout, mShopMallFragment);
                } else {
                    transaction.show(mShopMallFragment);
                }
                hideFragment(mHomeFragment, transaction);
                hideFragment(mOrderFragment, transaction);
                hideFragment(mMasterFragment, transaction);
                hideFragment(mMineFragment, transaction);
                break;
            case R.id.rb_order:
                mOrder.setChecked(true);
                if (mOrderFragment == null) {
                    mOrderFragment = new OrderFragment();
                    transaction.add(R.id.fl_main_content_layout, mOrderFragment);
                } else {
                    transaction.show(mOrderFragment);
                }
                hideFragment(mHomeFragment, transaction);
                hideFragment(mShopMallFragment, transaction);
                hideFragment(mMasterFragment, transaction);
                hideFragment(mMineFragment, transaction);
                break;
            case R.id.rb_master:
                mMaster.setChecked(true);
                if (mMasterFragment == null) {
                    mMasterFragment = new MasterFragment();
                    transaction.add(R.id.fl_main_content_layout, mMasterFragment);
                } else {
                    transaction.show(mMasterFragment);
                }
                hideFragment(mHomeFragment, transaction);
                hideFragment(mShopMallFragment, transaction);
                hideFragment(mOrderFragment, transaction);
                hideFragment(mMineFragment, transaction);
                break;
            case R.id.rb_mine:
                mMine.setChecked(true);
                if (mMineFragment == null) {
                    mMineFragment = new MineFragment();
                    transaction.add(R.id.fl_main_content_layout, mMineFragment);
                } else {
                    transaction.show(mMineFragment);
                }
                hideFragment(mHomeFragment, transaction);
                hideFragment(mShopMallFragment, transaction);
                hideFragment(mOrderFragment, transaction);
                hideFragment(mMasterFragment, transaction);
                break;
            default:
                break;
        }
        //提交事务
        transaction.commit();

    }

    private void hideFragment(Fragment fragment, FragmentTransaction transaction) {
        if (null != fragment) {
            transaction.hide(fragment);
        }
    }
}
