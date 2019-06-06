package com.udacity.gradle.builditbigger.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.osaigbovo.udacity.displayjokes.ui.DisplayJokesActivity;
import com.osaigbovo.udacity.displayjokes.ui.DisplayJokesActivityFragment;
import com.udacity.gradle.builditbigger.R;
import com.udacity.gradle.builditbigger.util.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.util.RetrieveJokeListener;

public class MainActivity extends AppCompatActivity implements RetrieveJokeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view){
        new EndpointsAsyncTask(this).execute();
    }

    @Override
    public void onJokeRetrieved(@Nullable String joke) {
        Intent intent = new Intent(this, DisplayJokesActivity.class);
        intent.putExtra(DisplayJokesActivityFragment.FUNNY_JOKE, joke);
        startActivity(intent);
    }

}
