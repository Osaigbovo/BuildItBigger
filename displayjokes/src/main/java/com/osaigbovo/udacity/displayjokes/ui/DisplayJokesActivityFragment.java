package com.osaigbovo.udacity.displayjokes.ui;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.osaigbovo.udacity.displayjokes.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class DisplayJokesActivityFragment extends Fragment {

    public DisplayJokesActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_display_jokes, container, false);
    }
}