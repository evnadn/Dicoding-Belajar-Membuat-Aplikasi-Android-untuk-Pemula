package com.example.wonderfulsumbar;

import java.util.ArrayList;

public class WisataData {
    public static String[][] data = new String[][]{
            {"Istana Baso Pagaruyuang", "Objek peninggalan budaya dan sejarah ini berada di Kecamatan Tanjung Emas, Batusangkar, Kabupaten Tanah Datar. Istana ini sangat ikonik dan terkenal di Sumatera Barat sebagai gambaran betapa jayanya dulu kerajaan Minang. Di sini juga kamu bisa melihat peninggalan budaya dan menikmati pemandangan di Batusangkar.", "https://akcdn.detik.net.id/community/media/visual/2018/10/26/d5703c5e-2cc0-414c-b7ac-9b4ad09369a2.jpeg?a=1"},
            {"Danau Singkarak", "Danau terluas kedua setelah Danau Toba ini berada di 3 wilayah administrasi di Sumatera Barat, salah satunya di Batusangkar. Selain menikmati keindahan danau, nikmati juga makanan khas di Danau Singkarak yaitu goreng ikan bilih, ikan danau khas Danau Singkarak.", "https://akcdn.detik.net.id/community/media/visual/2018/11/02/bf0fc510-3a94-44d2-81f5-c35feb90582b.jpeg?a=1"},
            {"Lembah Harau", "Selain dikenal dengan keindahan lembahnya, Lembah Harau juga punya banyak spot yang instagramable. Yaitu berfoto dengan latar sebatang pohon yang memiliki ranting kering, di mana pohon dikelilingi hamparan pasir. Berpadu dengan bagian belakang 2 rumah gadang yang berada di lembah, menciptakan latar foto Lembah Harau 'rasa Korea'. Lembah Harau berada di Kecamatan Harau, Kabupaten Lima Puluh Kota. Bila ingin ke sini, jika traveler berangkat dari Kota Padang memakan waktu sekitar 3 jam.", "https://merahputih.com/media/1d/a1/78/1da178294f7119d09d318a384e571542.jpg"},
            {"Pantai Air Manis", "Pasti kenal dengan cerita Malin Kundang kan? Nah di Pantai Air Manis ini kamu bisa melihat batu yang menurut cerita adalah Maliln Kundang yang dikutuk ibunya. Pantai cantik ini berada di Padang Selatan.", "https://akcdn.detik.net.id/community/media/visual/2018/01/01/a53d3c5a-5c08-4eb4-8fd7-0c82f08b8c7f.jpg?a=1"},
            {"Kawasan Wisata Mandeh", "Berada di Kecamatan Koto XI Tarusan, Mandeh dikenal dengan pantai dan lautnya yang cantik. Keindahannya pun bahkan telah dikenal internasional. Kamu yang suka snorkeling dan diving yuk ke sini.", "https://akcdn.detik.net.id/community/media/visual/2019/03/05/e56bdb28-ede7-4607-ac38-4723072c29d4.jpeg?a=1"},
            {"Pantai Padang", "Menikmati senja yang indah di Padang, kamu bisa ke Pantai Padang yang orang lokal menyebutnya Taplau (tapi lauik/ tepi laut). Nikmati senja sembari menikmati jajanan khas seperti pensi, langkitang, dan kerupuk dengan kuah sate.", "https://akcdn.detik.net.id/community/media/visual/2018/11/19/dc1638c0-2a35-4623-a65d-48b3d122229e.jpeg?a=1"},
            {"Jembatan Akar", "Berada di Pesisir Selatan, jembatan ini berada di Painan, Pesisir Selatan. Jembatan hidup yang melintasi Sungai Bayang ini berasal dari akar dua beringin yang saling bertautan.", "https://akcdn.detik.net.id/community/media/visual/2016/04/19/98ed9e2d-6d2b-46d8-b107-bad542cde603.jpg?a=1"},
            {"Jembatan Siti Nurbaya", "Jembatan Siti Nurbaya salah satu spot favorit untuk menikmati malam di Kota Padang. Selain bersantai, kamu bisa nikmati semalam sembari membeli aneka jajanan seperti es kelapa muda, pisang bakar, roti bakar dan lainnya.", "https://akcdn.detik.net.id/community/media/visual/2017/01/23/4ffc84d6-7918-4f8a-af15-9ddef02c03b2.jpg?a=1"},
            {"Museum Adityawarman", "Berada di Kota Padang, di sini kamu bisa melihat arsip, peninggalan sejarah dan barang tempo dulu yang berhubungan dengan kebudayaan Minangkabau.", "https://akcdn.detik.net.id/community/media/visual/2017/12/05/71aa277a-ab5c-4e20-aceb-f3a33e893aff.jpg?a=1"},
            {"Jam Gadang", "Siapa sih yang nggak kenal dengan spot yang ikonik ini? Jam bersejarah yang disamakan dengan Big Ben di London ini berada di pusat keramaian Kota Bukittinggi.", "https://www.itiakladomudo.com/wp-content/uploads/2017/10/jam-gadang23.jpg"},
    };
    public static ArrayList<Wisata> getListData(){
        ArrayList<Wisata> list = new ArrayList<>();
        for (String[] aData : data) {
            Wisata wisata = new Wisata();
            wisata.setName(aData[0]);
            wisata.setDescription(aData[1]);
            wisata.setPhoto(aData[2]);
            list.add(wisata);
        }
        return list;
    }
}
