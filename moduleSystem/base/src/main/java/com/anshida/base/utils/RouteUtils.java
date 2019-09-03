package com.anshida.base.utils;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.launcher.ARouter;

import static com.anshida.base.constant.RouteConstant.*;

/**
 * Create by LF
 * Data: 2019/3/23
 * Describe:路由的工具类
 */
public class RouteUtils {


    public static final String ROUTE_BUNDLE = "bundle";

    /**
     * 获取当前使用的fragment
     *
     * @param tag
     * @return
     */
    public static Fragment getCurFragment(String tag) {
        Fragment fragment = (Fragment) ARouter.getInstance().build(getFragmentMain(tag)).navigation();
        return fragment;
    }

    /**
     * 根据tag 获取首页不同的fragment
     *
     * @param tag
     * @return
     */
    private static String getFragmentMain(String tag) {
        if (tag.equals(TAG_FRAGMENT_HOME)) {
            return Home_Fragment_Main;
        } else if (tag.equals(TAG_FRAGMENT_SORT)) {
            return Sort_Fragment_Main;
        } else if (tag.equals(TAG_FRAGMENT_CART)) {
            return Cart_Fragment_Main;
        } else {
            return Mine_Fragment_Main;
        }
    }

    /*---------------------------------------------------*/
    //进入主界面
    public static void enterMainActivity() {
        openActivity(App_Main_Activity);
    }

    //进入引导页
    public static void enterGuideActivity() {
        openActivity(App_Guide_Activity);
    }

    //进入登录页
    public static void enterLoginActivity() {
        openActivity(Mine_Login_Activity);
    }

    //进入商品详情页
    public static void enterGoodsDetailActivity() {
        openActivity(Home_GoodsDetail_Activity);
    }


    /*---------------------------------------------------*/

    /**
     * 根据路径打开activity
     *
     * @param path
     */
    private static void openActivity(String path) {
        ARouter.getInstance().build(path).navigation();
    }

    /**
     * 携带参数的参数activity
     *
     * @param path
     * @param bundle
     */
    public static void openActivity(String path, Bundle bundle) {
        ARouter.getInstance().build(path)
                .withBundle(ROUTE_BUNDLE, bundle)
                .navigation();
    }


}
