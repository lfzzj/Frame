package com.anshida.base.utils;


import com.anshida.base.constant.SPConstants;
import com.blankj.utilcode.util.SPUtils;

public class SPUtil {

    /**
     * 验证程序是否第一次启动
     */
    public static boolean isFirstStart() {
        return SPUtils.getInstance().getBoolean(SPConstants.SP_IS_FIRST_START, true);
    }

    public static void setFirstStart() {
        SPUtils.getInstance().put(SPConstants.SP_IS_FIRST_START, false);
    }

    /**
     * 是否登录
     * @return
     */
    public static boolean isLogin() {
        return SPUtils.getInstance().getBoolean(SPConstants.SP_IS_LOGIN, false);
    }

    public static void setLoginState(Boolean state) {
        SPUtils.getInstance().put(SPConstants.SP_IS_LOGIN, state);
    }


}
