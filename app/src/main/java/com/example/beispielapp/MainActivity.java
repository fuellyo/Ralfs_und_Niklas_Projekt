package com.example.beispielapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btncheck);
        final EditText et = findViewById(R.id.etpassword);
        final TextView tw = findViewById(R.id.tfanwort);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = et.getText().toString();
                if(password.equals("pipi")){
                    setContentView(R.layout.activity_start);
                }else{
                    tw.setText("Falsch!");

                }
            }
        });
    }
}
