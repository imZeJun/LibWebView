package com.lib.webview;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.KeyEvent;

import com.lib.webview.hook.ClientCertRequest;
import com.lib.webview.hook.HttpAuthHandler;
import com.lib.webview.hook.SslErrorHandler;
import com.lib.webview.hook.WebResourceError;
import com.lib.webview.hook.WebResourceRequest;
import com.lib.webview.hook.WebView;
import com.lib.webview.hook.qq.QQClientCertRequest;
import com.lib.webview.hook.qq.QQHttpAuthHandler;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.sdk.WebViewClient;

public class QQWebViewClient extends WebViewClient {

    private com.lib.webview.hook.WebViewClient webViewClient;

    public QQWebViewClient(com.lib.webview.hook.WebViewClient webViewClient) {
        this.webViewClient = webViewClient;
    }

    @Override
    public void onPageStarted(com.tencent.smtt.sdk.WebView view, String url, Bitmap favicon) {
        webViewClient.onPageStarted(new WebView(view), url, favicon);
    }

    @Override
    public void onPageFinished(com.tencent.smtt.sdk.WebView view, String url) {
        webViewClient.onPageFinished(new WebView(view), url);
    }

    @Override
    public boolean shouldOverrideUrlLoading(com.tencent.smtt.sdk.WebView view, com.tencent.smtt.export.external.interfaces.WebResourceRequest request) {
        return webViewClient.shouldOverrideUrlLoading(new WebView(view), new WebResourceRequest(request));
    }

    @Override
    public void onLoadResource(com.tencent.smtt.sdk.WebView view, String url) {
        webViewClient.onLoadResource(new WebView(view), url);
    }

    @Override
    public void onReceivedError(com.tencent.smtt.sdk.WebView view, com.tencent.smtt.export.external.interfaces.WebResourceRequest request, com.tencent.smtt.export.external.interfaces.WebResourceError error) {
        webViewClient.onReceivedError(new WebView(view), new WebResourceRequest(request), new WebResourceError(error));
    }

    @Override
    public void onFormResubmission(com.tencent.smtt.sdk.WebView view, Message dontResend, Message resend) {
        webViewClient.onFormResubmission(new WebView(view), dontResend, resend);
    }

    @Override
    public void doUpdateVisitedHistory(com.tencent.smtt.sdk.WebView view, String url, boolean isReload) {
        webViewClient.doUpdateVisitedHistory(new WebView(view), url, isReload);
    }

    @Override
    public void onReceivedSslError(com.tencent.smtt.sdk.WebView view, com.tencent.smtt.export.external.interfaces.SslErrorHandler handler, com.tencent.smtt.export.external.interfaces.SslError sslError) {
        webViewClient.onReceivedSslError(new WebView(view), new SslErrorHandler(handler), new com.lib.webview.hook.SslError(sslError));
    }

    @Override
    public void onReceivedClientCertRequest(com.tencent.smtt.sdk.WebView view, com.tencent.smtt.export.external.interfaces.ClientCertRequest request) {
        webViewClient.onReceivedClientCertRequest(new WebView(view), new QQClientCertRequest(request));
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(com.tencent.smtt.sdk.WebView view, com.tencent.smtt.export.external.interfaces.WebResourceRequest request) {
        return webViewClient.shouldInterceptRequest(new WebView(view), new WebResourceRequest(request)).toQQWebResourceResponse();
    }

    @Override
    public boolean shouldOverrideKeyEvent(com.tencent.smtt.sdk.WebView view, KeyEvent event) {
        return webViewClient.shouldOverrideKeyEvent(new WebView(view), event);
    }

    @Override
    public void onUnhandledKeyEvent(com.tencent.smtt.sdk.WebView view, KeyEvent event) {
        webViewClient.onUnhandledKeyEvent(new WebView(view), event);
    }

    @Override
    public void onReceivedLoginRequest(com.tencent.smtt.sdk.WebView view, String realm, String account, String args) {
        webViewClient.onReceivedLoginRequest(new WebView(view), realm, account, args);
    }

    @Override
    public void onReceivedHttpAuthRequest(com.tencent.smtt.sdk.WebView view, com.tencent.smtt.export.external.interfaces.HttpAuthHandler handler, String host, String realm) {
        webViewClient.onReceivedHttpAuthRequest(new WebView(view), new QQHttpAuthHandler(handler), host, realm);
    }

}
