package com.anshida.network;

import com.blankj.utilcode.util.StringUtils;

import io.reactivex.disposables.Disposable;

/**
 * Create by LF
 * DATA 2019/7/3
 * Describe:
 */
public class NetWorkCallBack {
    private BaseCallBack callBack = null;

    public NetWorkCallBack(BaseCallBack callBack) {
        this.callBack = callBack;
    }

    public NetworkObserver getNetWorkSubscriber() {
        return networkObserver;
    }

    private NetworkObserver networkObserver = new NetworkObserver() {

        @Override
        public void onSubscribe(Disposable d) {
            super.onSubscribe(d);
            if (callBack != null) callBack.onBegin();
        }

        @Override
        public void onComplete() {
            super.onComplete();
            if (callBack != null) callBack.onEnd();
        }

        @Override
        public void onError(Throwable e) {
            try {
                if (callBack != null) {
                    String msg = e.getMessage();
                    callBack.onFail(null, msg);
                    callBack.onEnd();
                }
            } catch (Throwable t) {
                t.printStackTrace();
            }
        }

        @Override
        public void onNext(NetWorkResult response) {
            try {
                if (response.isOk()) {
                    //请求成功
                    if (callBack != null)
                        callBack.onSuccess(response); //返回请求结果
                } else {
                    //请求失败
                    String message = "请求失败";
                    if (!StringUtils.isEmpty(response.getCause())) {
                        message = response.getCause();
                    }
//                    if (!StringUtil.isBlank(result.getError().getMessage())) {
//                        message = result.getError().getMessage();
//                    }
                 /*   if (result.getError().getCode() == ErrorCode.LOGIN_TOKEN_INVALID.getType()) {
                        //token过期
                        //身份异常,重新登录
                        // ReloginUtil.relogin();
                    }*/
                    if (callBack != null)
                        callBack.onFail(response, message);
                }
            } catch (Exception e) {
                //此处打印网络请求的异常
                e.printStackTrace();
            }
        }
    };
}
