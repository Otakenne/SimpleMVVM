package com.celerii.simplemvvm.Activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.celerii.simplemvvm.R;
import com.celerii.simplemvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.btnJava.setOnClickListener(v ->
            startActivity(new Intent(MainActivity.this, HolidayActivity.class))
        );
    }
}