package com.lib.webview.hook.qq;


import com.lib.webview.hook.HttpAuthHandler;

public class QQHttpAuthHandler extends HttpAuthHandler {

    private com.tencent.smtt.export.external.interfaces.HttpAuthHandler qqHttpAuthHandler;

    public QQHttpAuthHandler(com.tencent.smtt.export.external.interfaces.HttpAuthHandler httpAuthHandler) {
        this.qqHttpAuthHandler = httpAuthHandler;
    }
}
