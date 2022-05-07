package com.neo.mytwitter.fragment.homerecyclerview;

public class TweetItem {

    private String name, username, tweetContent;

    public TweetItem(String name, String username, String tweetContent) {
        this.name = name;
        this.username = username;
        this.tweetContent = tweetContent;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getTweetContent() {
        return tweetContent;
    }
}