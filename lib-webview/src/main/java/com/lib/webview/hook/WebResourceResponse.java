package com.lib.webview.hook;

public class WebResourceResponse {

    private android.webkit.WebResourceResponse webResourceResponse;

    public WebResourceResponse(android.webkit.WebResourceResponse webResourceResponse) {
        this.webResourceResponse = webResourceResponse;
    }

    public android.webkit.WebResourceResponse toWebkitWebResourceResponse() {
        return webResourceResponse;
    }
}
