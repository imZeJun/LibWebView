package com.lib.webview.hook.qq;


import com.lib.webview.annotation.WebType;
import com.lib.webview.hook.ConsoleMessage;
import com.lib.webview.sdk.WebSdk;

public class QQConsoleMessage extends ConsoleMessage {

    private com.tencent.smtt.export.external.interfaces.ConsoleMessage qqConsoleMessage;

    public QQConsoleMessage(com.tencent.smtt.export.external.interfaces.ConsoleMessage qqConsoleMessage) {
        this.qqConsoleMessage = qqConsoleMessage;
    }

    @Override
    public String message() {
        return qqConsoleMessage.message();
    }
}
