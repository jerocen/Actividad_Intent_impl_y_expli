package com.example.actividad_intent_impl_y_expli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button2);
    }

    public void entrar(View v)
    {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}