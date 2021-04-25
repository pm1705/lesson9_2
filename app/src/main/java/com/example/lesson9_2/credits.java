package com.example.lesson9_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class credits extends AppCompatActivity {
    String last;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        Intent gi = getIntent();
        t1 = (TextView) findViewById(R.id.t1);
        last = gi.getStringExtra("last");
        t1.setText(last);

    }

    public void backtocalc(View view) {
        Intent ri = new Intent(this,MainActivity.class);
        startActivity(ri);
    }
}