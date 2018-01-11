package com.ppb.tugasuas.wisatagarut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by User on 10/01/2018.
 */

public class cangkuang_detail extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cangkuang);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                "<body style='text-align:justify;'>"+"Situ (danau) Cangkuang yang terletak di Kecamatan Leles ini memang tidak terlalu besar dengan situ-situ kebanyakan. Tempatnya memang bagus tapi untuk masuk kesana cukup terjangkau kalangan bawah. Walaupun tidak memiliki situ yang besar tapi cukup untuk berakit-rakit dengan rakit yang terbuat dari bambu.\n" +
                "Penarik rakitnya pun kebanyakan orang sekitar Desa Cangkuang. Situ Cangkuang Garut pun mengandung nilai sejarah yang sangat kental itupun alas an wisatawan datang kesana. Hal yang menarik dari situ cangkuang adanya Candi Hindu kecil yang ditemukan tahun 1966 ini." +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}

