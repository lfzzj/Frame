package com.anshida.shopmalls;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

import com.anshida.base.bases.BaseSkinActivity;
import com.anshida.base.utils.RouteUtils;
import com.anshida.base.utils.SPUtil;

import butterknife.BindView;

/**
 * Create by LF
 * MultipleItem: 2019/4/2
 * Describe:引导页
 */
public class SplashActivity extends BaseSkinActivity {
    private long showTime = 3;//显示广告时长
    private static final int MSG_WHAT = 1;
    @BindView(R.id.tv_time)
    TextView mTvTime;

    @Override
    public int getLayoutResID() {
        return R.layout.app_activity_splash;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        //延迟showTime ms跳转到主页面
        handler.postDelayed(myRunnable, showTime * 1000);
        handler.sendEmptyMessage(MSG_WHAT);
    }

    @Override
    public void onClick(View v, int id) {

    }

    //创建Handler对象
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == MSG_WHAT) {

                mTvTime.setText("" + showTime);
                showTime--;//时间减一秒
                if (showTime > 0) {
                    handler.sendEmptyMessageDelayed(MSG_WHAT, 1000);
                }

            }

        }
    };

    //创建Runnable对象
    Runnable myRunnable = new Runnable() {
        @Override
        public void run() {
            enterMainActivity();
        }
    };

    private void enterMainActivity() {
        if (SPUtil.isFirstStart()) {
            RouteUtils.enterGuideActivity();
        }else {
            RouteUtils.enterMainActivity();
        }

        finish();
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }


}
