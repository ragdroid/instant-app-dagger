package com.instantappsamples.feature.base;

import android.app.Activity;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by garimajain on 08/07/17.
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = BaseActivityModule.class)
public interface BaseActivityComponent {

    void inject(CommonActivity baseActivity);

    @Component.Builder
    interface Builder {
        BaseActivityComponent build();
        Builder appComponent(AppComponent appComponent);

        @BindsInstance
        Builder activity(Activity activity);
    }

}
