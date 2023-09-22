package com.example.application_bangladesh_bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class First_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        getSupportActionBar().hide();
    }

    public void Apositive(View view) {
        startActivity(new Intent(getApplicationContext(), FindBloodDonner_A_pls.class));
    }

    public void ANegative(View view) {
        startActivity(new Intent(getApplicationContext(), aneg_blood.class));
    }

    public void Bpositive(View view) {
        startActivity(new Intent(getApplicationContext(), bpos.class));
    }

    public void BNegative(View view) {
        startActivity(new Intent(getApplicationContext(), bneg_blood.class));
    }

    public void ABpositive(View view) {
        startActivity(new Intent(getApplicationContext(), abpos.class));
    }

    public void ABNegative(View view) {
        startActivity(new Intent(getApplicationContext(), abneg_blood.class));
    }

    public void Opositive(View view) {
        startActivity(new Intent(getApplicationContext(), opos.class));

    }

    public void ONegative(View view) {
        startActivity(new Intent(getApplicationContext(), oneg_blood.class));
    }

    public void home(View view) {
        startActivity(new Intent(this, home.class));
    }
}