package com.aya.designsupportlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Collapsing Toolbar Layout.
 * Created by aya on 2016/11/28.
 */
public class CollapsingToolbarLayoutActivity extends AppCompatActivity implements OnRecyclerListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar_layout);

        setRecyclerView();
    }

    private void setRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        final List<String> list = new ArrayList<>();
        for (int i = 1; i <= 50 ; i++ ) {
            list.add(getString(R.string.next_page));
        }
        recyclerView.setAdapter(new RecyclerAdapter(getApplicationContext(), list, this));
    }

    @Override
    public void onRecyclerClicked(View view, int position) {

    }
}
