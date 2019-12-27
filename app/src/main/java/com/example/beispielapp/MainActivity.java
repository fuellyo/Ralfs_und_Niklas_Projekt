package com.example.beispielapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et;
    TextView tw;
    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btncheck);
        et = findViewById(R.id.etpassword);
        tw = findViewById(R.id.tfanwort);
        setTitle("Geben sie ein Passwort ein!");

        intent = new Intent(this, SecondActivity.class);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = et.getText().toString();
                if(password.equals("pipi")){
                    startActivity(intent);
                }else{
                    tw.setText("Falsch!");
                }
            }
        });
    }
}
