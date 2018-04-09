package com.example.QRCPark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by serioc on 4/9/2018.
 */

public class Map2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map2);

        View.OnClickListener handler = new View.OnClickListener() {
            public void onClick(View v) {

                switch (v.getId()) {

                    case R.id.button6:
                        // doStuff
                        startActivity(new Intent(Map2.this, DecoderActivity.class));
                        break;
                    case R.id.button14:
                        // doStuff
                        startActivity(new Intent(Map2.this, MapSelection.class));
                        break;
                }
            }
        };

        findViewById(R.id.button6).setOnClickListener(handler);
        findViewById(R.id.button14).setOnClickListener(handler);

    }
}
