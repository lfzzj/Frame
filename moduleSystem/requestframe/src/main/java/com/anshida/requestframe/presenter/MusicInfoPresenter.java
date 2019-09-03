package com.anshida.requestframe.presenter;

import android.content.Context;

import com.anshida.requestframe.base.BasePresenter;
import com.anshida.requestframe.constant.Constant;
import com.anshida.requestframe.model.MusicInfo;
import com.anshida.requestframe.view.CommonInfoView;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MusicInfoPresenter extends BasePresenter<CommonInfoView> {
    private CommonInfoView mView;
    private MusicInfo mInfo;

    public MusicInfoPresenter(Context mContext, CommonInfoView view) {
        super(mContext, view, Constant.BASE_MUSIC_URL);
        this.mView = view;
    }


    public void requestData(String method, String songid) {
        mCompositeSubscription.add(manager.getMusicInfo(method,songid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MusicInfo>() {
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
                    public void onNext(MusicInfo info) {
                        mInfo = info;
                    }
                })
        );
    }
}
