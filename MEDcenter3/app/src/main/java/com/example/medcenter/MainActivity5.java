package com.example.medcenter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        textView = (TextView) findViewById(R.id.textView3);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");

        textView.setText(name);
    }
}