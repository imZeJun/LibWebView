package com.lib.webview.hook;


public class WebSettings {

    private android.webkit.WebSettings webSettings;
    private com.tencent.smtt.sdk.WebSettings qqWebSettings;

    public WebSettings(android.webkit.WebSettings webSettings) {
        this.webSettings = webSettings;
    }

    public WebSettings(com.tencent.smtt.sdk.WebSettings qqWebSettings) {
        this.qqWebSettings = qqWebSettings;
    }
}
