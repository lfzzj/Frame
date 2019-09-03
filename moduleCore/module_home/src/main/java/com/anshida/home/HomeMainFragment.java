package com.anshida.home;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.anshida.base.bases.BaseFragment;
import com.anshida.base.constant.RouteConstant;
import com.anshida.home.adapter.HomeAdapter;
import com.anshida.home.bean.MultipleItem;
import com.anshida.home.util.DataServer;

import java.util.List;

/**
 * Create by LF
 * MultipleItem: 2019/3/23
 * Describe:首页
 */

@Route(path = RouteConstant.Home_Fragment_Main)
public class HomeMainFragment extends BaseFragment {

    private RecyclerView mRecyclerView;

    @Override
    public int getLayoutResID() {
        return R.layout.module_home_fragment_main;
    }

    @Override
    public void initView() {
        mRecyclerView = fv(R.id.rv_main);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        List<MultipleItem> data = DataServer.getMultipleItemData();
        HomeAdapter mAdapter = new HomeAdapter(getActivity(),data);
        final LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void onClick(View v, int id) {

    }
}
