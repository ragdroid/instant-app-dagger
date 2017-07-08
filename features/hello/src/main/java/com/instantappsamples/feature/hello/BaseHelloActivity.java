package com.instantappsamples.feature.hello;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.instantappsamples.feature.base.BaseActivity;
import com.instantappsamples.feature.base.BaseActivityComponent;
import com.instantappsamples.feature.base.DaggerBaseActivityComponent;
import com.instantappsamples.feature.base.HelloApplication;

/**
 * Created by @iamBedant on 08/07/17.
 */

public class BaseHelloActivity extends BaseActivity{


    ActivityComponent mComponent;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        mComponent =  DaggerActivityComponent.builder()
                .activity(this)
                .appComponent(((HelloApplication) getApplication()).getAppComponent())
                .build();
    }

    public ActivityComponent getActivityComponent() {
        return mComponent;
    }


}
