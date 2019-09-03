package com.anshida.shopmalls;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.anshida.base.bases.BaseSkinActivity;
import com.anshida.base.constant.RouteConstant;
import com.anshida.base.utils.RouteUtils;
import com.anshida.base.utils.SPUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * 引导页
 */
@Route(path = RouteConstant.App_Guide_Activity)
public class GuideActivity extends BaseSkinActivity {
    @BindView(R.id.vp_guide)
    ViewPager mViewPager;
    @BindView(R.id.btn_start)
    Button btnStart;
    @BindView(R.id.ll_container)
    LinearLayout llContainer;
    @BindView(R.id.iv_red_point)
    ImageView ivRedPoint;

    private int[] mImageIds = {
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background};

    private List<ImageView> mIvList;
    private int mPointDis;

    @Override
    public int getLayoutResID() {
        return R.layout.app_activity_guide;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {
        btnStart.setOnClickListener(this);
    }

    @Override
    public void initData() {
        initGuideData();
        mViewPager.setAdapter(new GuideAdapter());
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                int leftMargin = (int) (mPointDis * positionOffset) + position * mPointDis;
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) ivRedPoint.getLayoutParams();
                params.leftMargin = leftMargin;
                ivRedPoint.setLayoutParams(params);

                if (position == mIvList.size() - 1) {
                    btnStart.setVisibility(View.VISIBLE);
                } else {
                    btnStart.setVisibility(View.GONE);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        ivRedPoint.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                //移除监听，避免重复回调
                ivRedPoint.getViewTreeObserver().removeGlobalOnLayoutListener(this);

                mPointDis = llContainer.getChildAt(1).getLeft() - llContainer.getChildAt(0).getLeft();

            }
        });

    }

    @Override
    public void onClick(View v, int id) {
        if (v == btnStart) {
            RouteUtils.enterMainActivity();
            SPUtil.setFirstStart();
            finish();
        }
    }

    private void initGuideData() {
        mIvList = new ArrayList<>();
        for (int i = 0; i < mImageIds.length; i++) {
            ImageView view = new ImageView(this);
            view.setBackgroundResource(mImageIds[i]);
            mIvList.add(view);

            ImageView point = new ImageView(this);
            point.setBackgroundResource(R.drawable.app_shape_point_gray);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            if (i > 0) {
                params.leftMargin = 20;
            }

            point.setLayoutParams(params);

            llContainer.addView(point);
        }
    }

    class GuideAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return mIvList.size();
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            ImageView view = mIvList.get(position);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((View) object);
        }
    }
}
