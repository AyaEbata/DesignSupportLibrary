package com.aya.designsupportlibrary;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Scroll Tab Layout.
 * Created by aya on 2016/12/01.
 */
public class ScrollTabLayoutFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_scroll_tab_layout, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setTabLayout(view);
        setButton(view);
    }

    private void setTabLayout(View view) {
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        for (int i = 0; i < 10; i++) {
            tabLayout.addTab(tabLayout.newTab().setText((R.string.tab)));
        }
    }

    private void setButton(View view) {
        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(v ->
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment, new ViewPagerTabLayoutFragment())
                        .commit()
        );
    }

}
