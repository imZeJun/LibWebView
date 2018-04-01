package com.lib.webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;

import com.lib.webview.hook.ClientCertRequest;
import com.lib.webview.hook.HttpAuthHandler;
import com.lib.webview.hook.SslErrorHandler;
import com.lib.webview.hook.WebResourceError;
import com.lib.webview.hook.WebResourceRequest;
import com.lib.webview.hook.WebView;
import com.lib.webview.hook.WebViewClient;

public class WebKitWebViewClient extends android.webkit.WebViewClient {

    private WebViewClient webViewClient;

    public WebKitWebViewClient(WebViewClient webViewClient) {
        this.webViewClient = webViewClient;
    }

    @Override
    public void onPageStarted(android.webkit.WebView view, String url, Bitmap favicon) {
        webViewClient.onPageStarted(new WebView(view), url, favicon);
    }

    @Override
    public void onPageFinished(android.webkit.WebView view, String url) {
        webViewClient.onPageFinished(new WebView(view), url);
    }

    @Override
    public boolean shouldOverrideUrlLoading(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
        return webViewClient.shouldOverrideUrlLoading(new WebView(view), new WebResourceRequest(request));
    }

    @Override
    public void onLoadResource(android.webkit.WebView view, String url) {
        webViewClient.onLoadResource(new WebView(view), url);
    }

    @Override
    public void onReceivedError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) {
        webViewClient.onReceivedError(new WebView(view), new WebResourceRequest(request), new WebResourceError(error));
    }

    @Override
    public void onFormResubmission(android.webkit.WebView view, Message dontResend, Message resend) {
        webViewClient.onFormResubmission(new WebView(view), dontResend, resend);
    }

    @Override
    public void doUpdateVisitedHistory(android.webkit.WebView view, String url, boolean isReload) {
        webViewClient.doUpdateVisitedHistory(new WebView(view), url, isReload);
    }

    @Override
    public void onReceivedSslError(android.webkit.WebView view, android.webkit.SslErrorHandler handler, SslError error) {
        webViewClient.onReceivedSslError(new WebView(view), new SslErrorHandler(handler), new com.lib.webview.hook.SslError(error));
    }

    @Override
    public void onReceivedClientCertRequest(android.webkit.WebView view, android.webkit.ClientCertRequest request) {
        webViewClient.onReceivedClientCertRequest(new WebView(view), new ClientCertRequest(request));
    }

    @Override
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
        return webViewClient.shouldInterceptRequest(new WebView(view), new WebResourceRequest(request)).toWebkitWebResourceResponse();
    }

    @Override
    public boolean shouldOverrideKeyEvent(android.webkit.WebView view, KeyEvent event) {
        return webViewClient.shouldOverrideKeyEvent(new WebView(view), event);
    }

    @Override
    public void onUnhandledKeyEvent(android.webkit.WebView view, KeyEvent event) {
        webViewClient.onUnhandledKeyEvent(new WebView(view), event);
    }

    @Override
    public void onReceivedLoginRequest(android.webkit.WebView view, String realm, String account, String args) {
        webViewClient.onReceivedLoginRequest(new WebView(view), realm, account, args);
    }

    @Override
    public void onReceivedHttpAuthRequest(android.webkit.WebView view, android.webkit.HttpAuthHandler handler, String host, String realm) {
        webViewClient.onReceivedHttpAuthRequest(new WebView(view), new HttpAuthHandler(handler), host, realm);
    }
}
