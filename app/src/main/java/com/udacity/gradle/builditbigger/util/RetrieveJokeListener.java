package com.udacity.gradle.builditbigger.util;

import androidx.annotation.Nullable;

public interface RetrieveJokeListener {

    void onJokeRetrieved(@Nullable String joke);
}
