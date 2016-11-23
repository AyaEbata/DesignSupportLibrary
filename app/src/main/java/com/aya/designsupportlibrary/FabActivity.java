package com.aya.designsupportlibrary;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Floating Action Button.
 * Created by aya on 2016/11/23.
 */
public class FabActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab);

        setFab();
    }

    private void setFab() {
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(view -> Toast.makeText(this, R.string.fab_toast, Toast.LENGTH_LONG).show());
    }
}
