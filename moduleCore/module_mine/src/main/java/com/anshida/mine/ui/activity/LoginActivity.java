package com.anshida.mine.ui.activity;

import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.anshida.base.bases.BaseSkinActivity;
import com.anshida.base.constant.RouteConstant;
import com.anshida.mine.R;

/**
 * @author: LF
 * @data on 2019-08-13 15:49
 * @desc TODO 登录
 */
@Route(path = RouteConstant.Mine_Login_Activity)
public class LoginActivity extends BaseSkinActivity {
    private Button btnLogin;
    @Override
    public int getLayoutResID() {
        return R.layout.module_mine_activity_login;
    }

    @Override
    public void initView() {
        btnLogin = fd(R.id.btn_login);
    }

    @Override
    public void initListener() {
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v, int id) {
        if (id == R.id.btn_login) {

        }
    }
}
