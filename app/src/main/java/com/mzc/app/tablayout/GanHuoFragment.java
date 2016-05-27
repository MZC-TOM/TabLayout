package com.mzc.app.tablayout;

import android.os.AsyncTask;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

/**
 * Created by Mzc on 2016/5/26.
 */
public class GanHuoFragment extends BaseFragment {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private String[] mTitles;
    private GanHuoPagerAdapter mAdapter;
    @Override
    protected int setLayoutResourceID() {
        return R.layout.fm_gan_huo;
    }

    @Override
    protected void setUpView() {
        super.setUpView();
        mTitles = new String[]{"all", "休息视频", "福利", "Android", "iOS", "拓展资源", "前端", "瞎推荐"};
        mTabLayout = $(R.id.sliding_tabs);
        mViewPager = $(R.id.viewpager);
        mAdapter = new GanHuoPagerAdapter(getChildFragmentManager(), mTitles);

//        for (int i = 0; i < mTitles.length; i++) {
//            mTabLayout.addTab(mTabLayout.newTab());
//        }
        mViewPager.setAdapter(mAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        for (int i = 0; i < mTitles.length; i++) {
            mTabLayout.getTabAt(i).setText(mTitles[i]);
        }
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
//                Toast.makeText(getActivity(),"位置:"+mTitles[position],Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
//        mAdapter = new GanHuoPagerAdapter(getChildFragmentManager(), mTitles);
    }

    private class SetAdapterTask extends AsyncTask<Void, Void, Void> {
        protected Void doInBackground(Void... params) {
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {

            if (mAdapter != null) {
                mViewPager.setAdapter(mAdapter);
                mTabLayout.setupWithViewPager(mViewPager);
            }
        }
    }

}
