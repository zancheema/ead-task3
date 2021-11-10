package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etName;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("First Activity");

        btnNext = findViewById(R.id.btnNext);
        etName = findViewById(R.id.etName);

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra(MainActivity2.PARAM_NAME, etName.getText().toString());

            startActivity(intent);
        });
    }
}