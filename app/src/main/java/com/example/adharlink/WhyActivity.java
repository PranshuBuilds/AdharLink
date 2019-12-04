package com.example.adharlink;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WhyActivity extends AppCompatActivity {
WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_why);
        web= findViewById(R.id.webwhy);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://economictimes.indiatimes.com/hindi/wealth/tax/how-to-check-if-aadhaar-is-linked-with-pan/articleshow/68022041.cms?from=mdr");
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
