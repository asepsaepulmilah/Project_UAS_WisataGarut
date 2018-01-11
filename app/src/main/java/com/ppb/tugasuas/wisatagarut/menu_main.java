package com.ppb.tugasuas.wisatagarut;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by User on 10/01/2018.
 */

public class menu_main extends AppCompatActivity {
    Button alam, rekreasi, edukasi,tentang;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        alam = (Button) findViewById(R.id.button);
        rekreasi = (Button) findViewById(R.id.button1);
        edukasi = (Button) findViewById(R.id.button2);
        tentang = (Button) findViewById(R.id.button3);

        alam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menu_main.this, list_alam.class);
                startActivity(i);
            }
        });
        rekreasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menu_main.this, list_rekreasi.class);
                startActivity(i);
            }
        });
        edukasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menu_main.this, list_edukasi.class);
                startActivity(i);
            }

        });
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menu_main.this, tentang.class);
                startActivity(i);
            }

        });
    }
}
