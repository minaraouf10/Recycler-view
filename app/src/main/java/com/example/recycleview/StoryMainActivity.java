package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class StoryMainActivity extends AppCompatActivity {
    RecyclerView storyRecyclerView ;
    StoryAdapter adapter ;
    List<StoryItem> storyItemList ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_main);
        storyRecyclerView =findViewById(R.id.recycle_view);

        CreateList();
        adapter = new StoryAdapter(storyItemList);

    }

        public void CreateList() {
            storyItemList = new ArrayList<>();

            storyItemList.add(new StoryItem(R.color.black,"Name",R.drawable.ic_wifi));

            for(int i =0 ;i<100;i++){
                storyItemList.add(new StoryItem(R.color.black,"Name",R.drawable.ic_wifi));
            }
        }
    }