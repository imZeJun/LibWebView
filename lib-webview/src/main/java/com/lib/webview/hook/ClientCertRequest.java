package com.lib.webview.hook;

public class ClientCertRequest {

    private android.webkit.ClientCertRequest clientCertRequest;

    public ClientCertRequest() {}

    public ClientCertRequest(android.webkit.ClientCertRequest clientCertRequest) {
        this.clientCertRequest = clientCertRequest;
    }

    public int getPort() {
        return 0;
    }

}
