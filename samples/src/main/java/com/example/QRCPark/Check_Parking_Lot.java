package com.example.QRCPark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Check_Parking_Lot extends AppCompatActivity {


    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.map_selection);
        View.OnClickListener handler = new View.OnClickListener(){
            public void onClick(View v) {

                switch (v.getId()) {

                    case R.id.button2:
                        // doStuff
                        startActivity(new Intent(Check_Parking_Lot.this, Map1.class));
                        break;
                    case R.id.button3:
                        // doStuff
                        startActivity(new Intent(Check_Parking_Lot.this, Map2.class));
                        break;
                }
            }
        };

        findViewById(R.id.button2).setOnClickListener(handler);
        findViewById(R.id.button3).setOnClickListener(handler);



    }}