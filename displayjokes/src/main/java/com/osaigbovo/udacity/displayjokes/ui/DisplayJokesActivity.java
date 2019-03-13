package com.osaigbovo.udacity.displayjokes.ui;

import android.os.Bundle;

import com.osaigbovo.udacity.displayjokes.R;

import androidx.appcompat.widget.Toolbar;
import dagger.android.support.DaggerAppCompatActivity;

public class DisplayJokesActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_jokes);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

}
