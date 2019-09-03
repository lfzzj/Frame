package com.anshida.network;

import android.annotation.SuppressLint;
import android.util.ArrayMap;

import java.util.Map;

/**
 * Create by LF
 * DATA 2019/7/3
 * Describe:
 */
@SuppressLint("NewApi")
public class RequestUtil {
    public static void getGanHuo(String type, int count, int page, NetWorkCallBack netWorkCallBack) {
        Map<String, Object> map = new ArrayMap<>();
        map.put("type", type);
        map.put("count", count);
        map.put("page", page);
        NetworkRequest.getGanHuo(map, netWorkCallBack);
    }


}
