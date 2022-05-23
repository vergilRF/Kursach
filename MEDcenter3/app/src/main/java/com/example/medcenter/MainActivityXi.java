package com.example.medcenter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityXi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_xi);
    }

    @SuppressLint("SetTextI18n")
    public void time12(View view) {
        @SuppressLint("ShowToast") Toast toast = Toast.makeText(MainActivityXi.this, "Врач: Шнайдер У.Я     " +
                "Время: 17:45     " +
                "Талон: У786", Toast.LENGTH_LONG);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void time11(View view) {
        @SuppressLint("ShowToast") Toast toast = Toast.makeText(MainActivityXi.this, "Врач: Шнайдер У.Я     " +
                "Время: 17:15      " +
                "Талон: Н412", Toast.LENGTH_LONG);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void time10(View view) {
        @SuppressLint("ShowToast") Toast toast = Toast.makeText(MainActivityXi.this, "Врач: Фраун Я.Ю     " +
                "Время: 14:55     " +
                "Талон: А890", Toast.LENGTH_LONG);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void time9(View view) {
        @SuppressLint("ShowToast") Toast toast = Toast.makeText(MainActivityXi.this, "Врач: Фраун Я.Ю     " +
                "Время: 13:55     " +
                "Талон: Ф781", Toast.LENGTH_LONG);
        toast.show();
    }
}