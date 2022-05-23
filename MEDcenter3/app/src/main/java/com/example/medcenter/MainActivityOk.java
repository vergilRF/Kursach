package com.example.medcenter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityOk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ok);
    }

    @SuppressLint("SetTextI18n")
    public void time5(View view) {
        @SuppressLint("ShowToast") Toast toast = Toast.makeText(MainActivityOk.this, "Врач: Яковлев К.В     " +
                "Время: 14:30     " +
                "Талон: У786", Toast.LENGTH_LONG);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void time6(View view) {
        @SuppressLint("ShowToast") Toast toast = Toast.makeText(MainActivityOk.this, "Врач: Яковлев К.В     " +
                "Время: 15:00      " +
                "Талон: Н412", Toast.LENGTH_LONG);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void time7(View view) {
        @SuppressLint("ShowToast") Toast toast = Toast.makeText(MainActivityOk.this, "Врач: Кушин В.С     " +
                "Время: 08:05     " +
                "Талон: А890", Toast.LENGTH_LONG);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void time8(View view) {
        @SuppressLint("ShowToast") Toast toast = Toast.makeText(MainActivityOk.this, "Врач: Кушин В.С     " +
                "Время: 08:10     " +
                "Талон: Ф781", Toast.LENGTH_LONG);
        toast.show();
    }
}