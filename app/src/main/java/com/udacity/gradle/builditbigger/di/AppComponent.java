package com.udacity.gradle.builditbigger.di;

import com.udacity.gradle.builditbigger.BuildItBiggerApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ActivityModule.class/*,
        FragmentBuildersModule.class*/}/*,
        dependencies = {DisplayComponent.class}*/)
@AppScope
public interface AppComponent extends AndroidInjector<BuildItBiggerApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(BuildItBiggerApplication application);

        /*fun application(application: Application): AppComponent.Builder
        fun coreComponent(coreComponent: CoreComponent): AppComponent.Builder*/

        AppComponent build();
    }
}
