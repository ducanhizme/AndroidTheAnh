package com.example.listview;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ListViewAdapter adapter;
    ArrayList<ItemModel> items = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
        mapping();
        initLv();
    }

    private void initLv() {
        adapter = new ListViewAdapter(items,R.layout.item_layout,this);
        lv.setAdapter(adapter);
    }

    private void mapping() {
        lv = findViewById(R.id.lv);
    }

    private void initList(){
        this.items.add(new ItemModel("abc","1m7",R.drawable.avatar,R.drawable.clb));
        this.items.add(new ItemModel("abc","1m7",R.drawable.avatar,R.drawable.clb));
        this.items.add(new ItemModel("abc","1m89",R.drawable.avatar,R.drawable.clb));
        this.items.add(new ItemModel("abc","1m7",R.drawable.avatar,R.drawable.clb));
        this.items.add(new ItemModel("abc","1m7",R.drawable.avatar,R.drawable.clb));
        this.items.add(new ItemModel("abc","1m7",R.drawable.avatar,R.drawable.clb));
        this.items.add(new ItemModel("abc","1m7",R.drawable.avatar,R.drawable.clb));
        this.items.add(new ItemModel("abc","1m7",R.drawable.avatar,R.drawable.clb));
    }
}