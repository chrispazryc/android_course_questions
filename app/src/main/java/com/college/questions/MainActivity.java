package com.college.questions;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

/*
 TODO:
 Implement the DIV, SUB, MUL, and DIV operations

 */
public class MainActivity extends AppCompatActivity {

    static private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int getOperandOne() {
        EditText op1 = findViewById(R.id.operand_one_edit_1);
        return Integer.parseInt(op1.getText().toString());
    }

    int getOperandTwo() {
        EditText op2 = findViewById(R.id.operand_two_edit_2);
        return Integer.parseInt(op2.getText().toString());
    }

    public void addOperands(View view) {
        int result = getOperandOne() + getOperandTwo();
        TextView resultBox = findViewById(R.id.operation_result);
        resultBox.setText(String.format(Locale.US, "%d", result));
    }

    public void subtractOperands(View view) {
        int result = getOperandOne() - getOperandTwo();
        TextView resultBox = findViewById(R.id.operation_result);
        resultBox.setText(String.format(Locale.US, "%d", result));
    }

    public void multiplyOperands(View view) {
        int result = getOperandOne() * getOperandTwo();
        TextView resultBox = findViewById(R.id.operation_result);
        resultBox.setText(String.format(Locale.US, "%d", result));
    }

    public void divideOperands(View view) {
        double result = (double) getOperandOne() / getOperandTwo();
        int mod = getOperandOne() % getOperandTwo();
        TextView resultBox = findViewById(R.id.operation_result);
        if (mod == 0) {
            int resultInt = (int) result;
            resultBox.setText(String.format(Locale.US, "%d", resultInt));
        } else {
            resultBox.setText(String.format(Locale.US, "%.2f", result));
        }

    }
}
