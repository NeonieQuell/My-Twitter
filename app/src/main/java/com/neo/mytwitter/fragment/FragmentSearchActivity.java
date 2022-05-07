package com.neo.mytwitter.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.neo.mytwitter.R;

public class FragmentSearchActivity extends Fragment {

//    UI component
    private View view;
    private Toolbar toolbar;

    @SuppressLint("RestrictedApi")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_fragment_search, container, false);

//        Assign component ID
        toolbar = view.findViewById(R.id.toolbar);

//        Set toolbar as activity actionbar
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

        return view;
    }
}