package com.example.basiccalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Num1, Num2;
    TextView Result;
    Button Add, Sub, Mul, Div;
    int NUM1, NUM2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = (EditText)findViewById(R.id.num1);
        Num2 = (EditText)findViewById(R.id.num2);
        Result = (TextView)findViewById(R.id.result);
        Add = (Button)findViewById(R.id.add);
        Sub = (Button)findViewById(R.id.sub);
        Mul = (Button)findViewById(R.id.mul);
        Div = (Button)findViewById(R.id.div);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUM1 = Integer.parseInt(Num1.getText().toString());
                NUM2 = Integer.parseInt(Num2.getText().toString());
                Result.setText(Integer.toString(NUM1+NUM2));
            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUM1 = Integer.parseInt(Num1.getText().toString());
                NUM2 = Integer.parseInt(Num2.getText().toString());
                Result.setText(Integer.toString(NUM1-NUM2));
            }
        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUM1 = Integer.parseInt(Num1.getText().toString());
                NUM2 = Integer.parseInt(Num2.getText().toString());
                Result.setText(Integer.toString(NUM1*NUM2));
            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUM1 = Integer.parseInt(Num1.getText().toString());
                NUM2 = Integer.parseInt(Num2.getText().toString());
                Result.setText(Integer.toString(NUM1/NUM2));
            }
        });



    }
}
