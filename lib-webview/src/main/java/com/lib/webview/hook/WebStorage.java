package com.lib.webview.hook;

public class WebStorage {

    public static class QuotaUpdater {

        private android.webkit.WebStorage.QuotaUpdater quotaUpdater;
        private com.tencent.smtt.sdk.WebStorage.QuotaUpdater qqQuotaUpdater;

        public QuotaUpdater(android.webkit.WebStorage.QuotaUpdater quotaUpdater) {
            this.quotaUpdater = quotaUpdater;
        }

        public QuotaUpdater(com.tencent.smtt.sdk.WebStorage.QuotaUpdater qqQuotaUpdater) {
            this.qqQuotaUpdater = qqQuotaUpdater;
        }
    }
}
