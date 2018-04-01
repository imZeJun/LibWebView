package com.lib.webview.hook;


public class SslError {

    private android.net.http.SslError webkitSslError;
    private com.tencent.smtt.export.external.interfaces.SslError qqSslError;

    public SslError(android.net.http.SslError webkitSslError) {
        this.webkitSslError = webkitSslError;
    }

    public SslError(com.tencent.smtt.export.external.interfaces.SslError qqSslError) {
        this.qqSslError = qqSslError;
    }
}
