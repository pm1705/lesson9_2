package com.example.lesson9_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    int lastanswer = 0;
    int[] format = {0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
    }

    public void plus(View view) {
        if (!et1.getText().toString().matches("")){
            format[0] = Integer.parseInt(et1.getText().toString());
        }
        format[1] = 0;
        et1.setText("");
    }

    public void minus(View view) {
        if (!et1.getText().toString().matches("")){
            format[0] = Integer.parseInt(et1.getText().toString());
        }
        format[1] = 1;
        et1.setText("");
    }

    public void multi(View view) {
        if (!et1.getText().toString().matches("")){
            format[0] = Integer.parseInt(et1.getText().toString());
        }
        format[1] = 2;
        et1.setText("");
    }

    public void divide(View view) {
        if (!et1.getText().toString().matches("")){
            format[0] = Integer.parseInt(et1.getText().toString());
        }
        format[1] = 3;
        et1.setText("");
    }

    public void clear(View view) {
        format[0] = 0;
        format[1] = 0;
        format[2] = 0;
        et1.setText("");
    }

    public void equals(View view) {
        if (!et1.getText().toString().matches("")){
            format[2] = Integer.parseInt(et1.getText().toString());
        }
        else{
            if (format[1] == 2 || format[1] == 3){
                format[2] = 1;
            }
            else{
                format[2] = 0;
            }
        }
        if (format[1] == 0){
            lastanswer = format[0] + format[2];
        }
        else if (format[1] == 1){
            lastanswer = format[0] - format[2];
        }
        else if (format[1] == 2){
            lastanswer = format[0] * format[2];
        }
        else if (format[1] == 3){
            lastanswer = format[0] / format[2];
        }
        format[0] = lastanswer;
        et1.setText(String.valueOf(lastanswer));
    }

    public void clear2(View view) {
        et1.setText("");
    }

    public void sof(View view) {
        Intent si = new Intent(this,credits.class);
        si.putExtra("last", (String.valueOf(lastanswer)));
        startActivity(si);
    }
}