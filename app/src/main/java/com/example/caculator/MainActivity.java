package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private CalculatorBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = CaculatorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClicklistener(v -> add());
        binding.minus.setOnClickListener(v -> {

    }

    private void add(){

        int left = Integer.parseInt(binding.inputnum1.getText().toString());
        int right = Integer.parseInt(binding.inputnum2.getText().toString());
        int result = left + right;

        binding.result.setText(Integer.toString(result));
    }
}