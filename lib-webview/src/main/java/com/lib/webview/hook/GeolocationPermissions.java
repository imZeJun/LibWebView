package com.lib.webview.hook;


public class GeolocationPermissions {

    public static final class Callback {

        private android.webkit.GeolocationPermissions.Callback callback;

        public Callback(android.webkit.GeolocationPermissions.Callback callback) {
            this.callback = callback;
        }
    }
}
