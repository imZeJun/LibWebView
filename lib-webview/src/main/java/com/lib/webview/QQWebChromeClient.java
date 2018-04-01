package com.lib.webview;


import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;

import com.lib.webview.hook.ValueCallback;
import com.lib.webview.hook.WebStorage;
import com.lib.webview.hook.WebView;
import com.lib.webview.hook.qq.QQConsoleMessage;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.sdk.WebChromeClient;

public class QQWebChromeClient extends WebChromeClient {

    private com.lib.webview.hook.WebChromeClient webChromeClient;

    public QQWebChromeClient(com.lib.webview.hook.WebChromeClient webChromeClient) {
        this.webChromeClient = webChromeClient;
    }

    @Override
    public boolean onConsoleMessage(com.tencent.smtt.export.external.interfaces.ConsoleMessage consoleMessage) {
        return webChromeClient.onConsoleMessage(new QQConsoleMessage(consoleMessage));
    }

    @Override
    public boolean onCreateWindow(com.tencent.smtt.sdk.WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
        return webChromeClient.onCreateWindow(new WebView(view), isDialog, isUserGesture, resultMsg);
    }

    @Override
    public void onRequestFocus(com.tencent.smtt.sdk.WebView view) {
        webChromeClient.onRequestFocus(new WebView(view));
    }

    @Override
    public void onCloseWindow(com.tencent.smtt.sdk.WebView window) {
        webChromeClient.onCloseWindow(new WebView(window));
    }

    @Override
    public void onProgressChanged(com.tencent.smtt.sdk.WebView view, int newProgress) {
        webChromeClient.onProgressChanged(new WebView(view), newProgress);
    }

    @Override
    public void onReceivedTitle(com.tencent.smtt.sdk.WebView view, String title) {
        webChromeClient.onReceivedTitle(new WebView(view), title);
    }

    @Override
    public void onReceivedTouchIconUrl(com.tencent.smtt.sdk.WebView view, String url, boolean precomposed) {
        webChromeClient.onReceivedTouchIconUrl(new WebView(view), url, precomposed);
    }

    @Override
    public void onShowCustomView(View view, IX5WebChromeClient.CustomViewCallback callback) {
        webChromeClient.onShowCustomView(view, new com.lib.webview.hook.WebChromeClient.CustomViewCallback(callback));
    }


    @Override
    public void onHideCustomView() {
        webChromeClient.onHideCustomView();
    }

    @Override
    public void onExceededDatabaseQuota(String url, String databaseIdentifier, long quota, long estimatedDatabaseSize, long totalQuota, com.tencent.smtt.sdk.WebStorage.QuotaUpdater quotaUpdater) {
        webChromeClient.onExceededDatabaseQuota(url, databaseIdentifier, quota, estimatedDatabaseSize, totalQuota, new WebStorage.QuotaUpdater(quotaUpdater));
    }

    @Override
    public void onReachedMaxAppCacheSize(long requiredStorage, long quota, com.tencent.smtt.sdk.WebStorage.QuotaUpdater quotaUpdater) {
        webChromeClient.onReachedMaxAppCacheSize(requiredStorage, quota, new WebStorage.QuotaUpdater(quotaUpdater));
    }

    @Override
    public void onGeolocationPermissionsShowPrompt(String s, GeolocationPermissionsCallback geolocationPermissionsCallback) {
        super.onGeolocationPermissionsShowPrompt(s, geolocationPermissionsCallback);
    }


    @Override
    public void onGeolocationPermissionsHidePrompt() {
        webChromeClient.onGeolocationPermissionsHidePrompt();
    }

    @Override
    public Bitmap getDefaultVideoPoster() {
        return webChromeClient.getDefaultVideoPoster();
    }

    @Override
    public View getVideoLoadingProgressView() {
        return webChromeClient.getVideoLoadingProgressView();
    }

    @Override
    public boolean onShowFileChooser(com.tencent.smtt.sdk.WebView webView, com.tencent.smtt.sdk.ValueCallback<Uri[]> filePathCallback, FileChooserParams fileChooserParams) {
        return webChromeClient.onShowFileChooser(new WebView(webView), new ValueCallback<Uri[]>(filePathCallback), new com.lib.webview.hook.WebChromeClient.FileChooserParams(fileChooserParams));
    }

    @Override
    public void getVisitedHistory(com.tencent.smtt.sdk.ValueCallback<String[]> callback) {
        webChromeClient.getVisitedHistory(new ValueCallback<String[]>(callback));
    }

}
