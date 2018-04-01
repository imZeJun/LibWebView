package com.lib.webview.hook;


public class ValueCallback<T> {

    private android.webkit.ValueCallback<T> valueCallback;
    private com.tencent.smtt.sdk.ValueCallback<T> qqValueCallback;

    public ValueCallback(android.webkit.ValueCallback<T> valueCallback) {
        this.valueCallback = valueCallback;
    }

    public ValueCallback(com.tencent.smtt.sdk.ValueCallback<T> qqValueCallback) {
        this.qqValueCallback = qqValueCallback;
    }

    public void onReceiveValue(T value) {
        if (valueCallback != null) {
            this.valueCallback.onReceiveValue(value);
        }
        if (qqValueCallback != null) {
            this.qqValueCallback.onReceiveValue(value);
        }
    }
}
