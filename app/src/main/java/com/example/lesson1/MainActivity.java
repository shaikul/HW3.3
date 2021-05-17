package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private BlankFragment1 blankFragment1;
    private BlankFragment2 blankFragment2;
    private BlankFragment3 blankFragment3;
    private BlankFragment4 blankFragment4;
    private BlankFragment5 blankFragment5;
    private Button first, second,third, four, five;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blankFragment1 = new BlankFragment1();
        blankFragment2 = new BlankFragment2();
        blankFragment3 = new BlankFragment3();
        blankFragment4 = new BlankFragment4();
        blankFragment5 = new BlankFragment5();
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,blankFragment1).addToBackStack(null).commit();
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,blankFragment2).addToBackStack(null).commit();

            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,blankFragment3).addToBackStack(null).commit();
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,blankFragment4).addToBackStack(null).commit();

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,blankFragment5).addToBackStack(null).commit();

            }
        });


    }
}