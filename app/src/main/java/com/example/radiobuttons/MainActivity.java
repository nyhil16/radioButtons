package com.example.radiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv;
    private RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txtNum1);
        et2 = (EditText) findViewById(R.id.txtNum2);
        tv = (TextView) findViewById(R.id.txtRes);
        rb1 = (RadioButton) findViewById(R.id.rbSumar);
        rb2 = (RadioButton) findViewById(R.id.rbRestar);

    }

    //Metodo para calcular
    public void calcular(View view) {
        String valString1 = et1.getText().toString();
        String valString2 = et2.getText().toString();

        int val1 = Integer.parseInt(valString1);
        int val2 = Integer.parseInt(valString2);

        if(rb1.isChecked() == true) {
            int suma = val1 + val2;
            String res = String.valueOf(suma);
            tv.setText(res);
        } else if(rb2.isChecked() == true) {
            int resta = val1 - val2;
            String res = String.valueOf(resta);
            tv.setText(res);
        }
    }

}