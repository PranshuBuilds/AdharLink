package com.example.adharlink;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    CardView c1;
    CardView c2;
    CardView c3;
    CardView c4;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1= (CardView)findViewById(R.id.c1);
        c2= (CardView)findViewById(R.id.c2);
        c3= (CardView)findViewById(R.id.c3);
        c4= (CardView)findViewById(R.id.c4);

        drawerLayout= findViewById(R.id.drawer);
        toolbar= findViewById(R.id.tool);
        navigationView = findViewById(R.id.nav);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawerOpen,R.string.drawerClose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        toolbar.setTitle("Adhar Link");
        navigationView.setNavigationItemSelectedListener(this);


        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LinkActivity.class));
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WhyActivity.class));
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ErrorActivity.class));
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WhatActivity.class));
            }
        });

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.home:
                Toast.makeText(this, "Home page", Toast.LENGTH_SHORT).show();
                break;
            case R.id.share:
                Intent intn =new Intent(Intent.ACTION_SEND);
                intn.setType("text/plain");
                String shareBody= "DownLoad my leatest app";
                String shareSub="My Adhar App";
                intn.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                intn.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(intn,"SHARE"));
                break;
            case R.id.contact:
                Toast.makeText(this, "conta page", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                Toast.makeText(this, "about page", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Privacy:
                Toast.makeText(this, "policy page", Toast.LENGTH_SHORT).show();
                break;
            case R.id.exit:
                Toast.makeText(this, "exit page", Toast.LENGTH_SHORT).show();
                break;
        }


        return false;
    }
}
