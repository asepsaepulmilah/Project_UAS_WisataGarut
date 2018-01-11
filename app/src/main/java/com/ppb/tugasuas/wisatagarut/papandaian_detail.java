package com.ppb.tugasuas.wisatagarut;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by User on 10/01/2018.
 */

public class papandaian_detail extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.papandaian);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                "<body style='text-align:justify;'>"+ "Wisata Gunung Papandayan Garut merupakan salah satu wisata alam favorit di kabupaten Garut. Kompleks wisata papandayan menawarkan keindahan alami berupa area kawah bekas letusan gunung api yang luas, area hutan mati bekas letusan, dan juga padang edelweiss tegal alun yang luas sekali. Ketinggian gunung papandayan kurang lebih 2665 Meter dpl, dan termasuk kategori mudah untuk pendakian atau sekedar hiking.Gunung Papandayan terletak di kecamatan Cisurupan Garut, dan tidak begitu jauh dari pusat kota garut. Topografinya termasuk kawasan curam, berbukit dan disertai dengan tebing terjal. Disekitar kawasan masih hijau dan bagus. Anda bisa menikmati keindahan alam dengan suasana dan udara yang segar disini.Untuk menuju lokasi, anda cukup menuju kearah Cisurupan garut, searah dengan rute menuju pantai santolo. Di kecamatan Cisurupan (kurang lebih 30 Km dari garut kota) anda akan menemukan jalan menuju papandayan yang terletak tepat di pinggir Mesjid Agung Cisurupan.\n" +
                "\n" +
                "Jika menggunakan angkutan umum, anda bisa menggunakan angkutan kota jurusan cisurupan (warna putih-biru) dari terminal Garut, dan berhenti di alun-alun Cisurupan. Dari sana bisa menggunakan ojek untuk menuju ke lokasi. Jika rombongan, anda bisa langsung menyewa angkutan kota untuk langsung menuju lokasi.\n" +
                "\n" +
                "Akses jalan ke lokasi juga sudah bagus, dan mudah dicapai. Anda bisa langsung parkir di area parkir utama yang cukup luas." +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}
