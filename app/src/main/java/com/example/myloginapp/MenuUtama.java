package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuUtama extends AppCompatActivity implements View.OnClickListener{

    private CardView Mileage,Kalendar,KiraanMinyak,Workshop,penghargaan,socmed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        Mileage = (CardView) findViewById(R.id.cardviewjaraktempuh);
        Kalendar = (CardView) findViewById(R.id.cardviewkalendarservis);
        KiraanMinyak = (CardView) findViewById(R.id.cardviewkiraanminyak);
        Workshop = (CardView) findViewById(R.id.cardviewworkshop);
        penghargaan = (CardView) findViewById(R.id.cardviewpenghargaan);
        socmed = (CardView) findViewById(R.id.cardviewsocialmed);

        Mileage.setOnClickListener(this);
        Kalendar.setOnClickListener(this);
        KiraanMinyak.setOnClickListener(this);
        Workshop.setOnClickListener(this);
        penghargaan.setOnClickListener(this);
        socmed.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardviewjaraktempuh:
                i = new Intent(this, Mileage.class);
                startActivity(i);
                break;
            case R.id.cardviewkalendarservis:
                i = new Intent(this, Kalendar.class);
                startActivity(i);
                break;
            case R.id.cardviewkiraanminyak:
                i = new Intent(this, oil.class);
                startActivity(i);
                break;
            case R.id.cardviewworkshop:
                i = new Intent(this, workshop.class);
                startActivity(i);
                break;
            case R.id.cardviewpenghargaan:
                i = new Intent(this, credit.class);
                startActivity(i);
                break;
            case R.id.cardviewsocialmed:
                i = new Intent(this, socmed.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }
}