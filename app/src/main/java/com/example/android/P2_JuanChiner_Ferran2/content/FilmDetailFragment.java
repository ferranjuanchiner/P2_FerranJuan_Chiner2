package com.example.android.P2_JuanChiner_Ferran2.content;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.P2_JuanChiner_Ferran2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FilmDetailFragment extends Fragment {
    public FilmUtils.Film mFilm;

    public FilmDetailFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(FilmUtils.FILM_ID_KEY)) {
            // Load the content specified by the fragment arguments.
            mFilm = FilmUtils.FILM_ITEMS.get(getArguments()
                    .getInt(FilmUtils.FILM_ID_KEY));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.activity_film_detail, container, false);
        if (mFilm != null) {
            ((TextView) rootview.findViewById(R.id.film_detail))
                    .setText(mFilm.details);
            ImageView img =((ImageView) rootview.findViewById(R.id.filmDetailView));
            img.setImageResource(mFilm.image);
        }
        return rootview;
    }
    public static FilmDetailFragment newInstance (int selectedSong) {
        FilmDetailFragment fragment = new FilmDetailFragment();
        // Set the bundle arguments for the fragment.
        Bundle arguments = new Bundle();
        arguments.putInt(FilmUtils.FILM_ID_KEY, selectedSong);
        fragment.setArguments(arguments);
        return fragment;
    }

}
