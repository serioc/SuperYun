package com.example.QRCPark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MapSelection extends AppCompatActivity {


    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.map_selection);
        View.OnClickListener handler = new View.OnClickListener(){
            public void onClick(View v) {

                switch (v.getId()) {

                    case R.id.button9:
                        // doStuff
                        startActivity(new Intent(MapSelection.this, Map1.class));
                        break;
                    case R.id.button10:
                        // doStuff
                        startActivity(new Intent(MapSelection.this, Map2.class));
                        break;
                    case R.id.button12:
                        // doStuff
                        startActivity(new Intent(MapSelection.this, MainActivity.class));
                        break;
                }
            }
        };

        findViewById(R.id.button9).setOnClickListener(handler);
        findViewById(R.id.button10).setOnClickListener(handler);
        findViewById(R.id.button12).setOnClickListener(handler);



    }}