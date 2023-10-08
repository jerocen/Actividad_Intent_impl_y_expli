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
    private TextView countdownText;
    private TextView timeRemainingText;
    private CountDownTimer countDownTimer;
    private long timeLeftInMillis = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countdownText = findViewById(R.id.countdownText);
        timeRemainingText = findViewById(R.id.timeRemainingText);

        // Iniciar el contador de tiempo
        startCountdownTimer();
    }

    private void startCountdownTimer()
    {
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateCountdownText();
            }

            @Override
            public void onFinish() {
                timeLeftInMillis = 0;
                updateCountdownText();
                navigateToOtherActivity();
            }
        }.start();
    }

    //-------------------------------------------------------------------------

    private void updateCountdownText() {
        long seconds = timeLeftInMillis / 1000;
        countdownText.setText(String.valueOf(seconds));
        timeRemainingText.setText("segundos restantes");
    }

    private void navigateToOtherActivity() {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
        finish(); // Opcionalmente, puedes finalizar esta actividad para que no se pueda volver atrás
    }

}