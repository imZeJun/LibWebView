package com.lib.webview.hook;


public class ValueCallback<T> {

    private android.webkit.ValueCallback<T> valueCallback;

    public ValueCallback(android.webkit.ValueCallback<T> valueCallback) {
        this.valueCallback = valueCallback;
    }

    public void onReceiveValue(T value) {
        if (valueCallback != null) {
            this.valueCallback.onReceiveValue(value);
        }
    }
}
