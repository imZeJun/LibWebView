package com.lib.webview.hook;

public class WebResourceResponse {

    private android.webkit.WebResourceResponse webResourceResponse;
    private com.tencent.smtt.export.external.interfaces.WebResourceResponse qqWebResourceResponse;

    public WebResourceResponse(android.webkit.WebResourceResponse webResourceResponse) {
        this.webResourceResponse = webResourceResponse;
    }

    public WebResourceResponse(com.tencent.smtt.export.external.interfaces.WebResourceResponse webResourceResponse) {
        this.qqWebResourceResponse = webResourceResponse;
    }

    public android.webkit.WebResourceResponse toWebkitWebResourceResponse() {
        return webResourceResponse;
    }

    public com.tencent.smtt.export.external.interfaces.WebResourceResponse toQQWebResourceResponse() {
        return qqWebResourceResponse;
    }
}
