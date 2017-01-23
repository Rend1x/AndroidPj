package com.example.admin.football;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView germanyScoreView;
    private TextView brazilScoreView;

    private int germany_score = 0;
    private int brazil_score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        brazilScoreView = (TextView)findViewById(R.id.brazilScore);
        germanyScoreView = (TextView)findViewById(R.id.germanyScore);

    }

    public void onClickButtonWipe(View view) {
        germany_score = 0;
        brazil_score = 0;
        germanyScoreView.setText("0");
        brazilScoreView.setText("0");
    }


    public void onClickGermanyScorePlus(View view) {
        germanyScoreView.setText(String.valueOf(++germany_score));
    }

    public void onClickBrazilScorePlus(View view) {
        brazilScoreView.setText(String.valueOf(++brazil_score));
    }
}
