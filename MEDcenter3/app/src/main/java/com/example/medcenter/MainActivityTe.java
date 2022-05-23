package com.example.medcenter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityTe extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_te);
    }

    @SuppressLint("SetTextI18n")
    public void time1(View view) {
        @SuppressLint("ShowToast") Toast toast = Toast.makeText(MainActivityTe.this, "Врач: Ульянова А.П     " +
                "Время: 09:25     " +
                "Талон: Т054", Toast.LENGTH_LONG);
        toast.show();

    }

    @SuppressLint("SetTextI18n")
    public void time2(View view) {
        @SuppressLint("ShowToast") Toast toast = Toast.makeText(MainActivityTe.this, "Врач: Ульянова А.П     " +
                "Время: 10:00     " +
                "Талон: Т076", Toast.LENGTH_LONG);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void time3(View view) {
        @SuppressLint("ShowToast") Toast toast = Toast.makeText(MainActivityTe.this, "Врач: Андреев Д.Н     " +
                "Время: 11:35     " +
                "Талон: К132", Toast.LENGTH_LONG);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void time4(View view) {
        @SuppressLint("ShowToast") Toast toast = Toast.makeText(MainActivityTe.this, "Врач: Андреев Д.Н     " +
                "Время: 12:00     " +
                "Талон: Г567", Toast.LENGTH_LONG);
        toast.show();
    }
}