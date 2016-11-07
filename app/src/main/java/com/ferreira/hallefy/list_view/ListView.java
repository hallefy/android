package com.ferreira.hallefy.list_view;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

public class ListView extends AppCompatActivity {


    private static final String TAG = "RecyclerViewExample";
    private List<FeedItem> feedItemList = new ArrayList<FeedItem>();
    private RecyclerView mRecyclerView;
    private MyRecyclerAdapter adapter;
    private ProgressBar progressBar;
    public String[] list;
    private SharedPreferences mPreferences;
    private String user_id = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);


     
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new MyRecyclerAdapter(ListView.this, feedItemList);
        mRecyclerView.setAdapter(adapter);

        FeedItem item = new FeedItem();

        item.setEventDate("10/11/2016");
        item.setEventName("Example of event name");

        feedItemList.add(item);

    }
}
