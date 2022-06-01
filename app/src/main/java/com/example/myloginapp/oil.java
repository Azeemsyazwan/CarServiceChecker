package com.example.myloginapp;



import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class oil extends AppCompatActivity {

    ListView listview;
    Button Addbutton;
    EditText GetValue;
    String[] ListElements = new String[] {
            "7/1/2022 : RM 55.98",
            "14/1/2022 : RM 75.98"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oil);

        listview = (ListView) findViewById(R.id.listView1);
        Addbutton = (Button) findViewById(R.id.button1);
        GetValue = (EditText) findViewById(R.id.editText1);

        final List< String > ListElementsArrayList = new ArrayList < String >
                (Arrays.asList(ListElements));


        final ArrayAdapter < String > adapter = new ArrayAdapter < String >
                (oil.this, android.R.layout.simple_list_item_1,
                        ListElementsArrayList);

        listview.setAdapter(adapter);

        Addbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ListElementsArrayList.add(GetValue.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
    }
}