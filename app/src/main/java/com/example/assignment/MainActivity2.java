package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import model.ExerciseFactory;
import model.IExerciseData;

public class MainActivity2 extends AppCompatActivity {
    private ExerciseFactory exerciseFactory;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        exerciseFactory = new ExerciseFactory();
        IExerciseData exercise = exerciseFactory.getModel();
        spinner = findViewById(R.id.spinExerciseType);
        ArrayAdapter<String> types =
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,exercise.getTypes());
        spinner.setAdapter(types);

    }

    public void btnGoOnClick(View view) {
        Intent intent1 =new Intent(this,MainActivity3.class);
        intent1.putExtra("TYPE",spinner.getSelectedItem().toString());
        startActivity(intent1);
    }
}