package com.instantappsamples.feature.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by @iamBedant on 08/07/17.
 */

public class BaseActivity extends AppCompatActivity{


    /*
            This Class will contain all common features like show loader, Hide loader, release disposables
     */

    BaseActivityComponent mComponent;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        mComponent = DaggerBaseActivityComponent.builder()
                .activity(this)
                .appComponent(((HelloApplication) getApplication()).getAppComponent())
                .build();
    }

    public BaseActivityComponent getBaseActivityComponent() {
        return mComponent;
    }


}
