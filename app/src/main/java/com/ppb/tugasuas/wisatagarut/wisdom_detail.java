package com.ppb.tugasuas.wisatagarut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by User on 10/01/2018.
 */

public class wisdom_detail extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wisdom);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                "<body style='text-align:justify;'>"+"Destinasi wisata yang terletak di Kampung Cimuncang, Desa Rancabango, Kecamatan Tarogong Kaler itu merupakan objek wisata domba Garut yang dikelilingi pemandangan alam Garut nan asri dengan posisi menghadap Gunung Cikuray.\n" +
                "\n" +
                "Alhasil, ketika langit cerah, pemandangan gunung sekaligus kehijauan De Wisdom bisa memanjakan wisatawan. Apalagi, kontur alam De Wisdom agak berbukit. Hampir semua areanya dikelilingi gazebo.\n" +
                "\n" +
                "Di De WisDom, sesuai namanya, Anda akan menemukan kandang-kandang domba Garut peliharaan. Anda juga dapat berinteraksi langsung dengan domba-domba itu seperti memberi makan, berfoto, atau sekadar bercengkerama.objek wisata itu menyediakan juga wahana bermain anak seperti mandi bola, trampolin, dan papan panjat tebing yang disediakan dalam satu aula.\n" +
                "\n" +
                "Di bawah lapangan hijau yang dikelilingi gazebo, terdapat labirin kelinci yang bersebelahan dengan danau. Tempat itu cocok untuk latar foto karena di atas danau terdapat teras untuk pengunjung." +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}
