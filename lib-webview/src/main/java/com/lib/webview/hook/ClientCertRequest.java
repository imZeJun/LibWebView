package com.lib.webview.hook;

public class ClientCertRequest {

    private android.webkit.ClientCertRequest clientCertRequest;
    private com.tencent.smtt.export.external.interfaces.ClientCertRequest qqClientCertRequest;

    public ClientCertRequest(android.webkit.ClientCertRequest clientCertRequest) {
        this.clientCertRequest = clientCertRequest;
    }

    public ClientCertRequest(com.tencent.smtt.export.external.interfaces.ClientCertRequest qqClientCertRequest) {
        this.qqClientCertRequest = qqClientCertRequest;
    }
}
