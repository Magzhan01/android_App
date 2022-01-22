package com.example.hw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static  String TEXT_KEY = "TEXT_KEY";
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.second_show);
        Bundle bundle = getIntent().getExtras();
        textView.setText(bundle.getString(TEXT_KEY));


    }
}