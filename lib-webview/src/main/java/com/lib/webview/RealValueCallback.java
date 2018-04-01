package com.lib.webview;

import com.lib.webview.hook.ValueCallback;


public class RealValueCallback<T> implements android.webkit.ValueCallback<T> {

    public ValueCallback<T> valueCallback;

    public RealValueCallback(ValueCallback<T> valueCallback) {
        this.valueCallback = valueCallback;
    }

    @Override
    public void onReceiveValue(T value) {
        valueCallback.onReceiveValue(value);
    }
}
