package com.ppb.tugasuas.wisatagarut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by User on 10/01/2018.
 */

public class heulang_detail extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.heulang);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                "<body style='text-align:justify;'>"+"Pantai Sayang Heulang adalah sebuah pantai yang terletak di Desa Mancagahar, Kecamatan Pameungpeuk, Kabupaten Garut, Jawa Barat.Pantai ini tercatat memiliki panjang kurang lebih 3,5 km dengan lebar sekitar 50 meter. Pantai ini menjadi salah satu destinasi wisata yang ada di Kabupaten Garut. Luasnya hampir 10 hektare dan memiliki jarak 87 km dari pusat kota Garut. Pantai ini cukup dikenal di kota Bandung dan merupakan daerah tujuan wisata .Pantai ini memiliki jarak tempuh 4 km dari kota Pameungpeuk.Dengan Menikmati panorama pantai dan biota laut,merupakan aktivitas wisata yang dapat dilakukan. Di pantai ini terdapat arena khusus untuk bermain voli dengan demikian para wisatwan dapat bermain voli di area tersebut.Dan juga terdapat banyak rumah makan dan berbagai penginapan dengan berbagai macam fasilitas.Pantai Sayang Heulang iniya berdekatan dengan Pantai Santolo Pameungpeuk Garut. Ada beberapa route jalan yang dapat dipergunakan untuk tiba di pantai Sayang Heulang Garut Jawa Barat di antaranya adalah Jalur pertama melalui terminal Garut dilanjutkan ke Kec.Pameungpeuk. Jalur Lainnya adalah melewati Cianjur - Cidaun - Rancabuaya - Kec.Pameungpeuk, dan Jalur terdekat untuk wisatawan dari Bandung ialah melewati ranca bali - Naringgul - Cidaun - Rancabuaya - Kec.Pameungpeuk- Sayang Heulang. Wisatawan dari Bandung bisa melalui Jalur alternatif yaitu melalui Pangalengan." +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}
