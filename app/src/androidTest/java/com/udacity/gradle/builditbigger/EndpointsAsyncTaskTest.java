package com.udacity.gradle.builditbigger;

import android.text.TextUtils;

import androidx.annotation.Nullable;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.udacity.gradle.builditbigger.util.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.util.RetrieveJokeListener;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * @author Yassin Ajdi
 * @since 3/8/2019.
 */
@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest implements RetrieveJokeListener {

    private String mJoke = null;
    private CountDownLatch mLatch;

    @Test
    public void jokeLoadedTest() {

        try {
            mLatch = new CountDownLatch(1);
            new EndpointsAsyncTask(this).execute();
            mLatch.await(15, TimeUnit.SECONDS);
            // assert that joke is not null or empty
            assertNotNull("Joke is null", mJoke);
            assertFalse("Joke string is empty", TextUtils.isEmpty(mJoke));
        } catch (Exception e) {
            fail("Exception while fetching joke: " + e.getMessage());
        }
    }

    @Override
    public void onJokeRetrieved(@Nullable String result) {
        mJoke = result;
        mLatch.countDown();
    }

}