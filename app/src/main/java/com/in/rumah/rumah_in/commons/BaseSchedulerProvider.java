package com.in.rumah.rumah_in.commons;

import android.support.annotation.NonNull;

import rx.Scheduler;

/**
 * Created by irwancannady on 8/27/17.
 */

public interface BaseSchedulerProvider {

    @NonNull
    Scheduler computation();

    @NonNull
    Scheduler io();

    @NonNull
    Scheduler ui();
}
