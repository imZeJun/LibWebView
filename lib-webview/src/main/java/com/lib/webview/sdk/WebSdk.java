package com.lib.webview.sdk;


import com.lib.webview.annotation.WebType;

public class WebSdk {

    private static final class Holder {
        private static final WebSdk INSTANCE = new WebSdk();
    }

    public static WebSdk getInstance() {
        return Holder.INSTANCE;
    }

    public @WebType int getWebType() {
        return WebType.QQ;
    }
}
