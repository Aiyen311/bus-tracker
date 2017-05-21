/*
*   Created by Srikur Kanuparthy and Adithya Iyengar
*   Copyright 2017 All Rights Reserved
*/

package srikurk.jcpsbusfinder;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if(!checkLogin()){

        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public static boolean checkLogin(){
        return false;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_bus) {
            // Open my buses
        } else if (id == R.id.nav_map) {
            //Open maps
            Intent mapIntent = new Intent(this, MapActivity.class);
            startActivity(mapIntent);
        } else if (id == R.id.nav_school) {
            //Open my schools
            Intent schoolIntent = new Intent(this, SchoolActivity.class);
            startActivity(schoolIntent);
        } else if (id == R.id.nav_stop) {
            //Open my stops
        } else if (id == R.id.nav_settings) {
            //Open settings
        } else if (id == R.id.nav_logout) {
            //Logout

            final Intent intent = new Intent(this, LogOutActivity.class);

            final ProgressDialog logoutDialog = new ProgressDialog(this, R.style.AppTheme_Dark_Dialog);
            logoutDialog.setIndeterminate(true);
            logoutDialog.setMessage("Logging out!");
            logoutDialog.show();

            new android.os.Handler().postDelayed(
                    new Runnable() {
                        public void run() {
                            logoutDialog.dismiss();
                            startActivity(intent);
                        }
                    }, 2000);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
