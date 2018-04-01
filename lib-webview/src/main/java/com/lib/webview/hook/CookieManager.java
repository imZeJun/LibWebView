package com.lib.webview.hook;


public class CookieManager {

    public static final class Holder {
        private static final CookieManager INSTANCE = new CookieManager();
    }

    public static CookieManager getInstance() {
        return Holder.INSTANCE;
    }
}
