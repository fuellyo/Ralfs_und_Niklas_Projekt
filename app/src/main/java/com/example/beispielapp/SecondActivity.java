package com.example.beispielapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tw;
    Button btnCheck;
    RadioGroup rgWahl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        tw = findViewById(R.id.twText);
        btnCheck = findViewById(R.id.btnChecke);
        rgWahl= findViewById(R.id.rgAuswahl);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkedId = rgWahl.getCheckedRadioButtonId();
                RadioButton rb = rgWahl.findViewById(checkedId);
                tw.setText(rb.getText());
            }
        });
    }
}
