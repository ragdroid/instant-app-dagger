package com.google.android.instantapps.samples.hellofeature;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;

import com.google.android.instantapps.samples.feature.hello.R;
import com.instantappsamples.feature.base.HelloApplication;

import javax.inject.Inject;

public class MainActivity extends Activity {

    @Inject Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerActivityComponent.builder()
                .activity(this)
                .appComponent(((HelloApplication) getApplication()).getAppComponent())
                .build()
                .inject(this);

        Log.d(MainActivity.class.getSimpleName(), "injected context" + context);

    }

}
