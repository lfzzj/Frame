package com.anshida.network;

/**
 * Create by LF
 * DATA 2019/7/3
 * Describe:
 */
public interface BaseCallBack {
    void onSuccess(NetWorkResult result);

    void onFail(NetWorkResult result, String msg);

    void onBegin();

    void onEnd();
}
