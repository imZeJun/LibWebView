package com.lib.webview.hook;


public class WebBackForwardList {

    private android.webkit.WebBackForwardList webBackForwardList;
    private com.tencent.smtt.sdk.WebBackForwardList qqWebBackForwardList;

    public WebBackForwardList(android.webkit.WebBackForwardList webBackForwardList) {
        this.webBackForwardList = webBackForwardList;
    }

    public WebBackForwardList(com.tencent.smtt.sdk.WebBackForwardList qqWebBackForwardList) {
        this.qqWebBackForwardList = qqWebBackForwardList;
    }
}
