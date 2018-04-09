package com.example.QRCPark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by serioc on 4/9/2018.
 */

public class Map1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map1);

        View.OnClickListener handler = new View.OnClickListener() {
            public void onClick(View v) {

                switch (v.getId()) {

                    case R.id.button5:
                        // doStuff
                        startActivity(new Intent(Map1.this, DecoderActivity.class));
                        break;
                    case R.id.button13:
                        // doStuff
                        startActivity(new Intent(Map1.this, MapSelection.class));
                        break;
                }
            }
        };

        findViewById(R.id.button5).setOnClickListener(handler);
        findViewById(R.id.button13).setOnClickListener(handler);

    }
}
