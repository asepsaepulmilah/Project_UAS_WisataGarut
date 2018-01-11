package com.ppb.tugasuas.wisatagarut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by User on 10/01/2018.
 */

public class guntur_detail extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guntur);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                "<body style='text-align:justify;'>"+"Gunung Guntur Merupakan sebuah Taman Wisata Alam yang sering dikunjungi wisatawan, baik untuk hiking, tracking, camping ataupun kegiatan alam lainnya. Gunung yang memiliki ketinggian sekitar 2249 meter diatas permukaan laut (mdpl) ini memiliki bentang alam berupa padang savanna dengan beberapa puncak di sekelilingnya. Pemandangan dari atas sini sangat terbuka luas dengan suguhan panorama indah yang terbentang sepanjang mata memandang. Tidak hanya itu, lokasi Taman Wisata Alam ini juga menyuguhkan beberapa objek wisata lainnya yang bisa anda kunjungi seperti air terjun, sungai, lembah dan dua buah kawahnya yang bernama kawah pangkalan dan kawah gandapura.Secara administratif gunung Guntur termasuk dalam wilayah Desa Pananjung, Kecamatan Tarogong Kaler, Kabupaten Garut, Jawa Barat. Untuk mendaki gunung ini anda dapat melalui jalur pendakian utamanya yaitu melalui air terjun Citiis.\n" +
                "\n" +
                "Tidaklah sulit untuk menuju kesini karena jaraknya tidak terlalu jauh dari kota Garut. Dari manapun lokasi awal anda, dapat menggunakan angkutan umum untuk menuju terminal Garut terlebih dahulu. Dari sini kemudian dilanjut dengan menggunakan angkot tujuan Cipanas dengan ongkos sekitar Rp 3.000*). Dari Cipanas anda dapat menumpang truk penambang pasir yang akan menuju lokasi penambangan pasir di Kampung Citiis. Jaraknya sekitar tiga kilometer yang jika ditempuh dengan berjalan kaki dapat memakan waktu tempuh sekitar dua jam. Menumpang truk pasir tidak dipungut biaya, namun jika anda merasa ingin membayar dapat memberi dengan seikhlasnya. Dari batas penambangan pasir inilah pendakian anda akan dimulai. Banyak objek menarik yang bisa dinikmati di sekitar lokasi gunung Guntur. Seperti pemandian air panas, Sungai dan Air terjun Citiis. Panorama kawah dan pemandangan alam sekitarnya pun tak kalah indahnya. Mendaki gunung ini pun tidak memerlukan waktu yang begitu lama. Hanya diperlukan waktu sekitar empat jam saja sehingga bisa ditempuh bolak-balik atau jika betah untuk berlama-lama anda bisa pula bermalam dengan mendirikan tenda.\n" +
                "\n" +
                "Perjalanan dari lokasi batas penambangan pasir sampai menuju air terjun citiis, jalur yang dilalui masih cukup landai dengan melintasi kawasan hutan dan aliran air terjun di sisinya. Terdapat pula sebuah lahan yang cukup luas untuk mendirikan tenda di sekitar air terjun." +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}
