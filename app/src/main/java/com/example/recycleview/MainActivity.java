package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView settingsRecyclerView ;
    SettingMenuAdapter adapter ;
    List<SettingItem> settingItemList ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        settingsRecyclerView =findViewById(R.id.recycle_view);

        createSettingList();

        adapter = new SettingMenuAdapter(settingItemList);
        settingsRecyclerView.setAdapter(adapter);
    }

     void createSettingList() {
        settingItemList = new ArrayList<>();

        settingItemList.add(new SettingItem("Wifi and Setting"
                ,"see wifi setting",R.drawable.ic_wifi));

         settingItemList.add(new SettingItem("Apps and permissions"
                 ,"see application list",R.drawable.ic_apps));

         for(int i =0 ;i<1000;i++){
             settingItemList.add(new SettingItem("item num"+i+" title"
                     ,"sub item num"+i+" sub title",R.drawable.ic_apps));
         }
    }
}