package com.anshida.network;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Create by LF
 * DATA 2019/7/3
 * Describe:
 */
public class RxUtils {
    //单例
    public static RxUtils rxUtils;

    private CompositeDisposable compositeDisposable = new CompositeDisposable();


    private RxUtils(){}

    public static RxUtils getInstance(){
        if (rxUtils == null ){
            rxUtils = new RxUtils();
        }
        return  rxUtils;
    }

    public void clearSubscription() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.clear();
        }
    }

    public void unSubscription() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    public void addSubscription(Disposable disposable) {
        if (compositeDisposable != null) {
            compositeDisposable.add(disposable);
        }
    }
}
