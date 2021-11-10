package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static String PARAM_NAME = "param_name";

    private TextView tvName;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setTitle("Second Activity");

        backButton = findViewById(R.id.backButton);
        tvName = findViewById(R.id.tvName);
        String name = getIntent().getStringExtra(PARAM_NAME);

        tvName.setText(String.format("Hello, %s!", name));

        backButton.setOnClickListener(v -> finish());
    }
}