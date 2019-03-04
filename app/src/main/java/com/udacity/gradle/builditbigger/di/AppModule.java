package com.udacity.gradle.builditbigger.di;

import android.content.Context;

import com.udacity.gradle.builditbigger.BuildItBiggerApplication;

import javax.inject.Singleton;

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

}
