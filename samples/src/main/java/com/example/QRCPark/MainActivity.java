package com.example.QRCPark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        View.OnClickListener handler = new View.OnClickListener(){
            public void onClick(View v) {

                switch (v.getId()) {

                    case R.id.button7:
                        // doStuff
                        startActivity(new Intent(MainActivity.this, Choose_Parking_Lot.class));
                        break;
                    case R.id.button8:
                        // doStuff
                        startActivity(new Intent(MainActivity.this, MapSelection.class));
                        break;
                }
            }
        };

        findViewById(R.id.button7).setOnClickListener(handler);
        findViewById(R.id.button8).setOnClickListener(handler);



    }}