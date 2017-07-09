package com.instantappsamples.feature.base.common;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.instantapps.samples.feature.base.R;
import com.instantappsamples.feature.base.BaseActivity;

public class CommonActivity extends BaseCommonActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
        getActivityComponent().inject(this);
    }
}
