package com.ppb.tugasuas.wisatagarut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by User on 10/01/2018.
 */

public class cikuray_detail extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cikurai);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                "<body style='text-align:justify;'>"+"Gunung Cikuray, adalah salah satu gunung yang suka digunakan untuk pendakian oleh beberapa pencinta alam yang ingin mencoba menaiki keindahan alam yang ada di sekitar Gunung Cikuray. Dari atas Gunung tersebut, akan terlihat dengan jelas, wilayah kota Garut. Mulai dari pusat kota dan beberapa perkampungan yang bisa dilihat dari atas puncak Gunung Cikuray.\n" +
                "\n" +
                "Gunung Cikuray hampir berhadapan dengan Gunung Papandayan yang berada di sebelah Barat dan Gunung Guntur yang berada di Sebelah selatan, Gunung Papandayan dan Gunung Cikuray ini, termasuk Gunung yang paling aktif di Indonesia, karena beberapa kali terjadi peningkatan dalam aktivitas gunung berapi ini. Gunung Cikuray tidak hanya dijadikan tempat pendakian oleh masyarakat yang ada di Kota Garut, tetapi sudah sering dijadikan tempat pendakian oleh beberapa mahasiswa pecinta alam dari luar Garut, seperti bandung dan jakarta." +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}
