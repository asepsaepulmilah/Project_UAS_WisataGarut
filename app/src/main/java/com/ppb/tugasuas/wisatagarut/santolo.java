package com.ppb.tugasuas.wisatagarut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by User on 10/01/2018.
 */

public class santolo extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.santolo);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                "<body style='text-align:justify;'>"+"Pantai santolo memiliki keindahan yang tak kalah mempesona dengan pantai-pantai yang ada di indonesia. Udara yang sejuk dipadu hamparan pasir putih yang berdampingan dengan ombak laut yang berkilau bagai cahaya permata. Deretan terumbu karang yang menawan menjadi rumah bermacam biota laut yang sangat alami. Selain itu kita bisa menikmati sunset dan sunrise salah satu moment fenomena yang paling ditunggu semua orang yang berkunjung ke pantai. Bagi yang gemar berfotografi disini juga bisa menjadi salah satu alternatif background foto anda.\n" +
                "Selain keindahannya dipantai santolo ini juga menjadi tempat berkumpulnya para nelayan tradisional yang melaut dan merupakan daerah kegiatan nelayan sebagai dermaga kapal ikan atau perahu yang ada di pameungpeuk. Dari bibir pantai santolo kita akan menemukan pemandangan yang sangat menakjubkan, salah satunya Muara Cilauteureun. Cilaut eureun dalam bahasa sunda berarti laut yang berhenti. karena air disana begitu tenang seolah-olah berhenti dan keunikan di muara ini ialah aliran airny berasal dari laut menuju ke sungan bukan sebaliknya. Jadi sangat disayangkan bila anda tidak mengabadikan fenomena ini."+
                "<br/>" +
                "<br> Rute 1 : Garut--Cikajang--Cikelet--Pameungpeuk, rute ini merupaka rute umum dan bisa ditempuh dengan kendaraan umum. Bagi anda yang melewati rute ini saya sarankan untuk berhati-hati karena jalan yang berkelok-kelok tajam. Selain itu rute ini banyak ditempuh oleh wisatawan dari kabupaten tasik, bandung, jakarta dan kota lainnya." +
                "<br/>" +
                "<br>Rute 2 : Ciwidey--Cisewu--Bungbulang--Pameungpeuk. Jalur ini lumayan jauh dan belum ada kendaraan umum.Tetapi sebagai gantinya kita disuguhi pemandangan yang sangat bagus." +
                "<br/>" +
                "<br>Rute 3 : Untuk yang dari bandung bisa menggunakan jalur ranca bali--Naringgul--Cidaun--Rancabuaya--Santolo.Atau dengan jalur alternatif yaitu melewati Pangalengan." +
                "<br/>" +
                "<br>Rute 4 : Untuk pengunjung dari Pangandaran dan tasik bisa menggunakan jalur lintas selatan Cipatujah. Saat ini kondisi jalan lintas selatan sangat baik." +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}
