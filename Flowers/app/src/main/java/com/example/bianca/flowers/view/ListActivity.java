package com.example.bianca.flowers.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.bianca.flowers.R;
import com.example.bianca.flowers.model.Flower;
import com.example.bianca.flowers.model.FlowersAdapter;
import com.example.bianca.flowers.model.FlowersAdapterListener;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity implements FlowersAdapterListener {

    private RecyclerView mRecyclerView;
    private FlowersAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        mRecyclerView = findViewById(R.id.flowers_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setHasFixedSize(true);

        mAdapter = new FlowersAdapter(new ArrayList<Flower>(), this);
        mRecyclerView.setAdapter(mAdapter);

    }

    @Override
    public void onFlowerSelected(int position) {

    }
}
