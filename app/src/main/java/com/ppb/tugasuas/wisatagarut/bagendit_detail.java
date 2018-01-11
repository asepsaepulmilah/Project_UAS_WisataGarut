package com.ppb.tugasuas.wisatagarut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by User on 10/01/2018.
 */

public class bagendit_detail extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bagendit);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                "<body style='text-align:justify;'>"+"Situ Bagendit terletak di desa Bagendit, Kecamatan Banyuresmi Kabupaten Garut, Jawa Barat, Indonesia. Situ Bagendit merupakan objek wisata alam berupa danau dengan batas administrasi disebelah utara berbatasan dengan Desa Banyuresmi, disebelah selatan berbatasan dengan Desa Cipicung, disebelah timur berbatasan dengan Desa Binakarya, dan disebelah barat berbatasan dengan Desa Sukamukti.\n" +
                "\n" +
                "Aktivitas wisata yang dapat dilakukan di Situ Bagendit ini antara lain menikmati pemandangan, mengelilingi danau dengan menggunakan perahu atau rakit. Para pengunjung juga dapat melakukan kegiatan rekreasi keluarga, menikmati pemandangan serta kegiatan bersepeda air.Fasilitas yang tersedia di kawasan ini yaitu penyewaan 60 buah rakit dengan tarif Rp.25.000/15 menit, 11 buah sepeda air dengan tarif Rp.10.000/15 menit yang dalam kondisi yang baik. Terdapat pula beberapa bangku taman dan 6 buah shelter yang disewakan untuk pengunjung dengan harga Rp.3.000/jam. Terdapat juga kereta api mini dengan tarif Rp.2.000 dan kolam renang dikawasan Situ Bagendit ini.Jarak kawasan wisata Situ Bagendit ini dari pusat kota Garut yaitu 4 km. Terdapat angkutan umum berupa angkot jurusan Terminal Guntur-Kp.Mengger dan Garut-Limbangan dengan tarif Rp.1.500 dan ojeg dengan tarif Rp.2.000.Kualitas pemandangan dan tingkat keamanan sepanjang jalan di kawasan objek dan daya tarik wisata ini cukup baik.jumlah karyawan di objek dan daya tarik wisata Situ Bagendit ini yaitu 6 orang. Pengunjung yang berkunjung ke objek wisata ini perbulannya mencapai 400-600 orang. Pengunjung tersebut biasanya berasal dari Garut, Sukabumi, Tasikmalaya, Bogor,Bandung dan Jakarta." +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}
