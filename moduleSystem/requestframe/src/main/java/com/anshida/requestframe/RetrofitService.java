package com.anshida.requestframe;


import com.anshida.requestframe.model.GanHuo;
import com.anshida.requestframe.model.MusicInfo;
import com.anshida.requestframe.model.MusicModel;
import com.anshida.requestframe.model.RecommandModel;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 *
 */
public interface RetrofitService {

    @GET("api/data/{type}/{count}/{page}")
    Observable<GanHuo> getGanHuo(
            @Path("type") String type,
            @Path("count") int count,
            @Path("page") int page
    );

    //获取音乐列表
    @GET("v1/restserver/ting")
    Observable<MusicModel> getMusicList(
            @Query("method") String method,
            @Query("type") int type,
            @Query("size") int size
    );

    //获取推荐列表
    @GET("v1/restserver/ting")
    Observable<RecommandModel> getRecommandList(
            @Query("method") String method,
            @Query("num") int num
    );

    //获取歌曲信息
    @GET("v1/restserver/ting")
    Observable<MusicInfo> getMusicInfo(
            @Query("method") String method,
            @Query("songid") String songid
    );
}
