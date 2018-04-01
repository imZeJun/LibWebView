package com.lib.webview.annotation;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({WebType.WEB_KIT, WebType.QQ, WebType.UC})
@Retention(RetentionPolicy.SOURCE)
public @interface WebType {

    int WEB_KIT = 1;

    int QQ = 2;

    int UC = 3;

}
