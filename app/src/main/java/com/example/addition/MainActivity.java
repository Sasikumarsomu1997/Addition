package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstNumber , secondNumber;

    TextView answer;

    Button btn_calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        btn_calculate = findViewById(R.id.calculate);
        answer = findViewById(R.id.answer);

        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = firstNumber.getText().toString();
                String num2Str = secondNumber.getText().toString();


                if (!num1Str.isEmpty() && !num2Str.isEmpty()){

                    double num1 = Double.parseDouble(num1Str);
                    double num2 = Double.parseDouble(num2Str);
                    double sum = num1 + num2;
                    answer.setText(String.valueOf(sum));
                }
                else {

                    answer.setText("Enter Two Numbers");
                }

            }
        });
    }
}