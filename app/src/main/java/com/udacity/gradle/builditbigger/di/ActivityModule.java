package com.udacity.gradle.builditbigger.di;

import com.osaigbovo.udacity.displayjokes.di.DisplayModule;
import com.osaigbovo.udacity.displayjokes.ui.DisplayJokesActivity;
import com.udacity.gradle.builditbigger.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();

    @ContributesAndroidInjector(modules = DisplayModule.class)
    abstract DisplayJokesActivity contributeDisplayJokesActivity();
}
