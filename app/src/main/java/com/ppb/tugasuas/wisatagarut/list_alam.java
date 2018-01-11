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

public class list_alam extends AppCompatActivity {
    String[] listArray={"Gunung Papandayan","Gunung Guntur","Gunung Cikuray","Pantai Santolo","Pantai Sayang Helang","Curug Sanghyang Taraje"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_alam);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.activity_list_view, listArray);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0) {
                    Intent papandaian = new Intent(view.getContext(), papandaian_detail.class);
                    startActivityForResult(papandaian, 0);
                }
                if (position==1) {
                    Intent guntur = new Intent(view.getContext(), guntur_detail.class);
                    startActivityForResult(guntur, 1);
                }
                if (position==2) {
                    Intent cikurai = new Intent(view.getContext(), cikuray_detail.class);
                    startActivityForResult(cikurai, 2);
                }
                if (position==3) {
                    Intent santolo = new Intent(view.getContext(), santolo.class);
                    startActivityForResult(santolo, 3);
                }
                if (position==4) {
                    Intent heulang = new Intent(view.getContext(), heulang_detail.class);
                    startActivityForResult(heulang, 4);
                }
                if (position==5) {
                    Intent sanghyang = new Intent(view.getContext(), sanghyang_detail.class);
                    startActivityForResult(sanghyang, 4);
                }
            }
        });
    }
}
