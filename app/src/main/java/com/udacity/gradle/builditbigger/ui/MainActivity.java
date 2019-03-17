package com.udacity.gradle.builditbigger.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.osaigbovo.udacity.displayjokes.ui.DisplayJokesActivity;
import com.udacity.gradle.builditbigger.R;
import com.udacity.gradle.builditbigger.di.CommonHelloService;
import com.udacity.gradle.builditbigger.util.EndpointsAsyncTask;

import java.util.concurrent.ExecutionException;

import javax.inject.Inject;

import androidx.annotation.Nullable;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity/* implements RetrieveJokeListener*/{

    @Inject
    CommonHelloService commonHelloService;

    @Inject
    EndpointsAsyncTask endpointsAsyncTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tellJoke(View view) throws ExecutionException, InterruptedException {

        Toast.makeText(this, commonHelloService.sayHello(), Toast.LENGTH_SHORT).show();

        String joke = endpointsAsyncTask.execute().get();

        startActivity(new Intent(this, DisplayJokesActivity.class));

    }

    /*@Override
    public void onJokeRetrieved(@Nullable String joke) {

    }*/

}
