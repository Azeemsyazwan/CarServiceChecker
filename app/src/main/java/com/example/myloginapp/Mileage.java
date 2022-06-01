package com.example.myloginapp;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.joda.time.Period;
import org.joda.time.PeriodType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mileage extends AppCompatActivity {

    EditText editTextName;
    Button btnClickHere;
    Button btnClickHere1;
    TextView textName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mileage);
        editTextName = (EditText) findViewById(R.id.editTextName);
        btnClickHere = (Button) findViewById(R.id.btnClickHere);
        btnClickHere1 = (Button) findViewById(R.id.btnClickHere1);
        textName = (TextView) findViewById(R.id.textName);

        btnClickHere.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                textName.setText("268Km " );
            }
        });

        btnClickHere1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

    }
    public void openNewActivity(){
        Intent intent = new Intent(this, Calculator.class);
        startActivity(intent);
    }
}
