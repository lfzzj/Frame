package com.anshida.requestframe.presenter;

import android.content.Context;

import com.anshida.requestframe.base.BasePresenter;
import com.anshida.requestframe.model.GanHuo;
import com.anshida.requestframe.view.CommonInfoView;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class GanHuoPresenter extends BasePresenter<CommonInfoView> {
    private CommonInfoView mView;
    private GanHuo mInfo;

    public GanHuoPresenter(Context mContext, CommonInfoView view) {
        super(mContext, view);
        this.mView = view;
    }


    public void requestData(String type, int count, int page) {
        mCompositeSubscription.add(manager.getGanHuo(type, count, page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GanHuo>() {
                    @Override
                    public void onCompleted() {
                        if (mInfo != null) {
                            mView.onSuccess(mInfo);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        mView.onError("请求失败！！");
                    }

                    @Override
                    public void onNext(GanHuo info) {
                        mInfo = info;
                    }
                })
        );
    }
}
