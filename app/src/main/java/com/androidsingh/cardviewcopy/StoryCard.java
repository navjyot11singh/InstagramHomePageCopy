package com.androidsingh.cardviewcopy;

public class StoryCard {
    private int mImageResource;
    private String mText;

    public StoryCard(int mImageResource, String mText) {
        this.mImageResource = mImageResource;
        this.mText = mText;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmText() {
        return mText;
    }

}
