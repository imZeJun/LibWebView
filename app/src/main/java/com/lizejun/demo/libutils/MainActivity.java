package com.lizejun.demo.libutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lib.webview.RealWebView;
import com.lib.webview.hook.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = new WebView(createWebView());
        webView.loadUrl("https://www.qq.com");
    }

    public RealWebView createWebView() {
        return new RealWebView(this);
    }
}
