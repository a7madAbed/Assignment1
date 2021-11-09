package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import model.Exercise;
import model.ExerciseAdapter;
import model.ExerciseFactory;
import model.IExerciseData;

public class MainActivity3 extends AppCompatActivity {
    private ListView listView;
    private ExerciseFactory exerciseFactory;
    private ArrayList<Exercise> exercises;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        listView = findViewById(R.id.listView);
        exerciseFactory =new ExerciseFactory();
        exercises= new ArrayList<>();
        IExerciseData objData = exerciseFactory.getModel();
        Intent intent=getIntent();
        String type=intent.getStringExtra("TYPE");
        exercises = (ArrayList<Exercise>) objData.getExercises(type);
        ExerciseAdapter exerciseAdapter = new ExerciseAdapter(this,R.layout.list_row, exercises);
        listView.setAdapter(exerciseAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(getApplicationContext(),MainActivity4.class));
            }
        });
    }


}