package com.example.livestrimingui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        livestreamListData[] myListData= new livestreamListData[]{
                new livestreamListData("Artist ABC","Pune","11/02/2020",R.drawable.slider1),
                new livestreamListData("Artist ABC","Pune","11/02/2020",R.drawable.slider1),
                new livestreamListData("Artist ABC","Pune","11/02/2020",R.drawable.slider1),
                new livestreamListData("Artist ABC","Pune","11/02/2020",R.drawable.slider1),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.djparty_recycler_view);
        livestreamListAdapter adapter = new livestreamListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}
