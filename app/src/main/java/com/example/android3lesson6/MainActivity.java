package com.example.android3lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.android3lesson6.databinding.ActivityMainBinding;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding ui;
    private Math math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());
        math = new Math();

        String[] words = new GetStringHelper(this).getString(R.string.words);
        ui.txt.setText(Arrays.toString(words));

        ui.sum.setOnClickListener(v -> {
            int a = Integer.parseInt(ui.edTxt.getText().toString());
            int b = Integer.parseInt(ui.edTxt2.getText().toString());
            ui.txt.setText(String.valueOf(math.sum(a, b)));
        });

        ui.sub.setOnClickListener(v -> {
            int a = Integer.parseInt(ui.edTxt.getText().toString());
            int b = Integer.parseInt(ui.edTxt2.getText().toString());
            ui.txt.setText(String.valueOf(math.subtraction(a, b)));
        });

        ui.mult.setOnClickListener(v -> {
            int a = Integer.parseInt(ui.edTxt.getText().toString());
            int b = Integer.parseInt(ui.edTxt2.getText().toString());
            ui.txt.setText(String.valueOf(math.multiplication(a, b)));
        });

        ui.div.setOnClickListener(v -> {
            int a = Integer.parseInt(ui.edTxt.getText().toString());
            int b = Integer.parseInt(ui.edTxt2.getText().toString());
            ui.txt.setText(String.valueOf(math.div(a, b)));
        });
    }
}