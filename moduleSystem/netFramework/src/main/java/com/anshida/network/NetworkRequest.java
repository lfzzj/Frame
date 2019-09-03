package com.anshida.network;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Create by LF
 * DATA 2019/7/3
 * Describe:网络请求
 */
public class NetworkRequest {
    //observable  被观察者
    //observer    观察者

    private static <T> void addObservable(Observable<T> observable, Observer<T> observer) {
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);

    }


    /**
     * 停止所有请求
     */
    public static void stop() {
        RxUtils.getInstance().unSubscription();
    }


    public static void getGanHuo(Map<String, Object> map, NetWorkCallBack netWorkCallBack) {
        addObservable(NetWork.getApi().getGanHuo(map), netWorkCallBack.getNetWorkSubscriber());
    }

//    public static void getGanHuo(String type,int count,int page, NetWorkCallBack netWorkCallBack) {
//        addObservable(NetWork.getApi().getGanHuo(type,count,page), netWorkCallBack.getNetWorkSubscriber());
//    }


}
