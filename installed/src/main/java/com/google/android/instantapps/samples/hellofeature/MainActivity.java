package com.google.android.instantapps.samples.hellofeature;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.google.android.instantapps.samples.feature.hello.R;

import javax.inject.Inject;

public class MainActivity extends BaseInstalledActivity {

    @Inject Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActivityComponent()
                .inject(this);

        Log.d(MainActivity.class.getSimpleName(), "injected context" + context);

    }

}
