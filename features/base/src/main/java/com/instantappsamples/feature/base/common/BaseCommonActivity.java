package com.instantappsamples.feature.base.common;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.instantappsamples.feature.base.BaseActivity;
import com.instantappsamples.feature.base.HelloApplication;

/**
 * Created by @iamBedant on 09/07/17.
 */

public class BaseCommonActivity extends BaseActivity {


    private ActivityComponent activityComponent;

    public ActivityComponent getActivityComponent() {
        return activityComponent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent = DaggerActivityComponent.builder()
                .activity(this)
                .appComponent(((HelloApplication) getApplication()).getAppComponent())
                .build();
    }
}