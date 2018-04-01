package com.lib.webview.hook;


public class HttpAuthHandler {

    private android.webkit.HttpAuthHandler httpAuthHandler;

    private com.tencent.smtt.export.external.interfaces.HttpAuthHandler qqHttpAuthHandler;

    public HttpAuthHandler(android.webkit.HttpAuthHandler httpAuthHandler) {
        this.httpAuthHandler = httpAuthHandler;
    }

    public HttpAuthHandler(com.tencent.smtt.export.external.interfaces.HttpAuthHandler httpAuthHandler) {
        this.qqHttpAuthHandler = httpAuthHandler;
    }
}
