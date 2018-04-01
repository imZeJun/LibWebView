package com.lib.webview.hook;

public class SslErrorHandler {

    private android.webkit.SslErrorHandler sslErrorHandler;
    private com.tencent.smtt.export.external.interfaces.SslErrorHandler qqSslErrorHandler;

    public SslErrorHandler(android.webkit.SslErrorHandler sslErrorHandler) {
        this.sslErrorHandler = sslErrorHandler;
    }

    public SslErrorHandler(com.tencent.smtt.export.external.interfaces.SslErrorHandler qqSslErrorHandler) {
        this.qqSslErrorHandler = qqSslErrorHandler;
    }
}
