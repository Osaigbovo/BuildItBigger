package com.osaigbovo.udacity.displayjokes.di;

import android.content.Context;

import com.osaigbovo.udacity.displayjokes.ui.DisplayJokesActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class DisplayModule {

    @Provides
    //@ModuleScope
    Context provideContext(DisplayJokesActivity displayJokesActivity){
        return displayJokesActivity;
    }

    /*@Provides
    @ModuleScope
    fun provideResources(): Resources = activity.resources*/


/*    @ContributesAndroidInjector(modules = FragmentBuildersModule.class)
    abstract MovieDetailActivity contributeMovieDetailActivity();*/
}
