package com.instantappsamples.feature.base;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by garimajain on 08/07/17.
 */

@Scope
@Retention(RUNTIME)
public @interface PerActivity {
}

