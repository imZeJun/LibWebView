package com.lib.webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;

import com.lib.webview.hook.ConsoleMessage;
import com.lib.webview.hook.GeolocationPermissions;
import com.lib.webview.hook.PermissionRequest;
import com.lib.webview.hook.ValueCallback;
import com.lib.webview.hook.WebStorage;
import com.lib.webview.hook.WebView;
import com.lib.webview.hook.WebChromeClient;


public class WebKitWebChromeClient extends android.webkit.WebChromeClient {

    private WebChromeClient webChromeClient;

    public WebKitWebChromeClient(WebChromeClient webChromeClient) {
        this.webChromeClient = webChromeClient;
    }

    @Override
    public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        return webChromeClient.onConsoleMessage(new ConsoleMessage(consoleMessage));
    }

    @Override
    public boolean onCreateWindow(android.webkit.WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
        return webChromeClient.onCreateWindow(new WebView(view), isDialog, isUserGesture, resultMsg);
    }

    @Override
    public void onRequestFocus(android.webkit.WebView view) {
        webChromeClient.onRequestFocus(new WebView(view));
    }

    @Override
    public void onCloseWindow(android.webkit.WebView window) {
        webChromeClient.onCloseWindow(new WebView(window));
    }

    @Override
    public void onProgressChanged(android.webkit.WebView view, int newProgress) {
        webChromeClient.onProgressChanged(new WebView(view), newProgress);
    }

    @Override
    public void onReceivedTitle(android.webkit.WebView view, String title) {
        webChromeClient.onReceivedTitle(new WebView(view), title);
    }

    @Override
    public void onReceivedTouchIconUrl(android.webkit.WebView view, String url, boolean precomposed) {
        webChromeClient.onReceivedTouchIconUrl(new WebView(view), url, precomposed);
    }

    @Override
    public void onShowCustomView(View view, CustomViewCallback callback) {
        webChromeClient.onShowCustomView(view, new WebChromeClient.CustomViewCallback(callback));
    }

    @Override
    public void onHideCustomView() {
        webChromeClient.onHideCustomView();
    }

    @Override
    public void onExceededDatabaseQuota(String url, String databaseIdentifier, long quota, long estimatedDatabaseSize, long totalQuota, android.webkit.WebStorage.QuotaUpdater quotaUpdater) {
        webChromeClient.onExceededDatabaseQuota(url, databaseIdentifier, quota, estimatedDatabaseSize, totalQuota, new WebStorage.QuotaUpdater(quotaUpdater));
    }

    @Override
    public void onReachedMaxAppCacheSize(long requiredStorage, long quota, android.webkit.WebStorage.QuotaUpdater quotaUpdater) {
        webChromeClient.onReachedMaxAppCacheSize(requiredStorage, quota, new WebStorage.QuotaUpdater(quotaUpdater));
    }

    @Override
    public void onGeolocationPermissionsShowPrompt(String origin, android.webkit.GeolocationPermissions.Callback callback) {
        webChromeClient.onGeolocationPermissionsShowPrompt(origin, new GeolocationPermissions.Callback(callback));
    }

    @Override
    public void onGeolocationPermissionsHidePrompt() {
        webChromeClient.onGeolocationPermissionsHidePrompt();
    }

    @Override
    public void onPermissionRequest(android.webkit.PermissionRequest request) {
        webChromeClient.onPermissionRequest(new PermissionRequest(request));
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
    public boolean onShowFileChooser(android.webkit.WebView webView, android.webkit.ValueCallback filePathCallback, FileChooserParams fileChooserParams) {
        return webChromeClient.onShowFileChooser(new WebView(webView), new ValueCallback<Uri[]>(filePathCallback), new WebChromeClient.FileChooserParams(fileChooserParams));
    }

    @Override
    public void getVisitedHistory(android.webkit.ValueCallback callback) {
        webChromeClient.getVisitedHistory(new ValueCallback<String[]>(callback));
    }
}
