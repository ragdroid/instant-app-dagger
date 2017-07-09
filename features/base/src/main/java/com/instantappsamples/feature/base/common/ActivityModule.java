package com.instantappsamples.feature.base.common;

/**
 * Created by @iamBedant on 09/07/17.
 */

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.instantappsamples.feature.base.BaseActivityModule;
import com.instantappsamples.feature.base.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by garimajain on 08/07/17.
 */
@Module
public class ActivityModule extends BaseActivityModule {

    @Provides
    @PerActivity
    public SharedPreferences providePreferences(Activity activity) {
        return PreferenceManager.getDefaultSharedPreferences(activity);
    }

}