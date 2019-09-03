package com.anshida.home.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.anshida.home.R;
import com.anshida.home.bean.GridBean;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * @author: LF
 * @data on 2019-08-13 14:48
 * @desc TODO
 */
public class ListHorizontalAdapter extends BaseQuickAdapter<GridBean, BaseViewHolder> {

    public ListHorizontalAdapter( @Nullable List<GridBean> data) {
        super(R.layout.module_home_item_grid, data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, GridBean item) {
        TextView tvTitle = helper.getView(R.id.tv_title);
        tvTitle.setText(item.getTitle());

    }
}
