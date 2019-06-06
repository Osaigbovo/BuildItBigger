package com.udacity.gradle.builditbigger.util;

import android.os.AsyncTask;
import android.util.Log;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

import java.io.IOException;

public class EndpointsAsyncTask extends AsyncTask<Void, Void, String> {

    private static final String TAG = EndpointsAsyncTask.class.getSimpleName();
    private static MyApi sApiService = null;
    private RetrieveJokeListener retrieveJokeListener;

    public EndpointsAsyncTask(RetrieveJokeListener retrieveJokeListener) {
        this.retrieveJokeListener = retrieveJokeListener;
    }

    @Override
    protected String doInBackground(Void... params) {
        if (sApiService == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    // options for running against local devappserver
                    // - 10.0.2.2 is localhost's IP address in Android emulator
                    // - turn off compression when running against local devappserver
                    .setRootUrl("http://10.0.2.2:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(abstractGoogleClientRequest ->
                            abstractGoogleClientRequest.setDisableGZipContent(true));
            // end options for devappserver

            sApiService = builder.build();
        }

        try {
            return sApiService.tellJokes().execute().getData();
        } catch (IOException e) {
            Log.d(TAG, "doInBackground: " + e.getMessage());
            return null;
        }
    }

    @Override
    protected void onPostExecute(String result) {
        retrieveJokeListener.onJokeRetrieved(result);
    }

}
