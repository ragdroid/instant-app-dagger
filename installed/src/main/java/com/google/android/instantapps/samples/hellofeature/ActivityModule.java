package com.google.android.instantapps.samples.hellofeature;

import android.app.Activity;
import android.content.Context;

import com.instantappsamples.feature.base.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by garimajain on 08/07/17.
 */
@Module
public class ActivityModule {

    @Provides
    @PerActivity
    public Context provideContext(Activity activity) {
        //not necessary, just to have something in the ActivityModule
        return activity;
    }
}
