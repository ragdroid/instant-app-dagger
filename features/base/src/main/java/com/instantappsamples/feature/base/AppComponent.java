package com.instantappsamples.feature.base;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by garimajain on 08/07/17.
 */
@Component(modules = AppModule.class)
public interface AppComponent {

    @Component.Builder
    interface Builder {
        AppComponent build();
        @BindsInstance Builder application(Application application);
    }
}
