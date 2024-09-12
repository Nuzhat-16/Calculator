package com.example.calc;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView result;
    double num1, num2, ans;
    char c = '0';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.tv1);
    }

    public void numOne(View view) {
        String s = result.getText().toString();
        result.setText(s + "1");
    }

    public void numTwo(View view) {
        String s = result.getText().toString();
        result.setText(s + "2");
    }

    public void numThree(View view) {
        String s = result.getText().toString();
        result.setText(s + "3");
    }

    public void numFour(View view) {
        String s = result.getText().toString();
        result.setText(s + "4");
    }

    public void numFive(View view) {
        String s = result.getText().toString();
        result.setText(s + "5");
    }

    public void numSix(View view) {
        String s = result.getText().toString();
        result.setText(s + "6");
    }

    public void numSeven(View view) {
        String s = result.getText().toString();
        result.setText(s + "7");
    }

    public void numEight(View view) {
        String s = result.getText().toString();
        result.setText(s + "8");
    }

    public void numNine(View view) {
        String s = result.getText().toString();
        result.setText(s + "9");
    }

    public void numZero(View view) {
        String s = result.getText().toString();
        if (s.length() != 0) {
            result.setText(s + "0");
        }
    }

    public void numAC(View view) {
        result.setText("");
    }

    public void numC(View view) {
        String s = result.getText().toString();
        if (s.length() != 0) {
            s = s.substring(0, s.length() - 1);
            result.setText(s);
        }

    }
    public void numPlus(View view) {
        String s = result.getText().toString();
        if (!s.isEmpty()) {
            num1 = Double.parseDouble(s);
            result.setText(s + "+"); // Append the operator to the current number
            c = '+';
        }
    }

    public void numMinus(View view) {
        String s = result.getText().toString();
        if (!s.isEmpty()) {
            num1 = Double.parseDouble(s);
            result.setText(s + "-"); // Append the operator to the current number
            c = '-';
        }
    }

    public void numMultiply(View view) {
        String s = result.getText().toString();
        if (!s.isEmpty()) {
            num1 = Double.parseDouble(s);
            result.setText(s + "*"); // Append the operator to the current number
            c = '*';
        }
    }

    public void numDivide(View view) {
        String s = result.getText().toString();
        if (!s.isEmpty()) {
            num1 = Double.parseDouble(s);
            result.setText(s + "/"); // Append the operator to the current number
            c = '/';
        }
    }

    public void numEqual(View view) {
        String s = result.getText().toString();
        if (!s.isEmpty() && c != '0') {
            // Find the index of the operator to split the string correctly
            int operatorIndex = s.indexOf(c);
            if (operatorIndex != -1) {
                num1 = Double.parseDouble(s.substring(0, operatorIndex));
                num2 = Double.parseDouble(s.substring(operatorIndex + 1));

                switch (c) {
                    case '+':
                        ans = num1 + num2;
                        break;
                    case '-':
                        ans = num1 - num2;
                        break;
                    case '*':
                        ans = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            ans = num1 / num2;
                        } else {
                            result.setText("Error"); // Handle division by zero
                            return;
                        }
                        break;
                }
                result.setText(String.valueOf(ans));
                c = '0'; // Reset the operator
            }
        }
    }}
