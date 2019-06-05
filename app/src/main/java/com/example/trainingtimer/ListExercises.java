package com.example.trainingtimer;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.example.trainingtimer.Adapter.RecyclerViewAdapter;
import com.example.trainingtimer.Model.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ListExercises extends AppCompatActivity {

    List<Exercise> exerciseList = new ArrayList<>();
    RecyclerView.LayoutManager layoutManager;
    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_exercises);



        initData();

        recyclerView = (RecyclerView)findViewById(R.id.list_ex);
        adapter = new RecyclerViewAdapter(exerciseList,getApplicationContext());
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }

    private void initData() {

        exerciseList.add(new Exercise(R.drawable.rumpa,"BUTT"));
        exerciseList.add(new Exercise(R.drawable.mage,"ABS"));
        exerciseList.add(new Exercise(R.drawable.ben,"LEGS"));
        exerciseList.add(new Exercise(R.drawable.rygg,"BACK"));
        exerciseList.add(new Exercise(R.drawable.armhavning,"CHEST"));






    }
}
