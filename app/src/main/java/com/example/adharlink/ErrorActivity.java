package com.example.adharlink;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ErrorActivity extends AppCompatActivity {
WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);
        web= findViewById(R.id.weberror);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://economictimes.indiatimes.com/6-documents-that-must-be-linked-with-your-aadhar-card/tomorrowmakersshow/70240225.cms");
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
