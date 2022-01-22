package com.example.hw_1;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText enter_Text;
    private Button btn_Show;

    private String text;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter_Text = findViewById(R.id.etWrite);
        btn_Show = findViewById(R.id.btn_show);


        btn_Show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(enter_Text.getText())){

                }else{
                    text = String.valueOf(enter_Text.getText());
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra(SecondActivity.TEXT_KEY, text);
                    startActivity(intent);
                }
            }
        });
    }
}