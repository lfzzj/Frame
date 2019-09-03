package com.anshida.network;

import com.anshida.network.model.GanHuo;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Create by LF
 * DATA 2019/7/3
 * Describe:
 */
public interface ServiceApi {

    @GET(Api.GET_GANHUO)
    Observable<NetWorkResult> getGanHuo(@QueryMap Map<String, Object> map);


    @GET("api/data/{type}/{count}/{page}")
    Observable<GanHuo> getGanHuo(
            @Path("type") String type,
            @Path("count") int count,
            @Path("page") int page
    );
}
