package com.ppb.tugasuas.wisatagarut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by User on 10/01/2018.
 */

public class sanghyang_detail extends AppCompatActivity {
    Button peta;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sanghyan);
        peta=(Button) findViewById(R.id.button);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<br/>" +
                "<body style='text-align:justify;'>"+"Taraje dalam bahasa sunda artinya tangga, curug atau air terjun. Memang bentuk curug ini seperti taraje dan tampak gagah, dengan tinggi kurang lebih 80 m. Curug yang indah ini masih bisa masuk kategori kekayaan alam yang masih perawan.\n" +
                "\n" +
                "Konon katanya, kenapa dinamai Curug Sanghyang Taraje karena masih ada kaitannya dengan legenda salah satu anak Prabu Siliwangi dari Kerajaan Pajajaran, yaitu Kian Santang, yang hendak mengambil bintang untuk Dayang Sumbi melewati curug ini, maka dinamailah curug ini Sanghyang Taraje. Dan, berdasarkan cerita di area curug ini Kian Santang menyimpan salah satu benda berharganya dan dijaga oleh ular yang sangat besar, penduduk sekitar kadang masih suka ngeliat penampakan dari ular besar tersebut.\n" +
                "\n" +
                "Curug yang lokasinya berada di wilayah Pakenjeng, Desa Kombongan-Pamulihan, Kabupaten Garut ini, memang cukup terisolir. Padahal pemandangan di lokasi yang berada pada ketinggian 460 dpl sangat indah. Menuju lokasi ini bisa ditempuh kurang lebih 2 jam dari Kota Garut menuju Bungbulang atau Pakenjeng. Kondisi jalannya bisa dibilang cukup baik, meskipun tidak terlalu bagus tapi sepanjang perjalanan kita akan disuguhi keindahan perkebunan teh dan undakan-undakan sawah khas tatar Priangan.\n" +
                "\n" +
                "Dari desa terakhir, kita bisa melanjutkan dengan berjalan kaki menuju lokasi curug karena kalau memakai kendaraan roda empat (itu pun harus yang 4wd) kondisi jalannya masih curam, berbatu, dan sempit. Keadaan seperti ini cukup beresiko, belum lagi area di sekitar pos terakhir menuju curug cukup sempit dan susah untuk parkir mobil, terlebih lagi kalau belum hafal medan dan kendaraan yang tidak fit. Pokoknya memerlukan nyali yang besar untuk melakukan perjalanan ini.\n" +
                "\n" +
                "Ada tiga tanjakan dan turunan yang cukup curam (ada juga yang panjang), sempit (hanya masuk satu mobil saja), dan licin setelah diguyur hujan, belum lagi harus menghadapi jurang yang ada di pinggir jalan. Yah, sangat menantang.\n" +
                "\n" +
                "Beda lagi bila menggunakan motor atau ojeg, bisa langsung berhenti dekat pos terakhir, dari pos ini ke lokasi curug bisa ditempuh selama 10 menit dengan berjalan kaki saja, itu pun sudah sangat maksimal. Di lokasi sekitar curug terlihat kalau lokasi ini pernah dikelola, paling tidak dicoba untuk menjadi lokasi wisata. Kelihatan dari adanya bangunan yang tampaknya bekas wc umum, kini sudah sangat terbengkalai. Tanah lapang pun nyaris tidak ada karena sekarang sudah tertutup oleh rerumputan yang meninggi dan memenuhi area sekitar curug.\n" +
                "\n" +
                "Kalau cuaca mendukung--cerah, kondisi yang paling bagus untuk hunting foto di lokasi curug ini sebenarnya dari jam 11 siang sampai 3 sore (pokoknya tepat ketika matahari melintas di atas curug) karena terpaan sinar matahari ke dinding tebing, alam ini akan terlihat semakin keren. Belum lagi ROL cahaya dari pinggir tebing bisa membuat lebih indah lagi karena posisi matahari tidak frontal berhadapan dengan curug. Jadi, masih memungkinkan kalau kita memotret curug secara frontal masih bisa dapat background langit yang biru.\n" +
                "\n" +
                "Tapi, kalau cuaca mendung dan berkabut, bukan berarti curug langsung mati gaya, justru di sini uniknya, entah mengapa curug ini emang lebih pas difoto bila kondisi berkabut. Sehingga terkesan mistis dan sedikit mencekam. Keindahan mistis yang mencekam, tetapi tampak gagah, aura curugnya jadi terasa aneh." +
                "<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}
