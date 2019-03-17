package com.udacity.gradle.builditbigger.util;

import javax.inject.Singleton;

import androidx.annotation.Nullable;

@Singleton
public interface RetrieveJokeListener {

    void onJokeRetrieved(@Nullable String joke);
}
