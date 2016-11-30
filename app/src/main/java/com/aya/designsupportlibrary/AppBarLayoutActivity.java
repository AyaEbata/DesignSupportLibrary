package com.aya.designsupportlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

/**
 * App Bar Layout.
 * Created by aya on 2016/11/26.
 */
public class AppBarLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar_layout);

        setToolbar();
        setButton();
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void setButton() {
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(view -> startActivity(new Intent(this, CoordinatorLayoutActivity.class)));
    }

}
