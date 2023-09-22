package com.example.application_bangladesh_bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
    }

    public void Input(View view) {
        startActivity(new Intent(this, Input_Information.class));

    }

    public void Output(View view) {
        startActivity(new Intent(this, First_page.class));

    }
}