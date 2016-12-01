package com.aya.designsupportlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Tab Layout.
 * Created by aya on 2016/12/01.
 */
public class TabLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        setFixingView();
    }

    private void setFixingView() {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment, new FixingTabLayoutFragment())
                .commit();
    }

}
