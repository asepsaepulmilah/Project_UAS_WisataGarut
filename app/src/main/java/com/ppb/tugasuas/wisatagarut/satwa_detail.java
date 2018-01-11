package com.ppb.tugasuas.wisatagarut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by User on 10/01/2018.
 */

public class satwa_detail extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.satwa);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                "<body style='text-align:justify;'>"+"Taman satwa Cikembulan, memiliki berbagai macam satwa, salah satu yang menjadi Favorit wisatawan yaitu: Macan Tutul Jantan, saat ini Kebun Binatang Cikembulan memiliki sekitar kurang lebih 214 Spesies, termasuk Harimau Sumatera. Selain Kebun Binatang Cikembulan juga menyediakan pemancingan bagi pengunjung yang suka memancing. Taman Satwa Cikembulan merupakan salah satu alternatif lain apabila Anda merencanakan berlibur ke Garut. Terletak sekitar 16 km dari pusat kota, atau 10 km sebelah Utara Tarogong, arah jalan menuju Bandung, tepatnya berlokasi di Kampung Jati Desa Cikembulan Kecamatan Kadungora Kabupaten Garut.\n" +
                "\n" +
                "\n" +
                "Dan bagi Anda yang menggunakan kendaraan umum, transportasi pun tidak begitu sulit. Sama seperti jika Anda akan menuju Situ dan Candi Cangkuang, dari terminal Guntur, Anda tinggal menggunakan angkot nomor 10 yang menuju Leles dan Kadungora (berwarna hijau muda strip avokad), dan layanan ojek ataupun delman yang tersedia di jalan masuk di sebelah alun-alun Kecamatan Leles siap mengantar Anda menuju tempat tujuan. Sarana wisata di sekitar Taman Satwa Cikembulan yang bersuasana alami karena langsung berhadapan dengan Gunung Haruman, dimana gunung ini tempat lepas landas para penerbang olahraga paragliding, sehingga bisa menikmati keindahan alamnya yang begitu indah dan suasana sejuk. Panorama alam ini bisa sekaligus di saksikan langsung oleh kita dari area Taman Satwa Cikembulan Garut.Taman Satwa Cikembulan didirikan tahun 1998, dan dibuka untuk umum pada tahun 2009 setelah mendapat ijin dari Kementrian Kehutanan Republik Indonesia. Berbeda dengan kebun binatang pada umumnya, tempat wisata dengan konsep “taman yang ada satwanya, satwa yang dihiasi taman”, disebutkan sebagai taman satwa satu-satunya di Jawa Barat. Luas area Cikembulan kurang lebih 5 ha.\n" +
                "\n" +
                "Banyak sekali spesies yang ada di Cikembulan seperti : Aves atau burung (elang, angsa putih dan hitam, merak, kasuari, burung rangkong, belibis, pelikan, dan lain-lain), reptilia (buaya, ular), primata (orang utan, wau-wau, siamang, kera Jawa, lutung merah,), mamalia (kangguru, rusa tutul, kijang, beruang madu, anjing pitbull, landak, kuda poni, dan lain-lain), dan pisces (ikan) turut melengkapi jenis satwa yang ada di Taman Satwa Cikembulan. Tercatat sekurangnya 508 spesies hewan terdapat di Taman Satwa Cikembulan, termasuk Harimau Sumatra (Panthera Tigris Sumatrae) yang dilindungi karena tergolong salah satu binatang langka. Taman ini pun memiliki koleksi empat populasi Macan Tutul Jawa yang langka masing-masing berusia dua serta tiga tahun.Untuk melengkapi keterbatasan satwa yang ada, tempat wisata ini menyediakan fasilitas lain, seperti : Restoran, Gazebo, Bungalow, Bebek Air, Arena Mainan Anak, ATV, Kuda Tunggang, dan Tempat Pancing. Terdapat pula Kolam Terapi Ikan yang menggunakan ikan mirip mujair bernama Garafura dengan panjang rata-rata 4 cm untuk membantu relaksasi Anda. Selain itu, tempat wisata ini pun menyediakan Pendopo untuk Pertemuan atau Gathering dengan daya tampung 100 orang." +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}
