package com.anshida.base.bases;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anshida.base.R;
import com.anshida.base.interfaces.UiOperation;
import com.anshida.base.utils.StatusBarUtil;


/**
 * Create by LF
 * Data: 2019/3/23
 * Describe:
 */
public abstract class BaseFragment extends Fragment implements UiOperation {
    protected View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(getLayoutResID(), null);
        initView();
        initListener();
        initData();

        return rootView;
    }

    protected void setStatusBar() {
        //这里做了两件事情，1.使状态栏透明并使contentView填充到状态栏 2.预留出状态栏的位置，防止界面上的控件离顶部靠的太近。这样就可以实现开头说的第二种情况的沉浸式状态栏了
        StatusBarUtil.setTransparent(getActivity());
    }

    /**
     * 查找View，这个方法可以省去我们的强转操作
     *
     * @param id
     * @return
     */
    public <T> T fv(int id) {
        @SuppressWarnings("unchecked")
        T view = (T) rootView.findViewById(id);
        return view;
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();// 处理共同操作
        if (i == R.id.base_btn_back) {
            getActivity().finish();

        } else {// 如果单击的不是返回按钮，则还是由子类去作处理
            onClick(v, v.getId());

        }
    }

}
