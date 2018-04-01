package com.lib.webview.hook;


public class WebResourceRequest {

    private android.webkit.WebResourceRequest resourceRequest;
    private com.tencent.smtt.export.external.interfaces.WebResourceRequest qqWebResourceRequest;

    public WebResourceRequest(android.webkit.WebResourceRequest resourceRequest) {
        this.resourceRequest = resourceRequest;
    }

    public WebResourceRequest(com.tencent.smtt.export.external.interfaces.WebResourceRequest qqWebResourceRequest) {
        this.qqWebResourceRequest = qqWebResourceRequest;
    }
}
