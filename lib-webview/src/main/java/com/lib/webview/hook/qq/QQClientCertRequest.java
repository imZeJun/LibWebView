package com.lib.webview.hook.qq;

import com.lib.webview.hook.ClientCertRequest;

public class QQClientCertRequest extends ClientCertRequest {

    private com.tencent.smtt.export.external.interfaces.ClientCertRequest qqClientCertRequest;

    public QQClientCertRequest(com.tencent.smtt.export.external.interfaces.ClientCertRequest qqClientCertRequest) {
        this.qqClientCertRequest = qqClientCertRequest;
    }

    @Override
    public int getPort() {
        return qqClientCertRequest.getPort();
    }
}
