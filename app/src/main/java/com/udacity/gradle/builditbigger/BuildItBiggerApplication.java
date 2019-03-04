package com.udacity.gradle.builditbigger;

import com.udacity.gradle.builditbigger.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class BuildItBiggerApplication extends DaggerApplication  /*, CoreComponentProvider*/ {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent
                .builder()
                .application(this)
                //.coreComponent(provideCoreComponent())
                .build();
    }


    /*private lateinit var coreComponent: CoreComponent

    override fun provideCoreComponent(): CoreComponent {
        if (!this::coreComponent.isInitialized) {
            coreComponent = DaggerCoreComponent
                    .builder()
                    .build()
        }
        return coreComponent
    }*/
}
