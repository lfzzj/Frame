package com.anshida.requestframe.presenter;

import android.content.Context;

import com.anshida.requestframe.base.BasePresenter;
import com.anshida.requestframe.model.RecommandModel;
import com.anshida.requestframe.view.CommonInfoView;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 推荐列表
 */
public class RecommandListPresenter extends BasePresenter<CommonInfoView> {
    private CommonInfoView mView;
    private RecommandModel mInfo;

    public RecommandListPresenter(Context mContext, CommonInfoView view) {
        super(mContext, view);
        this.mView = view;
    }


    public void requestData(String method,  int num) {
        mCompositeSubscription.add(manager.getRecommandList(method, num)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RecommandModel>() {
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
                    public void onNext(RecommandModel info) {
                        mInfo = info;
                    }
                })
        );
    }
}
