package com.litlime.its_d3c;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double value1;
    char cur0p;
    EditText txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText) findViewById(R.id.editText);

        txt1.setInputType(InputType.TYPE_NULL);

        txt1.setText("");

        Button num1 = (Button) findViewById(R.id.num1);

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "1");
            }
        });

        Button num2 = (Button) findViewById(R.id.num2);

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "2");
            }
        });

        Button num3 = (Button) findViewById(R.id.num3);

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "3");
            }
        });

        Button num4 = (Button) findViewById(R.id.num4);

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "4");
            }
        });
        Button num5 = (Button) findViewById(R.id.num5);

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "5");
            }
        });

        Button num6 = (Button) findViewById(R.id.num6);

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "6");
            }
        });

        Button num7 = (Button) findViewById(R.id.num7);

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "7");
            }
        });

        Button num8 = (Button) findViewById(R.id.num8);

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "8");
            }
        });
        Button num9 = (Button) findViewById(R.id.num9);

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "9");
            }
        });

        Button num0 = (Button) findViewById(R.id.num0);

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText() + "0");
            }
        });

        Button op_add = (Button) findViewById(R.id.op_add);

        op_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Double.parseDouble(txt1.getText().toString());
                cur0p = '+';
                txt1.setText("");

            }
        });
        Button op_eq = (Button) findViewById(R.id.op_eq);

        op_eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcProc();
            }
        });
    }

    void calcProc() {
        try {
            double value2 = Double.parseDouble(txt1.getText().toString());
            double res;
            if (Double.isNaN(value1) || Double.isNaN(value2)) {
                return;
            }
            if (cur0p == '+') {
                res = value1 + value2;
            } else if (cur0p == '-') {
                res = value1 - value2;
            } else if (cur0p == '/') {
                if (value1 == 0) return;
                res = value1 / value2;
            } else if (cur0p == '*') {
                res = value1 * value2;
            } else {
                return;
            }
            cur0p = ' ';

            txt1.setText(Double.toString(res));

        } catch (Exception e) {

            Toast.makeText(getApplicationContext(),
                    "devi inserire un numero",
                    Toast.LENGTH_LONG).show();
        }


    }
}

