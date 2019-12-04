package com.example.adharlink;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LinkActivity extends AppCompatActivity {
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);
        web= findViewById(R.id.web);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://khabar.ndtv.com/topic/aadhar-card/news");
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
