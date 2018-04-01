package com.lib.webview;

import android.content.Context;
import android.util.AttributeSet;

public class RealWebView extends android.webkit.WebView {

    public RealWebView(Context context) {
        super(context);
    }

    public RealWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RealWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
