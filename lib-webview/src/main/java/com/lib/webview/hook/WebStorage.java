package com.lib.webview.hook;

public class WebStorage {

    public static class QuotaUpdater {

        private android.webkit.WebStorage.QuotaUpdater quotaUpdater;

        public QuotaUpdater(android.webkit.WebStorage.QuotaUpdater quotaUpdater) {
            this.quotaUpdater = quotaUpdater;
        }
    }
}
