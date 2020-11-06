package com.example.testing.junittest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity {
    public static int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static int add(int x, int y) {
        count++;
        return x + y;
    }

    public static int subtract(int x, int y) {
        count++;
        return x - y;
    }

    public static int multiply(int x, int y) {
        count++;
        return x * y;
    }

    public static int divide(int x, int y) {
        count++;
        return x / y;
    }
}
