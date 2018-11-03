package com.dexterlabs.khand.engineeringmanager;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.dexterlabs.khand.engineeringmanager.SecondYear.QuestionPaperSE;
import com.dexterlabs.khand.engineeringmanager.ThirdYear.QuestionPaperTE;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class webview extends AppCompatActivity {

    WebView webview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        //Banner Ads
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);




        if (getIntent() != null) {


            String info = getIntent().getStringExtra("url");
            webview1 = (WebView) findViewById(R.id.webview);
//            webview1.setWebViewClient(new WebViewClient());
//            webview1.loadUrl(info);
//            WebSettings webSettings = webview1.getSettings();
//            webSettings.setJavaScriptEnabled(true);

            /////////////////////////

//            webview1.setWebViewClient(new WebViewClient());
//            webview1.getSettings().setBuiltInZoomControls(true);
//            webview1.getSettings().setJavaScriptEnabled(true);
//            webview1.getSettings().setDomStorageEnabled(true);
//            webview1.getSettings().setDatabaseEnabled(true);
//            webview1.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
//            webview1.getSettings().setAppCacheEnabled(true);


//            webview1 = (WebView) findViewById(R.id.webview);
//            webview1.getSettings().setJavaScriptEnabled(true);

//
//            webview1 = (WebView) findViewById(R.id.webview);
//            webView.getSettings().setJavaScriptEnabled(true);

            webview1 = findViewById(R.id.webview);
            WebSettings webSettings = webview1.getSettings();
            webSettings.setJavaScriptEnabled(true);
//            wView.loadUrl("https://en.wikipedia.org");
            webview1.loadUrl(info);
            webview1.setWebViewClient(new WebViewClient());





        }


        //Banner Ads
//        AdView mAdView = (AdView) findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);


    }


}
