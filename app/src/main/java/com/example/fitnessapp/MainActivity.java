package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView titre;
Button male ;
Button female;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titre=findViewById(R.id.title);
        male=findViewById(R.id.button2);
        female=findViewById(R.id.button);
        male.setOnClickListener(view -> {


            Intent intent = new Intent(this, Menu.class);
            startActivity(intent);

        });
    }
}