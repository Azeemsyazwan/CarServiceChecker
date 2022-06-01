package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class socmed extends AppCompatActivity {

    private WebView webView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socmed);


        webView2 = (WebView) findViewById(R.id.webview2);
        webView2.setWebViewClient(new WebViewClient());
        webView2.loadUrl("https://www.instagram.com/carservicechecker/");
        WebSettings webSettings = webView2.getSettings();
        webSettings.setJavaScriptEnabled(true);



    }
    @Override
    public void onBackPressed() {
        if (webView2.canGoBack()) {
            webView2.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
