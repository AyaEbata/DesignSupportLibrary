package com.aya.designsupportlibrary;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Navigation View.
 * Created by aya on 2016/12/16.
 */
public class NavigationViewActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_view);

        setToolbar();
        setDrawerToggle();
        setNavigationListener();
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        onNavigationClicked(toolbar);
    }

    private void onNavigationClicked(Toolbar toolbar) {
        toolbar.setNavigationOnClickListener(v -> {
            DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
            drawerLayout.openDrawer(GravityCompat.START);
        });
    }

    private void setDrawerToggle() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.drawer_open, R.string.drawer_close);
        drawerLayout.setDrawerListener(drawerToggle);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        drawerToggle.syncState();
    }

    private void setNavigationListener() {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        TextView text = (TextView) findViewById(R.id.select_text);

        switch (item.getItemId()) {
            case R.id.action_camera:
                text.setText(R.string.menu_camera);
                break;
            case R.id.action_edit:
                text.setText(R.string.menu_edit);
                break;
            case R.id.action_delete:
                text.setText(R.string.menu_delete);
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
