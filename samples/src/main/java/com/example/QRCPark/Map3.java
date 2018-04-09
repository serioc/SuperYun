package com.example.QRCPark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by serioc on 4/9/2018.
 */

public class Map3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map3);

        View.OnClickListener handler = new View.OnClickListener() {
            public void onClick(View v) {

                switch (v.getId()) {

                    case R.id.button17:
                        // doStuff
                        startActivity(new Intent(Map3.this, DecoderActivity.class));
                        break;
                    case R.id.button15:
                        // doStuff
                        startActivity(new Intent(Map3.this, MapSelection.class));
                        break;
                }
            }
        };

        findViewById(R.id.button17).setOnClickListener(handler);
        findViewById(R.id.button15).setOnClickListener(handler);

    }
}
