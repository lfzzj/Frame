package com.anshida.shopmalls;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.anshida.base.bases.BaseSkinActivity;
import com.anshida.base.constant.RouteConstant;
import com.anshida.base.utils.RouteUtils;
import com.anshida.base.utils.SPUtil;

import butterknife.BindView;

import static com.anshida.base.constant.RouteConstant.TAG_FRAGMENT_CART;
import static com.anshida.base.constant.RouteConstant.TAG_FRAGMENT_HOME;
import static com.anshida.base.constant.RouteConstant.TAG_FRAGMENT_MINE;
import static com.anshida.base.constant.RouteConstant.TAG_FRAGMENT_SORT;

@Route(path = RouteConstant.App_Main_Activity)
public class MainActivity extends BaseSkinActivity {

    @BindView(R.id.rg_tab)
    RadioGroup rgTab;
    @BindView(R.id.rb_home)
    RadioButton tabHome;
    @BindView(R.id.rb_sort)
    RadioButton tabSort;
    @BindView(R.id.rb_cart)
    RadioButton tabCart;
    @BindView(R.id.rb_mine)
    RadioButton tabMine;

    private String curTag;

    private FragmentManager supportFragmentManager;
    private Fragment curFragment;


    @Override
    public int getLayoutResID() {
        return R.layout.app_activity_main;
    }

    @Override
    public void initView() {
    }

    @Override
    public void initListener() {
        rgTab.setOnCheckedChangeListener(mOnCheckedChangeListener);
    }

    @Override
    public void initData() {
        supportFragmentManager = getSupportFragmentManager();
        curTag = TAG_FRAGMENT_HOME;
        switchTab(R.id.rb_home);

    }

    @Override
    public void onClick(View v, int id) {


    }

    private RadioGroup.OnCheckedChangeListener mOnCheckedChangeListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switchTab(checkedId);
        }
    };


    /**
     * 切换Tab
     *
     * @param id
     */
    private void switchTab(int id) {

        FragmentTransaction ft = supportFragmentManager.beginTransaction();
        hideAllFragment(ft);
        String tag = TAG_FRAGMENT_HOME;
        switch (id) {
            case R.id.rb_home:
                tag = TAG_FRAGMENT_HOME;
                break;
            case R.id.rb_sort:
                tag = TAG_FRAGMENT_SORT;
                break;
            case R.id.rb_cart:
                if (SPUtil.isLogin()) {
                    tag = TAG_FRAGMENT_CART;
                } else {
                    RouteUtils.enterLoginActivity();
                    reductTabState(curTag);
                    return;
                }
                break;
            case R.id.rb_mine:
                if (SPUtil.isLogin()) {
                    tag = TAG_FRAGMENT_MINE;
                } else {
                    RouteUtils.enterLoginActivity();
                    reductTabState(curTag);
                    return;
                }
                break;
        }
        addFragment(ft, tag);
        curTag = tag;
        if (curFragment != null) {
            ft.show(curFragment).commit();
        }

    }

    /**
     * 还原tab状态
     * @param curTag
     */
    private void reductTabState(String curTag) {
        if (TAG_FRAGMENT_HOME.equals(curTag)){
            tabHome.setChecked(true);
        }else if (TAG_FRAGMENT_SORT.equals(curTag)){
            tabSort.setChecked(true);
        }else if (TAG_FRAGMENT_CART.equals(curTag)){
            tabCart.setChecked(true);
        }else if (TAG_FRAGMENT_MINE.equals(curTag)){
            tabMine.setChecked(true);
        }

    }


    /**
     * 添加fragment
     *
     * @param ft
     * @param TAG
     */
    private void addFragment(FragmentTransaction ft, String TAG) {
        Fragment mFragment = supportFragmentManager.findFragmentByTag(TAG);
        if (mFragment == null) {
            mFragment = RouteUtils.getCurFragment(TAG);
            if (mFragment != null) {
                ft.add(R.id.fl_main, mFragment, TAG);
            }
        }
        curFragment = mFragment;
    }

    /**
     * 隐藏所有
     *
     * @param ft
     */
    private void hideAllFragment(FragmentTransaction ft) {
        hintFragment(ft, TAG_FRAGMENT_HOME);
        hintFragment(ft, TAG_FRAGMENT_SORT);
        hintFragment(ft, TAG_FRAGMENT_CART);
        hintFragment(ft, TAG_FRAGMENT_MINE);

    }

    private void hintFragment(FragmentTransaction ft, String tag) {
        Fragment fragment;
        fragment = supportFragmentManager.findFragmentByTag(tag);
        if (fragment != null) {
            ft.hide(fragment);
        }
    }


}
