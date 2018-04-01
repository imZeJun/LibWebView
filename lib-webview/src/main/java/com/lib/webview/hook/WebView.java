package com.lib.webview.hook;

import com.lib.webview.QQWebChromeClient;
import com.lib.webview.QQWebViewClient;
import com.lib.webview.WebKitWebChromeClient;
import com.lib.webview.WebKitWebViewClient;
import com.lib.webview.annotation.WebType;
import com.lib.webview.sdk.WebSdk;

public class WebView {

    private android.webkit.WebView webKitView;
    private com.tencent.smtt.sdk.WebView qqWebView;

    public WebView(android.webkit.WebView webKitView) {
        this.webKitView = webKitView;
    }

    public WebView(com.tencent.smtt.sdk.WebView webKitView) {
        this.qqWebView = webKitView;
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        switch (WebSdk.getInstance().getWebType()) {
            case WebType.WEB_KIT:
                webKitView.setWebChromeClient(new WebKitWebChromeClient(webChromeClient));
                break;
            case WebType.QQ:
                qqWebView.setWebChromeClient(new QQWebChromeClient(webChromeClient));
                break;
            case WebType.UC:
            default:
                break;
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        switch (WebSdk.getInstance().getWebType()) {
            case WebType.WEB_KIT:
                webKitView.setWebViewClient(new WebKitWebViewClient(webViewClient));
                break;
            case WebType.QQ:
                qqWebView.setWebViewClient(new QQWebViewClient(webViewClient));
                break;
            case WebType.UC:
            default:
                break;
        }

    }

    public android.webkit.WebView getRealWebView() {
        return webKitView;
    }

    public void loadUrl(String url) {
        switch (WebSdk.getInstance().getWebType()) {
            case WebType.WEB_KIT:
                webKitView.loadUrl(url);
                break;
            case WebType.QQ:
                qqWebView.loadUrl(url);
                break;
            case WebType.UC:
            default:
                break;
        }
    }

    public void destroy() {
        switch (WebSdk.getInstance().getWebType()) {
            case WebType.WEB_KIT:
                webKitView.destroy();
                break;
            case WebType.QQ:
                qqWebView.destroy();
                break;
            case WebType.UC:
            default:
                break;
        }
    }

    public WebSettings getSettings() {
        switch (WebSdk.getInstance().getWebType()) {
            case WebType.WEB_KIT:
                new WebSettings(webKitView.getSettings());
                break;
            case WebType.QQ:
                new WebSettings(qqWebView.getSettings());
                break;
            case WebType.UC:
            default:
                break;
        }
        return null;
    }

    public void goBack() {
        switch (WebSdk.getInstance().getWebType()) {
            case WebType.WEB_KIT:
                webKitView.goBack();
                break;
            case WebType.QQ:
                qqWebView.goBack();
                break;
            case WebType.UC:
            default:
                break;
        }
    }

    public void goForward() {
        switch (WebSdk.getInstance().getWebType()) {
            case WebType.WEB_KIT:
                webKitView.goForward();
                break;
            case WebType.QQ:
                qqWebView.goForward();
                break;
            case WebType.UC:
            default:
                break;
        }
    }

    public String getUrl() {
        switch (WebSdk.getInstance().getWebType()) {
            case WebType.WEB_KIT:
                return webKitView.getUrl();
            case WebType.QQ:
                return qqWebView.getUrl();
            case WebType.UC:
            default:
                break;
        }
        return null;
    }

    public String getOriginalUrl() {
        switch (WebSdk.getInstance().getWebType()) {
            case WebType.WEB_KIT:
                return webKitView.getOriginalUrl();
            case WebType.QQ:
                return qqWebView.getOriginalUrl();
            case WebType.UC:
            default:
                break;
        }
        return null;
    }

}
