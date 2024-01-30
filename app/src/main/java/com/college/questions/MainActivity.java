package com.college.questions;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.college.questions.databinding.ActivityMainBinding;

import java.util.Locale;

/*
 TODO: Convert the below code to use View Binding
*/

public class MainActivity extends AppCompatActivity {

    static private final String TAG = "MainActivity";
    private ActivityMainBinding variableBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        variableBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(variableBinding.getRoot());

        Button  addButton  = variableBinding.addButton ;
        TextView tvResult = variableBinding.operationResult;

        addButton.setOnClickListener( (v) -> {
            EditText operandOne = variableBinding.operandOneEdit;
            EditText operandTwo  = variableBinding.operandTwoEdit;

            String firstNumber = operandOne.getText().toString();
            String secondNumber = operandTwo.getText().toString();
            try {
                Integer numberOne = Integer.valueOf( firstNumber);
                Integer numberTwo = Integer.valueOf(secondNumber);
                int total = numberOne + numberTwo;

                tvResult.setText(String.format(Locale.CANADA, "%d", total));
            } catch (NumberFormatException e) {
                tvResult.setText(R.string.computationError);
            }

        });
    }


}
