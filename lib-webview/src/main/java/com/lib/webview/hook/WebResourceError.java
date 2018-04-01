package com.lib.webview.hook;


import com.lib.webview.annotation.WebType;
import com.lib.webview.sdk.WebSdk;

public class WebResourceError {

    private android.webkit.WebResourceError webResourceError;
    private com.tencent.smtt.export.external.interfaces.WebResourceError qqWebResourceError;

    public WebResourceError(android.webkit.WebResourceError webResourceError) {
        this.webResourceError = webResourceError;
    }

    public WebResourceError(com.tencent.smtt.export.external.interfaces.WebResourceError qqWebResourceError) {
        this.qqWebResourceError = qqWebResourceError;
    }

    public int getErrorCode() {
        switch (WebSdk.getInstance().getWebType()) {
            case WebType.WEB_KIT:
                break;
            case WebType.QQ:
                return qqWebResourceError.getErrorCode();
            case WebType.UC:
            default:
                break;
        }
        return 0;
    }

    public CharSequence getDescription() {
        switch (WebSdk.getInstance().getWebType()) {
            case WebType.WEB_KIT:
                break;
            case WebType.QQ:
                return qqWebResourceError.getDescription();
            case WebType.UC:
            default:
                break;
        }
        return "";
    }
}
