package com.example.admin.trafficlight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRelativeLayout = (RelativeLayout)findViewById(R.id.activity_main);

    }

    public void onRedButtonClick(View view) {

    mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.colorRed));
}

    public void onGreenButtonClick(View view) {

        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.colorGreen));
    }

    public void onYellowButtonClick(View view) {

        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.colorYellow));
    }
}
