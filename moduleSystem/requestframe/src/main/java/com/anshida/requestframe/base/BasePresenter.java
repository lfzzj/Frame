package com.anshida.requestframe.base;

import android.content.Context;
import android.content.Intent;

import com.anshida.requestframe.constant.Constant;
import com.anshida.requestframe.manager.DataManager;

import rx.subscriptions.CompositeSubscription;

/**
 * @data on 2018/3/21 11:53
 * @describe:
 */

public abstract class BasePresenter<V extends View> implements Presenter {
    public DataManager manager;
    public CompositeSubscription mCompositeSubscription;
    private V mView;
    private Context mContext;
    private String baseUrl = Constant.BASE_URL;


    public BasePresenter(Context mContext, View view) {
        this.mContext = mContext;
        attachView(view);
        onCreate();
    }

    public BasePresenter(Context mContext, View view, String baseUrl) {
        this.mContext = mContext;
        attachView(view);
        this.baseUrl = baseUrl;
        onCreate();
    }


    @Override
    public void onCreate() {
        manager = new DataManager(mContext, baseUrl);
        mCompositeSubscription = new CompositeSubscription();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {
        if (mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
        }
    }

    @Override
    public void pause() {

    }

    @Override
    public void attachView(View view) {
        mView = (V) view;
    }

    @Override
    public void attachIncomingIntent(Intent intent) {

    }

}
