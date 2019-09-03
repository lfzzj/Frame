package com.anshida.home.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

public class MultipleItem implements MultiItemEntity {
    public static final int BANNER = 1;
    public static final int GRID = 2;
    public static final int RECOMMEND = 3;
    public static final int BANNER1 = 4;
    public static final int RECOMMEND1 = 5;
    public static final int LIST_HORIZONTAL = 6;
    public static final int LIST_VERTICAL = 7;

    private int mItemType;

    public MultipleItem(int itemType) {
        this.mItemType = itemType;
    }

    @Override
    public int getItemType() {
        return mItemType;
    }
}
