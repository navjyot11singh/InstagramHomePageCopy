package com.androidsingh.cardviewcopy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<MyCard> exampleList;
    ArrayList<StoryCard> examplelist1;

    private RecyclerView recyclerView;
    private RecyclerView storyRecyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.Adapter storyAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.LayoutManager storyLayoutManager;

    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fakeList();
        fakeList1();

        recyclerCardManagement();

        recylerStoryCardManagement();
        toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle("Insta");
        toolbar.setLogo(R.drawable.ic_camera_alt_black_24dp);


    }

    private void recylerStoryCardManagement() {
        storyRecyclerView = findViewById(R.id.storiesRecyclerView);
        storyLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        storyAdapter = new StoryCardAdapter(examplelist1);
        storyRecyclerView.setNestedScrollingEnabled(false);

        storyRecyclerView.setHasFixedSize(true);
        storyRecyclerView.setLayoutManager(storyLayoutManager);
        storyRecyclerView.setAdapter(storyAdapter);
    }

    private void recyclerCardManagement() {
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        adapter = new CardAdapter(exampleList);
        recyclerView.setNestedScrollingEnabled(false);


        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void fakeList(){
        exampleList= new ArrayList<>();
        exampleList.add(new MyCard(R.drawable.p1,"This is the caption of the image one with all the text written in just one line"));
        exampleList.add(new MyCard(R.drawable.p2,"This is the caption of the image one with all the text written in just one line"));
        exampleList.add(new MyCard(R.drawable.p3,"This is the caption of the image one with all the text written in just one line"));
        exampleList.add(new MyCard(R.drawable.p4,"This is the caption of the image one with all the text written in just one line"));
        exampleList.add(new MyCard(R.drawable.p5,"This is the caption of the image one with all the text written in just one line"));
        exampleList.add(new MyCard(R.drawable.p6,"This is the caption of the image one with all the text written in just one line"));exampleList.add(new MyCard(R.drawable.p1,"This is the caption of the image one with all the text written in just one line"));
        exampleList.add(new MyCard(R.drawable.p2,"This is the caption of the image one with all the text written in just one line"));
        exampleList.add(new MyCard(R.drawable.p3,"This is the caption of the image one with all the text written in just one line"));
        exampleList.add(new MyCard(R.drawable.p4,"This is the caption of the image one with all the text written in just one line"));
        exampleList.add(new MyCard(R.drawable.p5,"This is the caption of the image one with all the text written in just one line"));
        exampleList.add(new MyCard(R.drawable.p6,"This is the caption of the image one with all the text written in just one line"));exampleList.add(new MyCard(R.drawable.p1,"This is the caption of the image one with all the text written in just one line"));
        exampleList.add(new MyCard(R.drawable.p2,"This is the caption of the image one with all the text written in just one line"));
        exampleList.add(new MyCard(R.drawable.p3,"This is the caption of the image one with all the text written in just one line"));
        exampleList.add(new MyCard(R.drawable.p4,"This is the caption of the image one with all the text written in just one line"));
        exampleList.add(new MyCard(R.drawable.p5,"This is the caption of the image one with all the text written in just one line"));
        exampleList.add(new MyCard(R.drawable.p6,"This is the caption of the image one with all the text written in just one line"));

    }
    public void fakeList1(){
        examplelist1= new ArrayList<>();
        examplelist1.add(new StoryCard(R.drawable.p1,"Navjyot Singh"));
        examplelist1.add(new StoryCard(R.drawable.p2,"Navjyot Singh"));
        examplelist1.add(new StoryCard(R.drawable.p3,"Navjyot Singh"));
        examplelist1.add(new StoryCard(R.drawable.p4,"Navjyot Singh"));
        examplelist1.add(new StoryCard(R.drawable.p5,"Navjyot Singh"));
        examplelist1.add(new StoryCard(R.drawable.p6,"Navjyot Singh"));examplelist1.add(new StoryCard(R.drawable.p1,"Navjyot Singh"));
        examplelist1.add(new StoryCard(R.drawable.p2,"Navjyot Singh"));
        examplelist1.add(new StoryCard(R.drawable.p3,"Navjyot Singh"));
        examplelist1.add(new StoryCard(R.drawable.p4,"Navjyot Singh"));
        examplelist1.add(new StoryCard(R.drawable.p5,"Navjyot Singh"));
        examplelist1.add(new StoryCard(R.drawable.p6,"Navjyot Singh"));examplelist1.add(new StoryCard(R.drawable.p1,"Navjyot Singh"));
        examplelist1.add(new StoryCard(R.drawable.p2,"Navjyot Singh"));
        examplelist1.add(new StoryCard(R.drawable.p3,"Navjyot Singh"));
        examplelist1.add(new StoryCard(R.drawable.p4,"Navjyot Singh"));
        examplelist1.add(new StoryCard(R.drawable.p5,"Navjyot Singh"));
        examplelist1.add(new StoryCard(R.drawable.p6,"Navjyot Singh"));

    }

}
