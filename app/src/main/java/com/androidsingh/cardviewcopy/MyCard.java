package com.androidsingh.cardviewcopy;

public class MyCard {
    private int mImageResource;
    private String mText;


    public int getmImageResource() {
        return mImageResource;
    }

    public String getmText() {
        return mText;
    }

    public MyCard(int mImageResource, String mText) {
        this.mImageResource = mImageResource;
        this.mText = mText;
    }
}
