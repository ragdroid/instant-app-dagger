package com.instantappsamples.feature.bye;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.instantappsamples.feature.base.BaseActivity;
import com.instantappsamples.feature.base.HelloApplication;

/**
 * Created by @iamBedant on 08/07/17.
 */

public class BaseByeActivity extends BaseActivity{


    ActivityComponentBye mComponent;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        mComponent = DaggerActivityComponentBye.builder()
                .activity(this)
                .appComponent(((HelloApplication) getApplication()).getAppComponent())
                .build();
    }

    public ActivityComponentBye getByeActivityComponent() {
        return mComponent;
    }


}
