package com.aya.designsupportlibrary;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Bottom Navigation  View.
 * Created by aya on 2016/12/10.
 */
public class BottomNavigationViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_view);

        onClickedMenu();
    }

    private void onClickedMenu() {
        TextView text = (TextView) findViewById(R.id.text);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.action_search:
                    text.setText(R.string.menu_search);
                    break;
                case R.id.action_add:
                    text.setText(R.string.menu_add);
                    break;
                case R.id.action_settings:
                    text.setText(R.string.menu_settings);
                    break;
            }
            return true;
        });
    }

}
