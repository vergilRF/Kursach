package com.example.medcenter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityEn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_en);
    }

    @SuppressLint("SetTextI18n")
    public void time14(View view) {
        @SuppressLint("ShowToast") Toast toast = Toast.makeText(MainActivityEn.this, "Врач: Наумов Н.Д     " +
                "Время: 10:35     " +
                "Талон: У786", Toast.LENGTH_LONG);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void time13(View view) {
        @SuppressLint("ShowToast") Toast toast = Toast.makeText(MainActivityEn.this, "Врач: Наумов Н.Д     " +
                "Время: 11:00      " +
                "Талон: Я450", Toast.LENGTH_LONG);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void time15(View view) {
        @SuppressLint("ShowToast") Toast toast = Toast.makeText(MainActivityEn.this, "Врач: Антипов А.А     " +
                "Время: 17:20     " +
                "Талон: А002", Toast.LENGTH_LONG);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void time16(View view) {
        @SuppressLint("ShowToast") Toast toast = Toast.makeText(MainActivityEn.this, "Врач: Антипов А.А     " +
                "Время: 16:45     " +
                "Талон: Й784", Toast.LENGTH_LONG);
        toast.show();
    }
}