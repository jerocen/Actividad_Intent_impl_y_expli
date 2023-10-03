package com.example.actividad_intent_impl_y_expli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.CountDownTimer;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{
    Button button;

    private TextView countdownTextView;
    private CountDownTimer countDownTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button = findViewById(R.id.button2);

        countdownTextView = findViewById(R.id.countdown_timer);

        startCountdownTimer();
    }

    private void startCountdownTimer()
    {
        countDownTimer = new CountDownTimer(5000, 1000)
        {
            @Override
            public void onTick(long millisUntilFinished)
            {
                long secondRemaining = millisUntilFinished / 1000;
                countdownTextView.setText(secondRemaining + "seg.");
            }

            @Override
            public void onFinish()
            {
                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
            }
        }.start();
    }

    //-------------------------------------------------------------------------

    public void entrar(View v)
    {
        //Intent intent = new Intent(this, MainActivity2.class);
        //startActivity(intent);
    }

}