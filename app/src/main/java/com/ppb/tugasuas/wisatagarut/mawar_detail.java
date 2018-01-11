package com.ppb.tugasuas.wisatagarut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by User on 10/01/2018.
 */

public class mawar_detail extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mawar);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                "<body style='text-align:justify;'>"+"Kebun Mawar adalah Penginapan yang bernuansa tenang yang menyuguhkan pemandangan indah dengan hamparan bunga mawar terletak di Jl Raya Kamojang km 5, Samarang, Garut, Indonesia 44161 berada pada ketinggian 1150 MDPL dengan luas tanah 5 HA dan dengan titik lokasi yang berada ditengah gunung-gunung yang ada di garut seperti Gunung Guntur, Gunung Cikuray, Gunung Papandayan dan Gunung Talaga Bodas.Dengan memberikan keindahan pemandangan agar dapat memanjakan pengunjung dan memberikan ketenangan saat berada di taman dengan di kelilingi hamparan bunga dan juga pemandangan yang indah yaitu pegunungan garut. \n" +
                "\n" +
                "Kebun mawar juga memiliki fasilitas restaurant untuk memanjakan perut pengunjung dengan menyediakan 3 jenis makanan yaitu : Makanan Tradisional, Makanan Nasional dan juga Makanan Western sehingga pengunjung dapat menentukan sesuai dengan seler maasing-masing. \n" +
                "\n" +
                "Kebun Mawar juga melengkapi fasilitas Tempat Bermain anak yang berada di bagian agak atas sehingga pasti menarik dan memberika keseruan dengan beberapa wahana bermain yang disediakan. Anda juga dapat bermain bersama merpati yang di kembang biakkan pasti menambah keseruan liburan bersama keluarga." +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}
