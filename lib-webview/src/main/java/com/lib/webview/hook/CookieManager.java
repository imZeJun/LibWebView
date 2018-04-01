package com.lib.webview.hook;


import com.lib.webview.annotation.WebType;
import com.lib.webview.sdk.WebSdk;

public class CookieManager {

    public static final class Holder {
        private static final CookieManager INSTANCE = new CookieManager();
    }

    public static CookieManager getInstance() {
        return Holder.INSTANCE;
    }

    public void removeAllCookie() {
        switch (WebSdk.getInstance().getWebType()) {
            case WebType.WEB_KIT:
                android.webkit.CookieManager.getInstance().removeAllCookie();
                break;
            case WebType.QQ:
                com.tencent.smtt.sdk.CookieManager.getInstance().removeAllCookie();
                break;
            case WebType.UC:
            default:
                break;
        }
    }

}
