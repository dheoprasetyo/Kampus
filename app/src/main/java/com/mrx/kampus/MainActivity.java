package com.mrx.kampus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKampus;
    private TextView txtdetail;
    private ArrayList<Kampus> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKampus = findViewById(R.id.rv_kampus);
        rvKampus.setHasFixedSize(true);




        list.addAll(KampusData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvKampus.setLayoutManager(new LinearLayoutManager(this));
        ListKampusAdapter listKampusAdapter = new ListKampusAdapter(list);
        rvKampus.setAdapter(listKampusAdapter);
    }


}

