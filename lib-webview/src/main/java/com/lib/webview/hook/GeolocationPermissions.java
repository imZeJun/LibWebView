package com.lib.webview.hook;


import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;

public class GeolocationPermissions {

    public static final class Callback {

        private android.webkit.GeolocationPermissions.Callback callback;
        private GeolocationPermissionsCallback qqCallback;

        public Callback(android.webkit.GeolocationPermissions.Callback callback) {
            this.callback = callback;
        }

        public Callback(GeolocationPermissionsCallback qqCallback) {
            this.qqCallback = qqCallback;
        }
    }
}
