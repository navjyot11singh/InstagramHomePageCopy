package com.androidsingh.cardviewcopy;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    private ArrayList<MyCard> mMyCardsList;

    public static class CardViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView textView;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView);
            textView=itemView.findViewById(R.id.textView);
        }

    }

    public CardAdapter(ArrayList<MyCard> myCards){
        mMyCardsList=myCards;

    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_card,parent,false);
        CardViewHolder cardViewHolder = new CardViewHolder(view);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder cardViewHolder, int i) {
        MyCard currentItem=mMyCardsList.get(i);
        cardViewHolder.imageView.setImageResource(currentItem.getmImageResource());
        cardViewHolder.textView.setText(currentItem.getmText());
    }

    @Override
    public int getItemCount() {
        return mMyCardsList.size();
    }



}
