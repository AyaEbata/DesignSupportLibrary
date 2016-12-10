package com.aya.designsupportlibrary;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * View Pager Adapter.
 * Created by aya on 2016/12/10.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ViewPagerFragment();
            case 1:
                return new ViewPagerFragment();
            case 2:
                return new ViewPagerFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "ページ" + (position + 1);
    }

}
