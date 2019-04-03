package com.litlime.its_d3c;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText txt1 = (EditText) findViewById(R.id.editText);

    Button n1 = (Button) findViewById(R.id.num1);

}
