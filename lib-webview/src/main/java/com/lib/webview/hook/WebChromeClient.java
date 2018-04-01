package com.lib.webview.hook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;

public class WebChromeClient {

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) { return false; }

    public void onProgressChanged(WebView view, int newProgress) { }

    public void onReceivedTitle(WebView view, String title) { }

    public void createWindow(final boolean dialog, final Message msg) { }

    public boolean onCreateWindow(WebView view, final boolean dialog, final boolean userGesture, final Message resultMsg) { return false; }

    public void onCloseWindow(WebView window) {}

    public void onRequestFocus(WebView view) { }
    
    public void onReceivedTouchIconUrl(WebView view, String url, boolean precomposed) { }
    
    public void onShowCustomView(View view, CustomViewCallback customeViewCallback) { }
    
    public void onHideCustomView() { }
    
    public void onExceededDatabaseQuota(String url, String databaseIdentifier, long quota, long estimatedDatabaseSize, long totalQuota, WebStorage.QuotaUpdater quotaUpdater) { }
    
    public void onReachedMaxAppCacheSize(long requiredStorage, long quota, WebStorage.QuotaUpdater quotaUpdater) { }

    public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) { }
     
    public void onGeolocationPermissionsHidePrompt() { }
    
    public void onPermissionRequest(PermissionRequest request) { }
    
    public Bitmap getDefaultVideoPoster() { return null; }
    
    public View getVideoLoadingProgressView() { return null; }
    
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, FileChooserParams fileChooserParams) { return false; }
    
    public void getVisitedHistory(ValueCallback<String[]> callback) { }

    public static class FileChooserParams {

        private android.webkit.WebChromeClient.FileChooserParams fileChooserParams;

        public FileChooserParams(android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
            this.fileChooserParams = fileChooserParams;
        }
    }

    public static class CustomViewCallback {

        private android.webkit.WebChromeClient.CustomViewCallback customViewCallback;

        public CustomViewCallback(android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
            this.customViewCallback = customViewCallback;
        }
    }

}
