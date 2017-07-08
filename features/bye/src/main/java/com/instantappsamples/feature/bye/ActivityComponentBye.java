package com.instantappsamples.feature.bye;

import android.app.Activity;

import com.instantappsamples.feature.base.AppComponent;
import com.instantappsamples.feature.base.PerActivity;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by garimajain on 08/07/17.
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = ActivityModuleBye.class)
public interface ActivityComponentBye {

    void inject(GoodbyeActivity goodbyeActivity);

    @Component.Builder
    interface Builder {
        ActivityComponentBye build();

        Builder appComponent(AppComponent appComponent);

        @BindsInstance
        Builder activity(Activity activity);
    }

}
