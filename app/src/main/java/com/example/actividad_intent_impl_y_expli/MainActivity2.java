package com.example.actividad_intent_impl_y_expli;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button buttonimp1;
    Button buttonimp2;
    Button buttonimp3;
    Button buttonimp4;


    Button buttonexpl1;
    Button buttonexpl2;
    Button buttonexpl3;
    Button buttonexpl4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonimp1 = findViewById(R.id.button6);
        buttonimp2 = findViewById(R.id.button7);
        buttonimp3 = findViewById(R.id.button8);
        buttonimp4 = findViewById(R.id.button9);

        buttonexpl1 = findViewById(R.id.button);
        buttonexpl2 = findViewById(R.id.button3);
        buttonexpl3 = findViewById(R.id.button4);
        buttonexpl4 = findViewById(R.id.button5);
    }

    public void onClick1(View view)
    {
        searchWeb("Android Studio XML ConstraintLayout");
    }

    public void onClick2(View view)
    {
        searchWeb("Android Studio XML RelativeLayout");
    }

    public void onClick3(View view)
    {
        searchWeb("Android Studio XML LinearLayout");
    }

    public void onClick4(View view)
    {
        searchWeb("Android Studio XML FrameLayout");
    }

    public void searchWeb(String query)
    {
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, query);
        if(intent.resolveActivity(getPackageManager()) != null)
        {
            startActivity(intent);
        }
    }

    //Botones con Intents explícitos

    public void enter1(View v)
    {
        Intent intent = new Intent(this, Pantalla1.class);
        startActivity(intent);
    }

    public void enter2(View v)
    {
        Intent intent = new Intent(this, Pantalla2.class);
        startActivity(intent);
    }

    public void enter3(View v)
    {
        Intent intent = new Intent(this, Pantalla3.class);
        startActivity(intent);
    }

    public void enter4(View v)
    {
        Intent intent = new Intent(this, Pantalla4.class);
        startActivity(intent);
    }
}