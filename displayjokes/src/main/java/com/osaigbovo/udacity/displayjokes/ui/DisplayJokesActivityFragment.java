package com.osaigbovo.udacity.displayjokes.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.osaigbovo.udacity.displayjokes.R;

import java.util.Objects;

public class DisplayJokesActivityFragment extends Fragment {

    public static final String FUNNY_JOKE = "funny_joke";

    public DisplayJokesActivityFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_display_jokes, container, false);

        if (Objects.requireNonNull(getActivity()).getIntent().hasExtra(FUNNY_JOKE)) {
            Intent intent = Objects.requireNonNull(getActivity()).getIntent();
            String joke = intent.getStringExtra(FUNNY_JOKE);
            TextView displayJoke = rootView.findViewById(R.id.text_display_jokes);
            displayJoke.setText(joke);
        }

        return rootView;
    }


}
