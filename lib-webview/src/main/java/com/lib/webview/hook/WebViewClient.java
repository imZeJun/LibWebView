package com.lib.webview.hook;


import android.graphics.Bitmap;
import android.os.Message;
import android.view.KeyEvent;

public class WebViewClient {

    public void onPageStarted(WebView view, String url, Bitmap favicon) {}

    public void onPageFinished(WebView webView, String url) {}

    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) { return false; }

    public void onLoadResource(WebView view, String url) { }

    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {}

    public void onFormResubmission(WebView view, Message dontResend, Message resend) {}

    public void doUpdateVisitedHistory(WebView view, String url, boolean isReload) { }

    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {}

    public void onReceivedClientCertRequest(WebView view, ClientCertRequest request) { }

    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) { return null; }

    public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) { return false; }

    public void onUnhandledKeyEvent(WebView view, KeyEvent event) {}

    public void onReceivedLoginRequest(WebView view, String realm, String account, String args) {}

    public void onReceivedHttpAuthRequest(WebView view, HttpAuthHandler handler, String host, String realm) {}
}
