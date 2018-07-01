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

public class webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        if (getIntent() != null) {
            final WebView webview1;

            String info = getIntent().getStringExtra("url");
            webview1 = (WebView) findViewById(R.id.webview);
            webview1.setWebViewClient(new WebViewClient());
            webview1.loadUrl(info);
            WebSettings webSettings = webview1.getSettings();
            webSettings.setJavaScriptEnabled(true);

            //




        }

    }


}
