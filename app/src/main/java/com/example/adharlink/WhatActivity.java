package com.example.adharlink;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WhatActivity extends AppCompatActivity {
WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what);
        web= findViewById(R.id.webwhat);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https:hindi.webdunia.com/it-learning/aadhar-card-pan-card-link-119022100070_1.html");
    }
    @Override
    public void onBackPressed() {
        if(web.canGoBack())
        {
            web.goBack();
        }else{
            super.onBackPressed();}
    }
}
