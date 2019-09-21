package com.As.mobilecomputingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ColorScreen extends AppCompatActivity {

    Button Red,Black,Blue,Green,Look;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_screen);
        Red=(Button)findViewById(R.id.Red);
        Black=(Button)findViewById(R.id.Black);
        Blue=(Button)findViewById(R.id.Blue);
        Green=(Button)findViewById(R.id.Green);
        Look=(Button)findViewById(R.id.Look);


        Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Look.setBackgroundColor(Color.RED);
            }
        });

        Blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Look.setBackgroundColor(Color.BLUE);
            }
        });

        Black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Look.setBackgroundColor(Color.YELLOW);
            }
        });

        Green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Look.setBackgroundColor(Color.GREEN);
            }
        });


    }






}
