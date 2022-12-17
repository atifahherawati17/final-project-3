package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNum1, etNum2;
    int num1, num2;
    TextView tvResultado;
    Button sumBtn, divBtn, subBtn, multBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);
        subBtn = (Button) findViewById(R.id.btnSub);
        multBtn = (Button) findViewById(R.id.btnMult);
        divBtn = (Button) findViewById(R.id.btnDiv);
        sumBtn = (Button) findViewById(R.id.btnSum);

        tvResultado = (TextView) findViewById(R.id.tvResultado);
    }

    public void sum(View v) {
        sumBtn.setBackgroundColor(Color.RED);
        divBtn.setBackgroundColor(Color.BLACK);
        multBtn.setBackgroundColor(Color.BLACK);
        subBtn.setBackgroundColor(Color.BLACK);
        
        if (etNum1.getText().toString().isEmpty() || etNum2.getText().toString().isEmpty()) {
            tvResultado.setText("Provide number in both textfield.");
        } else {
            num1 = Integer.parseInt(etNum1.getText().toString());
            num2 = Integer.parseInt(etNum2.getText().toString());

            int sum = num1 + num2;
            tvResultado.setText(Integer.toString(sum));
        }
    }

    public void sub(View v) {
        subBtn.setBackgroundColor(Color.RED);
        divBtn.setBackgroundColor(Color.BLACK);
        multBtn.setBackgroundColor(Color.BLACK);
        sumBtn.setBackgroundColor(Color.BLACK);
        if (etNum1.getText().toString().isEmpty() || etNum2.getText().toString().isEmpty()) {
            tvResultado.setText("Provide number in both textfield.");
        } else {
            num1 = Integer.parseInt(etNum1.getText().toString());
            num2 = Integer.parseInt(etNum2.getText().toString());

            int res = num1 - num2;
            tvResultado.setText(Integer.toString(res));
        }
    }

    public void multiplication(View v) {
        multBtn.setBackgroundColor(Color.RED);
        divBtn.setBackgroundColor(Color.BLACK);
        subBtn.setBackgroundColor(Color.BLACK);
        sumBtn.setBackgroundColor(Color.BLACK);
        if (etNum1.getText().toString().isEmpty() || etNum2.getText().toString().isEmpty()) {
            tvResultado.setText("Provide number in both textfield.");
        } else {
            num1 = Integer.parseInt(etNum1.getText().toString());
            num2 = Integer.parseInt(etNum2.getText().toString());

            int mult = num1 * num2;
            tvResultado.setText(Integer.toString(mult));
        }
    }

    public void division(View v) {
        divBtn.setBackgroundColor(Color.RED);
        multBtn.setBackgroundColor(Color.BLACK);
        subBtn.setBackgroundColor(Color.BLACK);
        sumBtn.setBackgroundColor(Color.BLACK);
        if (etNum1.getText().toString().isEmpty() || etNum2.getText().toString().isEmpty()) {
            tvResultado.setText("Provide number in both textfield.");
        } else {
            num1 = Integer.parseInt(etNum1.getText().toString());
            num2 = Integer.parseInt(etNum2.getText().toString());

            int div = num1 / num2;
            tvResultado.setText(Integer.toString(div));
        }
    }

    public void reseter(View v) {
        etNum1.setText("");
        etNum2.setText("");
        tvResultado.setText("");
        divBtn.setBackgroundColor(Color.BLACK);
        multBtn.setBackgroundColor(Color.BLACK);
        subBtn.setBackgroundColor(Color.BLACK);
        sumBtn.setBackgroundColor(Color.BLACK);
    }
}