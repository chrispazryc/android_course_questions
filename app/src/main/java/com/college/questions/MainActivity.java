package com.college.questions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This EditText contains the user input
        // for the number of burgers
        EditText numberStr = findViewById(R.id.numberId);

        // This textview displays the result of multiplying
        // the content of the numberId EditText by 5
        TextView resultTv = findViewById(R.id.resultId);

        // TODO
        // Implement the 2 listeners for buttons 'clear' and 'pay'
        // One burger is $5
        // Result should contain 5 multiplied by number chosen
        // Display should be prefixed with the '$' sign such as $15
        // Reset should clear all the fields

        Button clearBtn = findViewById(R.id.btnResetId);
        Button payBtn = findViewById(R.id.btnPayId);

        payBtn.setOnClickListener( v -> {

            int result = Integer.parseInt(numberStr.getText().toString()) * 5;
            resultTv.setText(String.format(Locale.US,"$%d", result));
        });

        clearBtn.setOnClickListener( v -> {
            resultTv.setText(String.format(Locale.US, "%s", "0"));
            numberStr.setText(String.format(Locale.US, "%s", ""));
        });


    }
}