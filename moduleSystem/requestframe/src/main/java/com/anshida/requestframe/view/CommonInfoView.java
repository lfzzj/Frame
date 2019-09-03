package com.anshida.requestframe.view;

import com.anshida.requestframe.base.View;

/**
 * @data on 2018/3/21 10:21
 * @describe: 公共
 */

public interface CommonInfoView<T> extends View {
    void onSuccess(T info);
}
