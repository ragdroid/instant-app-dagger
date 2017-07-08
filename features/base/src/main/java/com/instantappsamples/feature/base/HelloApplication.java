package com.instantappsamples.feature.base;

import android.app.Application;

/**
 * Created by garimajain on 08/07/17.
 */

public class HelloApplication extends Application {

    public AppComponent getAppComponent() {
        return appComponent;
    }

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.appComponent = DaggerAppComponent.builder()
                .application(this)
                .build();
    }
}
