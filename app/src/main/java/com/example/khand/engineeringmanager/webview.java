package com.example.khand.engineeringmanager;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

import com.example.khand.engineeringmanager.SecondYear.QuestionPaperSE;
import com.example.khand.engineeringmanager.ThirdYear.QuestionPaperTE;

public class webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        if (getIntent() != null) {
            final WebView webview1;

            String info = getIntent().getStringExtra("url");
            webview1 = (WebView) findViewById(R.id.webview);
            webview1.getSettings().setJavaScriptEnabled(true);
            webview1.loadUrl(info);

        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();

    }
}
