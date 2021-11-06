package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;

public class Menu extends AppCompatActivity {
TabItem home , calculator , exercice ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        home=findViewById(R.id.home);
        calculator=findViewById(R.id.calculator);
        exercice=findViewById(R.id.exercices);
        getSupportFragmentManager().beginTransaction().replace(R.id.homeframe,HomeFragment.newInstance()).commit();

    }
}