package com.neo.mytwitter.fragment.homerecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.neo.mytwitter.R;

import java.util.ArrayList;

public class TweetAdapter extends RecyclerView.Adapter<TweetAdapter.TweetViewHolder> {

    private ArrayList<TweetItem> list;

    public static class TweetViewHolder extends RecyclerView.ViewHolder {

        public TextView name, username, tweetContent;

        public TweetViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.txtName);
            username = itemView.findViewById(R.id.txtUserName);
            tweetContent = itemView.findViewById(R.id.txtTweetContent);
        }
    }

    public TweetAdapter(ArrayList<TweetItem> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public TweetViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_tweet_item, viewGroup, false);
        return new TweetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TweetViewHolder tweetViewHolder, int i) {
        TweetItem currentItem = list.get(i);
        tweetViewHolder.name.setText(currentItem.getName());
        tweetViewHolder.username.setText("@" + currentItem.getUsername());
        tweetViewHolder.tweetContent.setText(currentItem.getTweetContent());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}