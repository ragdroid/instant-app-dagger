package com.instantappsamples.feature.base;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by garimajain on 08/07/17.
 */
@Module
public class BaseActivityModule {
    @Provides
    @PerActivity
    public Context provideContext(Activity activity) {
        //not necessary, just to have something in the ActivityModule
        return activity;
    }
}
