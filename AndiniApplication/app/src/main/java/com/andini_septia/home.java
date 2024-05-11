package com.andini_septia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        TextView userNameTextView = findViewById(R.id.tekshome);
        userNameTextView.setText("Welcome " + username + ", anda sudah login!");
    }
}