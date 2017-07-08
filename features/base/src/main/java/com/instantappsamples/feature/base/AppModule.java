package com.instantappsamples.feature.base;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import dagger.Module;
import dagger.Provides;

/**
 * Created by garimajain on 08/07/17.
 */
@Module
public class AppModule {

    @Provides
    SharedPreferences provideSharedPrefs(Application application) {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

}
