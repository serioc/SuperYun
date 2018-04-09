package com.example.QRCPark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Choose_Parking_Lot extends AppCompatActivity {


  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.choose_parking_lot);
    View.OnClickListener handler = new View.OnClickListener(){
      public void onClick(View v) {

        switch (v.getId()) {

          case R.id.button2:
            // doStuff
            startActivity(new Intent(Choose_Parking_Lot.this, DecoderActivity.class));
            break;
          case R.id.button3:
            // doStuff
            startActivity(new Intent(Choose_Parking_Lot.this, DecoderActivity2.class));
            break;
          case R.id.button11:
            // doStuff
            startActivity(new Intent(Choose_Parking_Lot.this, MainActivity.class));
            break;
        }
      }
    };

    findViewById(R.id.button2).setOnClickListener(handler);
    findViewById(R.id.button3).setOnClickListener(handler);
    findViewById(R.id.button11).setOnClickListener(handler);




  }}