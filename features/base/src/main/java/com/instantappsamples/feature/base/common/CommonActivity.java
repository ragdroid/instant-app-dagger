package com.instantappsamples.feature.base.common;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import javax.inject.Inject;

/**
 * Created by garimajain on 08/07/17.
 */

public class CommonActivity extends BaseCommonActivity {

    @Inject
    Context context;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(CommonActivity.class.getSimpleName(), "injected context" + context);
    }
}
