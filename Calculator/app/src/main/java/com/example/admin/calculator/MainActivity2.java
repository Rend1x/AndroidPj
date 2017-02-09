package com.example.admin.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();

        TextView answer = (TextView) findViewById(R.id.result);
        int firstN = intent.getIntExtra(MainActivity.FIRST_KEY, 0);
        int secondN = intent.getIntExtra(MainActivity.SECOND_KEY, 0);
        answer.setText(calculateAndConvert(firstN, secondN));
    }

    private String calculateAndConvert(int first, int second) {
        if(second >= 0)
            return first + " + " + second + " = " + (first + second);
            return first + " + (" + second + ") = " + (first + second);
    }
}
