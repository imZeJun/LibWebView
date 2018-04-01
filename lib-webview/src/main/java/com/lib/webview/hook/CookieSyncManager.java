package com.lib.webview.hook;


import com.lib.webview.annotation.WebType;
import com.lib.webview.sdk.WebSdk;

public class CookieSyncManager {

    public static final class Holder {
        private static final CookieSyncManager INSTANCE = new CookieSyncManager();
    }

    public static CookieSyncManager getInstance() {
        return CookieSyncManager.Holder.INSTANCE;
    }

    public void startSync() {
        switch (WebSdk.getInstance().getWebType()) {
            case WebType.WEB_KIT:
                android.webkit.CookieSyncManager.getInstance().startSync();
                break;
            case WebType.QQ:
                com.tencent.smtt.sdk.CookieSyncManager.getInstance().startSync();
                break;
            case WebType.UC:
            default:
                break;
        }
    }
}
