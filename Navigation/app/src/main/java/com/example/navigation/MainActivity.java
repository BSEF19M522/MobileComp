package com.example.navigation;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {
private DrawerLayout drawerLayout;
    Toolbar tb;
    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);

        }
        else
        {
            super.onBackPressed();
        }
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar tb=findViewById(R.id.tool);
        setSupportActionBar(tb);
        drawerLayout=findViewById(R.id.Drawerlay);
        actionBarDrawerToggle=new ActionBarDrawerToggle(this, drawerLayout,tb,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();


    }



}