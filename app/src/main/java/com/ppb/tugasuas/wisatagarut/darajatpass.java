package com.ppb.tugasuas.wisatagarut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by User on 10/01/2018.
 */

public class darajatpass extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.darajatpass);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                "<body style='text-align:justify;'>"+"Darajat Pass merupakan sebuah tempat wisata yang dibangun kisaran tahun 2010. Terletak di Desa Padawas Kecamatan Pasirwangi Kabupaten Garut yang menjadi gugusan salah satu gunung pendakian yaitu Gunung Papandayan. Dari pertama kali dibangun dan diresmikan, tempat ini tak pernah kesepian pengunjung. Tentu saja karena tempatnya sangat asik dan seru untuk momen apapun. Bisa dikunjungi oleh setiap kalangan di setiap waktu. Mau hari libur ataupun bukan, tempat ini selalu cocok dan pas untuk dikunjungi.fasilitas yang pertama dan tentunya menjadi andalan adalah waterboom dan hotspring water. Disini pengunjung disuguhkan oleh jamuan kolam juga pemandian air panas yang lengkap dengan waterboom, ember tumpah dan lain sebagainya. Selain itu ada waterpark nya juga lho, yang sangat pas untuk anak-anak. Dengan begitu pengunjung dewasa maupun anak-anak bisa sama merasakan nikmat juga rasa nyaman sambil berendam-rendam dalam kolam. Tentu saja kegiatan yang seperti ini dapat memacu otak menjadi rileks sehingga dapat sedikit mengurangi beban pikiran. Di tempat wisata ini tersedia fasilitas outbound,dimana dengan kegiatan ini pengunjung tidak hanya menikmati wisata air panas saja,tapi dapat mengasah kemampuan bersosialisasi. Pada saat bergabung dalam sebuah tim, peserta akan bertemu dan bekerjasama dengan orang-orang yang mungkin memiliki kepribadian berbeda dengan dirinya. Kondisi tersebut akan menjadikan peserta lebih menghargai perbedaan di sekitarnya." +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}
