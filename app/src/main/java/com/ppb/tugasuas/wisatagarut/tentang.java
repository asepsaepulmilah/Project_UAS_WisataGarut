package com.ppb.tugasuas.wisatagarut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by User on 10/01/2018.
 */

public class tentang extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentang);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                "<body style='text-align:justify;'>"+" Aplikasi ini merupakan aplikasi Wisata Garut dimana dalam aplikasi ini bisa mengetahui gambaran tempat wisata yang ada digarut."+
                "<br>"+
                "<br> Aplikasi ini dibuat oleh :"+
                "<br>"+
                "-----------------------------------------------------"+
                "<br> Aisyah Fitri Islami (1406012)"+ "<br> Asep Saepul Milah (1406022)"+"<br> Indri Widari (1406065)"+
                "<br>"+
                "-----------------------------------------------------"+
                "<br>Untuk memenuhi tugas Ujian Akhir Semester Mata Kuliah Pemrograman Perangkat Bergerak"+
                "<br>"+
                "<br>SEKOLAH TINGGI TEKNOLOGI GARUT 2017" +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}
