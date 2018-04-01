package com.lib.webview.hook;


public class ConsoleMessage {

    private android.webkit.ConsoleMessage consoleMessage;

    public ConsoleMessage() {}

    public ConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        this.consoleMessage = consoleMessage;
    }

    public String message() {
        return consoleMessage.message();
    }
}
