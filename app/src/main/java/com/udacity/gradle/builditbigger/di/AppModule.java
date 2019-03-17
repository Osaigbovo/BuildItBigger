package com.udacity.gradle.builditbigger.di;

import android.content.Context;

import com.udacity.gradle.builditbigger.BuildItBiggerApplication;
import com.udacity.gradle.builditbigger.util.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.util.RetrieveJokeListener;

import javax.inject.Singleton;

import androidx.annotation.Nullable;
import dagger.Module;
import dagger.Provides;

@Module
class AppModule {

    @Provides
    @Singleton
    Context provideContext(BuildItBiggerApplication biggerApplication) {
        return biggerApplication.getApplicationContext();
    }

    @Provides
    @AppScope
    CommonHelloService provideCommonHelloService() {
        return new CommonHelloService();
    }

    /*@Provides
    @Singleton
    RetrieveJokeListener provideRetrieveJokeListener() {
        return new RetrieveJokeListener() {
            @Override
            public void onJokeRetrieved(@Nullable String joke) {

            }
        };
    }*/

    @Provides
    @AppScope
    EndpointsAsyncTask provideEndpointsAsyncTask(/*RetrieveJokeListener retrieveJokeListener*/) {
        return new EndpointsAsyncTask(/*retrieveJokeListener*/);
    }

}
