package com.anshida.requestframe;

import android.content.Context;
import android.text.TextUtils;

import com.google.gson.GsonBuilder;
import com.anshida.requestframe.constant.Constant;
import com.orhanobut.logger.Logger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 */

public class RetrofitHelper {

    private Context mCntext;

    GsonConverterFactory factory = GsonConverterFactory.create(new GsonBuilder().create());
    private static RetrofitHelper instance = null;
    private Retrofit mRetrofit = null;
    private static int TIME_OUT = 15;

    public static RetrofitHelper getInstance(Context context, String baseUrl) {
//        if (instance == null) {
        instance = new RetrofitHelper(context, baseUrl);
//        }
        return instance;
    }

    private RetrofitHelper(Context mContext, String baseUrl) {
        mCntext = mContext;
        init(baseUrl);
    }

    private void init(String baseUrl) {
        if (TextUtils.isEmpty(baseUrl)) {
            resetApp(Constant.BASE_URL);
        } else {
            resetApp(baseUrl);
        }
    }

    private void resetApp(String baseUrl) {
        OkHttpClient.Builder builder = new OkHttpClient().newBuilder() ;
        builder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request newRequest = chain.request().newBuilder()
                        .removeHeader("User-Agent")
                        .addHeader("User-Agent","Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:0.9.4)")
                        .build() ;
                return chain.proceed(newRequest);
            }
        }) ;
        OkHttpClient client = builder.build() ;

        mRetrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(new OkHttpClient.Builder()
                        .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
                        .writeTimeout(TIME_OUT, TimeUnit.SECONDS)
                        .readTimeout(TIME_OUT, TimeUnit.SECONDS)
                        .addInterceptor(new LogInterceptor()).build())
                .addConverterFactory(factory)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
    }

    private static class LogInterceptor implements Interceptor {
        @Override
        public okhttp3.Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            Logger.i("request:", request.toString());
            okhttp3.Response response = chain.proceed(chain.request());
            okhttp3.MediaType mediaType = response.body().contentType();
            String content = response.body().string();
            Logger.i("response body:", content);
            if (response.body() != null) {
                if ("".equals(content)) {
                    content = "{\"result\": \"success\"}";
                }
                ResponseBody body = ResponseBody.create(mediaType, content);
                return response.newBuilder().body(body).build();

            } else {
                return response;
            }
        }
    }

    public RetrofitService getServer() {
        return mRetrofit.create(RetrofitService.class);
    }
}
