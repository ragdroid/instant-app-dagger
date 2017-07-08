package com.instantappsamples.feature.base.common;

import android.app.Activity;

import com.instantappsamples.feature.base.AppComponent;
import com.instantappsamples.feature.base.PerActivity;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by garimajain on 08/07/17.
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(CommonActivity mainActivity);

    @Component.Builder
    interface Builder {
        ActivityComponent build();
        Builder appComponent(AppComponent appComponent);

        @BindsInstance
        Builder activity(Activity activity);
    }

}
