package com.mzc.app.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends BaseActivity {
    private FragmentManager mFragmentManager;
    private Fragment mCurrentFragment;


    @Override
    protected void init() {
        super.init();
        mFragmentManager = getSupportFragmentManager();
    }

    @Override
    protected void setUpView() {
        initDefaultFragment();
    }

    @Override
    protected int setLayoutResourceID() {
        return R.layout.activity_main;
    }

    private void initDefaultFragment() {
        mCurrentFragment = ViewUtils.createFragment(GanHuoFragment.class);

        mFragmentManager.beginTransaction().add(R.id.frame_content, mCurrentFragment).commit();
    }

}
