package com.example.rummezheni.crashtest;

import android.app.Application;
import android.widget.Toast;

import com.github.mmin18.layoutcast.LayoutCast;

/**
 * Created by rummezheni on 16.08.2016.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LayoutCast.init(this);
    }
}
