package com.example.calculatorjava;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8,button9, addButton, subButton, divButton, clearButton, equalButton, dotButton, multButton, negButton, percentageButton;

    TextView CalculationView;

    float valueOne, valueTwo;



    boolean isAddition, isSubstraction, isMultiplication, isDivision, isNegative, isDecimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.Number_0);
        button1 = findViewById(R.id.Number_1);
        button2 = findViewById(R.id.Number_2);
        button3 = findViewById(R.id.Number_3);
        button4 = findViewById(R.id.Number_4);
        button5 = findViewById(R.id.Number_5);
        button6 = findViewById(R.id.Number_6);
        button7 = findViewById(R.id.Number_7);
        button8 = findViewById(R.id.Number_8);
        button9 = findViewById(R.id.Number_9);
        dotButton = findViewById(R.id.Dot);
        clearButton = findViewById(R.id.All_Clear);
        subButton = findViewById(R.id.Substract);
        addButton = findViewById(R.id.Addition);
        divButton = findViewById(R.id.Divide);
        multButton = findViewById(R.id.Multiply);
        equalButton = findViewById(R.id.Equal);
        negButton = findViewById(R.id.Negative_Sign);
        percentageButton = findViewById(R.id.Percentage);
        CalculationView = findViewById(R.id.calText);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    CalculationView.setText(CalculationView.getText().toString() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    CalculationView.setText(CalculationView.getText().toString() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculationView.setText(CalculationView.getText().toString() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculationView.setText(CalculationView.getText().toString() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculationView.setText(CalculationView.getText().toString() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculationView.setText(CalculationView.getText().toString() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculationView.setText(CalculationView.getText().toString() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculationView.setText(CalculationView.getText().toString() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculationView.setText(CalculationView.getText().toString() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculationView.setText(CalculationView.getText().toString() + "9");
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                CalculationView.setText("");
            }
        });

        dotButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                CalculationView.setText(CalculationView.getText().toString() + ".");
                isDecimal = true;
            }
        });

        negButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, CalculationView.getText(), Toast.LENGTH_SHORT).show();
                if(CalculationView.getText() == ""){
                    CalculationView.setText("-" + CalculationView.getText().toString());
                }
                else {
                    valueOne = Float.parseFloat(CalculationView.getText() + "");
                    CalculationView.setText(valueOne * -1 + "");
                }
            }
        });

        percentageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                valueOne = Float.parseFloat(CalculationView.getText() + "");
                CalculationView.setText(valueOne / 100 + "");
            }
        });

        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (CalculationView == null){
                    CalculationView.setText("");
                }
                else
                {
                    valueOne = Float.parseFloat(CalculationView.getText() + "");
                    isAddition = true;
                    CalculationView.setText(null);
                }
            }
        });

        subButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (CalculationView == null){
                    CalculationView.setText("");
                }
                else
                {
                    valueOne = Float.parseFloat(CalculationView.getText() + "");
                    isSubstraction = true;
                    CalculationView.setText(null);
                }
            }
        });

        multButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (CalculationView == null){
                    CalculationView.setText("");
                }
                else
                {
                    valueOne = Float.parseFloat(CalculationView.getText() + "");
                    isMultiplication = true;
                    CalculationView.setText(null);
                }
            }
        });

        divButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (CalculationView == null){
                    CalculationView.setText("");
                }
                else
                {
                    valueOne = Float.parseFloat(CalculationView.getText() + "");
                    isDivision = true;
                    CalculationView.setText(null);
                }

            }
        });



        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueTwo = Float.parseFloat(CalculationView.getText() + "");

                if (isAddition == true)
                {
                    CalculationView.setText(valueOne + valueTwo + "");
                    isAddition = false;
                }

                if (isSubstraction == true)
                {
                    CalculationView.setText(valueOne - valueTwo + "");
                    isSubstraction = false;
                }

                if (isMultiplication == true)
                {
                    CalculationView.setText(valueOne * valueTwo + "");
                    isMultiplication = false;
                }

                if (isDivision)
                {
                    if (valueTwo != 0) {
                        CalculationView.setText(valueOne / valueTwo + "");
                        isDivision = false;
                    }
                    else {
                        CalculationView.setText("ERROR");
                    }
                }
            }
        });
    }
}