package com.anshida.shopmalls;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.blankj.utilcode.util.Utils;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

import io.realm.Realm;
import me.jessyan.autosize.AutoSizeConfig;


/**
 * Create by LF
 * MultipleItem: 2019/3/22
 * Describe:
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ARouterInit();
        initLogger();

        Utils.init(this);

        Realm.init(this);


        AutoSizeConfig.getInstance().setExcludeFontScale(true);
    }


    /**
     * 路由初始化
     */
    private void ARouterInit() {
        if (BuildConfig.DEBUG) {
            // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
            ARouter.printStackTrace(); // 打印日志的时候打印线程堆栈
        }
        ARouter.init(this); // 尽可能早，推荐在Application中初始化
    }

    /**
     * 日志初始化
     */
    private void initLogger() {
        //1.
//        Logger.addLogAdapter(new AndroidLogAdapter());

        //2.
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)  // 是否显示线程信息 默认显示 上图Thread Infrom的位置
                .methodCount(0)         // 展示方法的行数 默认是2  上图Method的行数
                .methodOffset(7)        // 内部方法调用向上偏移的行数 默认是0
                //.logStrategy(customLog) // 改变log打印的策略一种是写本地，一种是logcat显示 默认是后者（当然也可以自己定义）
                .tag("MYTAG")   // 自定义全局tag 默认：PRETTY_LOGGER
                .build();
        //在Application中初始化一下
        //Logger.addLogAdapter(new AndroidLogAdapter());
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));
        //文本方式存放
        //Logger.addLogAdapter(new DiskLogAdapter(formatStrategy));
        //Logger.addLogAdapter(new DiskLogAdapter());

        //3.
        //按csv格式存粹
//        FormatStrategy csvFormatStrategy = CsvFormatStrategy.newBuilder()
//                .tag("young")
//                .build();
//
//        Logger.addLogAdapter(new DiskLogAdapter(csvFormatStrategy));
    }

}
