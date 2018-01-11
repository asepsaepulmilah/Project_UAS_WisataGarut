package com.ppb.tugasuas.wisatagarut;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by User on 10/01/2018.
 */

public class list_edukasi extends AppCompatActivity {
    String[] listArray={"Pusat Konservasi Elang Kamojang","De Wisdom Garut","Taman Satwa Cikembulan",};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_edukasi);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.activity_list_view, listArray);
        ListView listView = (ListView) findViewById(R.id.listview2);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent elang = new Intent(view.getContext(), elang_detail.class);
                    startActivityForResult(elang, 0);
                }
                if (position == 1) {
                    Intent wisdom = new Intent(view.getContext(), wisdom_detail.class);
                    startActivityForResult(wisdom, 1);
                }
                if (position == 2) {
                    Intent satwa = new Intent(view.getContext(), satwa_detail.class);
                    startActivityForResult(satwa, 3);
                }
            }
        });
    }
}
