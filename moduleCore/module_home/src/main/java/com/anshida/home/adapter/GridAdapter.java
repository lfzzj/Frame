package com.anshida.home.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.anshida.home.R;
import com.anshida.home.bean.GridBean;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class GridAdapter extends BaseQuickAdapter<GridBean, BaseViewHolder> {


    public GridAdapter(@Nullable List<GridBean> data) {
        super(R.layout.module_home_item_grid, data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, GridBean item) {
        helper.setText(R.id.tv_title, item.getTitle())
                .addOnClickListener(R.id.cl_grid);

//        Glide.with(mContext).load(item.getUserAvatar())
//                .crossFade().into((ImageView) helper.getView(R.id.iv));
    }
}
