package com.example.medcenter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    @SuppressLint("SetTextI18n")
    public void terapevt1(View view) {
        Intent intent = new Intent(MainActivity3.this, MainActivityTe.class);
        startActivity(intent);
    }
    @SuppressLint("SetTextI18n")
    public void okulist1(View view) {
        Intent intent = new Intent(MainActivity3.this, MainActivityOk.class);
        startActivity(intent);
    }
    @SuppressLint("SetTextI18n")
    public void xirurg1(View view) {
        Intent intent = new Intent(MainActivity3.this, MainActivityXi.class);
        startActivity(intent);
    }
    @SuppressLint("SetTextI18n")
    public void endokrinolog1(View view) {
        Intent intent = new Intent(MainActivity3.this, MainActivityEn.class);
        startActivity(intent);
    }
}