package com.lib.webview.hook;

import com.lib.webview.RealWebChromeClient;
import com.lib.webview.RealWebViewClient;

public class WebView {

    private android.webkit.WebView webView;

    public WebView(android.webkit.WebView webView) {
        this.webView = webView;
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        webView.setWebChromeClient(new RealWebChromeClient(webChromeClient));
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        webView.setWebViewClient(new RealWebViewClient(webViewClient));
    }

    public android.webkit.WebView getRealWebView() {
        return webView;
    }

    public void loadUrl(String url) {
        webView.loadUrl(url);
    }

    public void destroy() {
        webView.destroy();
    }

    public WebSettings getSettings() {
        return new WebSettings(webView.getSettings());
    }

    public void goBack() {
        webView.goBack();
    }

    public void goForward() {
        webView.goForward();
    }

}
