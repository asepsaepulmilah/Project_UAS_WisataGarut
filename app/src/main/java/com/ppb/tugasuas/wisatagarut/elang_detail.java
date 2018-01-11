package com.ppb.tugasuas.wisatagarut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by User on 10/01/2018.
 */

public class elang_detail extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elang);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                "<body style='text-align:justify;'>"+"Di Kabupaten Garut, Jawa Barat, satwa dilindungi tersebut menghuni Pusat Konservasi Elang Kamojang (PKEK). Lokasi wisata edukasi ini berada kawasan Kamojang, Kecamatan Samarang.Aneka jenis elang ada di tempat ini. Mulai dari elang brontok, elang tikus, elang hitam, hingga elang Jawa yang sangat terkenal di Indonesia. Tempat tersebut sebagai pusat informasi soal sejarah dan jenis elang. Selain itu, kawasan Kamojang menjadi salah satu tempat migrasi elang.\n" +
                "\n" +
                "PKEK memiliki sebanyak 85 ekor elang. Puluhan elang ini dikumpulkan hasil sitaan petugas dan penyerahan sejumlah warga.\n" +
                "\n" +
                "Namun tidak semua elang dapat diamati pengunjung. Hanya ada sekitar 15 ekor elang penghuni kandang khusus sebagai objek amatan wisatawan. Elang lainnya menempati kandang rehabilitasi dan sementara, sesuai kondisi elang.Berdiri sejak 2015, PKEK menjadi alternatif wisatawan berlibur sambil belajar mengenal jenis burung predator ini. Wisatawan perlu menempuh perjalanan sekitar 45 menit dari pusat kota Garut." +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}

