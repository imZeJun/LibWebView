package com.lib.webview.hook;

public class SslErrorHandler {

    private android.webkit.SslErrorHandler sslErrorHandler;

    public SslErrorHandler(android.webkit.SslErrorHandler sslErrorHandler) {
        this.sslErrorHandler = sslErrorHandler;
    }
}
