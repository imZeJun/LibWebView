package com.lib.webview.hook;


public class WebIconDatabase {

    public static final class Holder {
        private static final WebIconDatabase INSTANCE = new WebIconDatabase();
    }

    public static WebIconDatabase getInstance() {
        return Holder.INSTANCE;
    }
}
