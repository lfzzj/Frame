package com.anshida.home.util;

import com.anshida.home.bean.MultipleItem;

import java.util.ArrayList;
import java.util.List;

public class DataServer {

    public static List<MultipleItem> getMultipleItemData() {
        List<MultipleItem> list = new ArrayList<>();
        for (int i = 0; i <= 0; i++) {
            list.add(new MultipleItem(MultipleItem.BANNER));
            list.add(new MultipleItem(MultipleItem.GRID));
            list.add(new MultipleItem(MultipleItem.RECOMMEND));
            list.add(new MultipleItem(MultipleItem.BANNER1));
            list.add(new MultipleItem(MultipleItem.RECOMMEND1));
            list.add(new MultipleItem(MultipleItem.LIST_HORIZONTAL));
        }

        return list;
    }
}
