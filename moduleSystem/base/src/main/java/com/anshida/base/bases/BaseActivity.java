package com.anshida.base.bases;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

import com.anshida.base.R;
import com.anshida.base.interfaces.UiOperation;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Create by LF
 * Data: 2019/3/23
 * Describe:
 */
public abstract class BaseActivity extends AppCompatActivity implements UiOperation {
    public String TAG = this.getClass().getSimpleName();
    public Context mContext;
    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 去掉标题栏
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        //去掉状态栏
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(getLayoutResID());    // 多态
        mContext = getApplicationContext();

        unbinder = ButterKnife.bind(this);
        initView();
        initListener();
        initData();

    }


    @Override
    public void onClick(View v) {
        int i = v.getId();// 处理共同操作
        if (i == R.id.base_btn_back) {
            finish();
        } else {// 如果单击的不是返回按钮，则还是由子类去作处理
            onClick(v, v.getId());
        }
    }

    protected <T extends View> T fd(@IdRes int id) {
        return findViewById(id);
    }


    @Override
    protected void onDestroy() {
        unbinder.unbind();
        super.onDestroy();
    }
}