package com.aya.designsupportlibrary;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aya.designsupportlibrary.adapters.ViewPagerAdapter;

/**
 * View Pager and Tab Layout.
 * Created by aya on 2016/12/10.
 */
public class ViewPagerTabLayoutFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_view_pager_tab_layout, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setViewPager(view);
    }

    private void setViewPager(View view) {
        FragmentManager manager = getActivity().getSupportFragmentManager();
        ViewPagerAdapter adapter = new ViewPagerAdapter(manager);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        setTabLayout(view, viewPager);
    }

    private void setTabLayout(View view, ViewPager viewPager) {
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }

}
