package com.lib.webview.hook;


import com.lib.webview.annotation.WebType;
import com.lib.webview.sdk.WebSdk;

public class WebIconDatabase {

    public static final class Holder {
        private static final WebIconDatabase INSTANCE = new WebIconDatabase();
    }

    public static WebIconDatabase getInstance() {
        return Holder.INSTANCE;
    }

    public void open(String path) {
        switch (WebSdk.getInstance().getWebType()) {
            case WebType.WEB_KIT:
                android.webkit.WebIconDatabase.getInstance().open(path);
                break;
            case WebType.QQ:
                android.webkit.WebIconDatabase.getInstance().open(path);
                break;
            case WebType.UC:
            default:
                break;
        }
    }
}
