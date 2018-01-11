package com.ppb.tugasuas.wisatagarut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by User on 10/01/2018.
 */

public class puncak_detail extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puncak);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                "<body style='text-align:justify;'>"+"Puncak Darajat merupakan salah satu tempat di area darajat yang paling banyak dikenal oleh wisatawan. Selain tempat ini, terdapat juga tempat lain seperti  Awit sinar darajat, dan lain-lain. Lokasi Puncak Darajat Garut terletak tidak begitu jauh dari pusat kota. Kawasan ini berada di wilayah kecamatan Pasir Wangi, kurang lebih 25 Km dari pusat kota Garut. Menuju lokasi wisata ini cukup mudah kok.. Berkut ini alamat puncak darajat Garut.\n" +
                "\n" +
                "Jika anda dari arah Bandung, setelah sampai di bundaran Tarogong Garut, silahkan ambil jalan ke sebelah kanan. Kira-kira 100 meter dari bundaran tarogong terdapat pertigaan dan ambil arah ke kiri. Lalu ambil jalan ke kanan di pertigaan selanjutnya. Area wisata Darajat terletak satu arah dengan Kampung sampireun, jadi akan mudah ditemukan. Papan petunjuk arah pun sudah tersedia sehingga akan memudahkan anda.\n" +
                "\n" +
                "Anda cukup ikuti jalan tersebut, dan di pertigaan Panunjuk Samarang, kira-kira 1 KM setelah pertigaan menuju Kampung sampireun, silahkan ambil jalan ke arah kanan (jalan Raya Pasirwangi). Cukup ikuti jalan tersebut, kawasan wisata darajat terletak di ujung dari jalan tersebut." +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}
