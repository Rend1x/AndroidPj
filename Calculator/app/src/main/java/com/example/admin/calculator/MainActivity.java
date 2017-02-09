package com.example.admin.calculator;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String FIRST_KEY = "firstKey";
    public static final String SECOND_KEY = "secondKey";

    private EditText firstNumber;
    private EditText secondNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = (EditText) findViewById(R.id.firstNumber);
        secondNumber = (EditText) findViewById(R.id.secondNumber);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNumber.getText().toString().equals("")) {
                    firstNumber.setError(getString(R.string.fillError));
                    return;
                }
                if (secondNumber.getText().toString().equals("")) {
                    secondNumber.setError(getString(R.string.fillError));
                    return;
                }
                if(firstNumber.length() > 9){
                    firstNumber.setError(getString(R.string.fillError1));
                    return;
                }
                if(secondNumber.length() > 9){
                    secondNumber.setError(getString(R.string.fillError1));
                    return;
                }

                int firstN = Integer.valueOf(firstNumber.getText().toString());
                int secondN = Integer.valueOf(secondNumber.getText().toString());

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra(FIRST_KEY, firstN);
                intent.putExtra(SECOND_KEY, secondN);
                startActivity(intent);
            }
        });
    }

}



