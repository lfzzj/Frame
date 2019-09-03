package com.anshida.home.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.anshida.home.R;
import com.anshida.home.bean.GridBean;
import com.anshida.home.bean.MultipleItem;
import com.anshida.home.loader.GlideImageLoader;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.orhanobut.logger.Logger;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;

import static com.anshida.home.bean.MultipleItem.*;


public class HomeAdapter extends BaseMultiItemQuickAdapter<MultipleItem, BaseViewHolder> {
    private Activity mActivity;

    public HomeAdapter(Activity activity, List<MultipleItem> data) {
        super(data);
        this.mActivity = activity;
//        setMultiTypeDelegate(new MultiTypeDelegate<MultipleItem>() {
//            @Override
//            protected int getItemType(MultipleItem multipleItem) {
//                return multipleItem.getItemType();
//            }
//        });
//
//        getMultiTypeDelegate()
//                .registerItemType(BANNER, R.layout.module_home_layout_banner)
//                .registerItemType(GRID, R.layout.module_home_layout_grid)
//                .registerItemType(LIST, R.layout.module_home_layout_list);
        initData();
        addItemType(BANNER, R.layout.module_home_layout_banner);
        addItemType(GRID, R.layout.module_home_layout_grid);
        addItemType(RECOMMEND, R.layout.module_home_layout_recommend);
        addItemType(BANNER1, R.layout.module_home_layout_banner1);
        addItemType(RECOMMEND1, R.layout.module_home_layout_recommend1);
        addItemType(LIST_HORIZONTAL, R.layout.module_home_layout_list_horizontal);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, MultipleItem item) {
        switch (item.getItemType()) {
            case BANNER:
                setBannerData(helper, item);
                break;
            case GRID:
                setGlideData(helper, item);
                break;
            case RECOMMEND:

                break;
            case BANNER1:
                setBanner1Data(helper, item);
                break;
            case LIST_HORIZONTAL:
                setListHorizontalData(helper, item);
                break;

        }
    }


    private ArrayList<String> images = new ArrayList<>();
     private ArrayList<String> titles = new ArrayList<>();
    private List<GridBean> glideBeans = new ArrayList<>();

    private void initData() {
        images.add("https://gss0.baidu.com/94o3dSag_xI4khGko9WTAnF6hhy/zhidao/wh%3D600%2C800/sign=e9873bfca944ad342eea8f81e09220cc/a8ec8a13632762d08fa73daea8ec08fa513dc602.jpg");
        images.add("https://gss0.baidu.com/94o3dSag_xI4khGko9WTAnF6hhy/zhidao/wh%3D600%2C800/sign=e9873bfca944ad342eea8f81e09220cc/a8ec8a13632762d08fa73daea8ec08fa513dc602.jpg");
        images.add("https://gss0.baidu.com/94o3dSag_xI4khGko9WTAnF6hhy/zhidao/wh%3D600%2C800/sign=e9873bfca944ad342eea8f81e09220cc/a8ec8a13632762d08fa73daea8ec08fa513dc602.jpg");
        images.add("https://gss0.baidu.com/94o3dSag_xI4khGko9WTAnF6hhy/zhidao/wh%3D600%2C800/sign=e9873bfca944ad342eea8f81e09220cc/a8ec8a13632762d08fa73daea8ec08fa513dc602.jpg");

        titles.add("我爱NBA");
        titles.add("我爱科比布莱恩特");
        titles.add("我爱NBA");
        titles.add("我爱科比布莱恩特");

        for (int i = 0; i < 8; i++) {
            glideBeans.add(new GridBean("测试" + i));
        }
    }


    private void setBannerData(BaseViewHolder helper, MultipleItem item) {
        setBanner((Banner) helper.getView(R.id.banner), images, titles);

    }


    private void setGlideData(BaseViewHolder helper, MultipleItem item) {
        RecyclerView mRecyclerView = helper.getView(R.id.recycler_view);
        GridAdapter mAdapter = new GridAdapter(glideBeans);
        final GridLayoutManager manager = new GridLayoutManager(mActivity, 4);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addOnItemTouchListener(new com.chad.library.adapter.base.listener.OnItemChildClickListener() {
            @Override
            public void onSimpleItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                Logger.d("--------" + position);
            }
        });
    }

    private void setBanner1Data(BaseViewHolder helper, MultipleItem item) {
        setBanner((Banner) helper.getView(R.id.banner), images, titles);
    }


    private void setBanner(Banner banner, List<?> imageUrls, List<String> titles) {
        //设置banner样式
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(imageUrls);
        //设置banner动画效果
//        banner.setBannerAnimation(Transformer.DepthPage);
        //设置标题集合（当banner样式有显示title时）
        banner.setBannerTitles(titles);
        //设置自动轮播，默认为true
//        banner.isAutoPlay(true);
        //设置轮播时间
//        banner.setDelayTime(1500);
        //设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(BannerConfig.RIGHT);
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
    }

    private void setListHorizontalData(BaseViewHolder helper, MultipleItem item) {
        RecyclerView mRecyclerView = helper.getView(R.id.recycler_view);

        List<GridBean> dates = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            dates.add(new GridBean("呵呵"+i));
        }
        ListHorizontalAdapter mAdapter = new ListHorizontalAdapter(dates);
        final LinearLayoutManager manager = new LinearLayoutManager(mActivity);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(mAdapter);

    }
}
