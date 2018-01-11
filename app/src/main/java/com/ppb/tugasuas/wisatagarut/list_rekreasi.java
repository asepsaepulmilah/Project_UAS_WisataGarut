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

public class list_rekreasi extends AppCompatActivity {
    String[] listArray = {"Kebun Mawar", "Situ Bagendit", "Situ Cangkuang", "Puncak Darajat", "Darajat Pass",};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_rekreasi);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.activity_list_view, listArray);
        ListView listView = (ListView) findViewById(R.id.listview1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent mawar = new Intent(view.getContext(), mawar_detail.class);
                    startActivityForResult(mawar, 0);
                }
                if (position == 1) {
                    Intent bagendit = new Intent(view.getContext(), bagendit_detail.class);
                    startActivityForResult(bagendit, 1);
                }
                if (position == 2) {
                    Intent cangkuang = new Intent(view.getContext(), cangkuang_detail.class);
                    startActivityForResult(cangkuang, 2);
                }
                if (position == 3) {
                    Intent puncak = new Intent(view.getContext(), puncak_detail.class);
                    startActivityForResult(puncak, 3);
                }
                if (position == 4) {
                    Intent darajat = new Intent(view.getContext(), darajatpass.class);
                    startActivityForResult(darajat, 4);
                }
            }
        });
    }
}
