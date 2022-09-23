package com.example.memitchat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Button pour load la page register
    public void load_register_layout(View view) {
        setContentView(R.layout.register);
    }
    //Button pour load la page login
    public void load_login_layout(View view) {
        setContentView(R.layout.activity_main);
    }

}