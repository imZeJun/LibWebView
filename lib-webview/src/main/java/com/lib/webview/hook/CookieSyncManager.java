package com.lib.webview.hook;


public class CookieSyncManager {

    public static final class Holder {
        private static final CookieSyncManager INSTANCE = new CookieSyncManager();
    }

    public static CookieSyncManager getInstance() {
        return CookieSyncManager.Holder.INSTANCE;
    }
}
