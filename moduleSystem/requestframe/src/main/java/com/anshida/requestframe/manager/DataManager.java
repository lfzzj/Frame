package com.anshida.requestframe.manager;

import android.content.Context;

import com.anshida.requestframe.RetrofitHelper;
import com.anshida.requestframe.RetrofitService;
import com.anshida.requestframe.model.GanHuo;
import com.anshida.requestframe.model.MusicInfo;
import com.anshida.requestframe.model.MusicModel;
import com.anshida.requestframe.model.RecommandModel;

import rx.Observable;


/**
 * Created by win764-1 on 2016/12/12.
 */

public class DataManager {
    private RetrofitService mRetrofitService;

    public DataManager(Context context, String baseUrl) {
        this.mRetrofitService = RetrofitHelper.getInstance(context, baseUrl).getServer();
    }

    public Observable<GanHuo> getGanHuo(String type, int count, int page) {
        return mRetrofitService.getGanHuo(type, count, page);
    }

    public Observable<MusicModel> getMusicList(String method, int type, int size) {
        return mRetrofitService.getMusicList(method, type, size);
    }

    public Observable<RecommandModel> getRecommandList(String method,   int num) {
        return mRetrofitService.getRecommandList(method,  num);
    }

    public Observable<MusicInfo> getMusicInfo(String method, String songid) {
        return mRetrofitService.getMusicInfo(method,  songid);
    }


}
