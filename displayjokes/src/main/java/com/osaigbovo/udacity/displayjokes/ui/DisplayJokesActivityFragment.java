package com.osaigbovo.udacity.displayjokes.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.osaigbovo.udacity.displayjokes.R;

public class DisplayJokesActivityFragment extends Fragment {

    public static final String FUNNY_JOKE = "funny_joke";

    private String joke;

    public DisplayJokesActivityFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            this.joke = getArguments().getString(FUNNY_JOKE);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_display_jokes, container, false);

        TextView jokeDetails = rootView.findViewById(R.id.text_display_jokes);
        jokeDetails.setText(joke);

        return rootView;
    }


}
