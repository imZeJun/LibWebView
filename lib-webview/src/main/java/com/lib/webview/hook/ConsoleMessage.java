package com.lib.webview.hook;


import com.lib.webview.annotation.WebType;
import com.lib.webview.sdk.WebSdk;

public class ConsoleMessage {

    private android.webkit.ConsoleMessage consoleMessage;
    private com.tencent.smtt.export.external.interfaces.ConsoleMessage qqConsoleMessage;

    public ConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        this.consoleMessage = consoleMessage;
    }

    public ConsoleMessage(com.tencent.smtt.export.external.interfaces.ConsoleMessage qqConsoleMessage) {
        this.qqConsoleMessage = qqConsoleMessage;
    }

    public String message() {
        switch (WebSdk.getInstance().getWebType()) {
            case WebType.WEB_KIT:
                return consoleMessage.message();
            case WebType.QQ:
                return qqConsoleMessage.message();
            case WebType.UC:
            default:
                break;
        }
        return "";
    }
}
