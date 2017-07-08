package com.instantappsamples.feature.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.instantapps.samples.feature.base.R;

public class CommonActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
        getBaseActivityComponent().inject(this);
    }
}
