package com.lib.webview.hook;


public class WebHistoryItem {

    private android.webkit.WebHistoryItem webHistoryItem;
    private com.tencent.smtt.sdk.WebHistoryItem qqWebHistoryItem;

    public WebHistoryItem(android.webkit.WebHistoryItem webHistoryItem) {
        this.webHistoryItem = webHistoryItem;
    }

    public WebHistoryItem(com.tencent.smtt.sdk.WebHistoryItem qqWebHistoryItem) {
        this.qqWebHistoryItem = qqWebHistoryItem;
    }
}
