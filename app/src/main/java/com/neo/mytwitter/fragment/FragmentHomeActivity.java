package com.neo.mytwitter.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.neo.mytwitter.R;
import com.neo.mytwitter.fragment.homerecyclerview.TweetAdapter;
import com.neo.mytwitter.fragment.homerecyclerview.TweetItem;

import java.util.ArrayList;

public class FragmentHomeActivity extends Fragment {

//    Object
    private ArrayList<TweetItem> list;

//    UI component
    private View view;
    private Toolbar toolbar;
    private TextView tvEmpFeed;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_fragment_home, container, false);

//        Instantiate object
        list = new ArrayList<>();
        list.add(new TweetItem("Neonie Quell", "neoniehimself", "This is my twitter clone."));

//        Assign component ID
        toolbar = view.findViewById(R.id.toolbar);
        recyclerView = view.findViewById(R.id.recyclerView);
        tvEmpFeed = view.findViewById(R.id.tvEmpFeed);

//        Set toolbar as activity actionbar
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

        setItemVisibility();
        buildRecyclerView();

        return view;
    }

    private void setItemVisibility() {
        if (!list.isEmpty()) {
            tvEmpFeed.setVisibility(View.GONE);
            recyclerView.setVisibility(View.VISIBLE);
        } else {
            tvEmpFeed.setVisibility(View.VISIBLE);
            recyclerView.setVisibility(View.GONE);
        }
    }

    private void buildRecyclerView() {
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(view.getContext());
        adapter = new TweetAdapter(list);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}