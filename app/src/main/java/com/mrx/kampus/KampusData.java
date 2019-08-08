package com.mrx.kampus;

import java.util.ArrayList;

public class KampusData {
    public static String[][] data = new String[][]{
            {"Universitas Gunadarma", "Universitas Gunadarma (UG) atau biasa disebut Gunadarma, adalah salah satu Perguruan Tinggi Swasta di Indonesia. Kampus utamanya berada di Kota Depok, Jawa Barat. Di dalam kampus terdapat fasilitas-fasilitas yang meliputi ruang kuliah, perpustakaan, laboratorium, ruang seminar, auditorium, Pusgiwa (Pusat Kegiatan Mahasiswa), BPM, ruang rapat, ruang tunggu dosen, ruang konsultasi akademik, koperasi, ruang kerja pimpinan dan karyawan, musholah dan masjid, serta lapangan olahraga. Ruang Kuliah Universitas Gunadarma mempunyai 167-ruang kuliah", "https://upload.wikimedia.org/wikipedia/id/1/19/Logo_Gunadarma.jpg", "Kampus Swasta"},
            {"Universitas Indonesia", "Universitas Indonesia disingkat sebagai UI, adalah sebuah perguruan tinggi di Indonesia. Kampus utamanya terletak di bagian Utara dari Depok, Jawa Barat tepat di perbatasan antara Depok dengan wilayah Jakarta Selatan, dan kampus utama lainnya terdapat di daerah Salemba di Jakarta Pusat", "https://upload.wikimedia.org/wikipedia/id/9/95/Makara_UI.png","Kampus Negeri"},
            {"Universitas Gadjah Mada", "Universitas Gadjah Mada (Hanacaraka: ꦈꦤꦶꦮ꦳ꦼꦂꦱꦶꦠꦱ꧀\u200Bꦒꦗꦃ\u200Bꦩꦢ; disingkat UGM) merupakan universitas negeri di Indonesia yang didirikan oleh Pemerintah Republik Indonesia pada tanggal 19 Desember 1949 berdasarkan Peraturan Pemerintah Nomor 23 Tahun 1949", "https://upload.wikimedia.org/wikipedia/id/2/29/Logo_Universitas_Gadjah_Mada.png","Kampus Negri"},
            {"Universitas Bina Nusantara", "Universitas Bina Nusantara juga dikenal dengan Binus University adalah salah satu universitas swasta Indonesia yang berlokasi di Jakarta, Indonesia. Universitas ini bernaung di bawah lembaga pendidikan Bina Nusantara.", "https://upload.wikimedia.org/wikipedia/commons/8/85/Anggrek_Campus_-_Bina_Nusantara_University.JPG","Kampus Swasta"},
            {"Universitas Pancasila", "Universitas Pancasila, disingkat menjadi UP, adalah salah satu perguruan tinggi di Indonesia. Kampus utamanya terletak di Srengseng Sawah, Jagakarsa, Jakarta Selatan dan kampus pascasarjana terletak di Jalan Borobudur, Menteng, Jakarta Pusat..", "https://upload.wikimedia.org/wikipedia/en/5/53/Universitas_Pancasila_%28logo%29.png","Kampus Swasta"},
            {"Politeknik Negeri Jakarta", "Politeknik Negeri Jakarta (PNJ) adalah salah satu perguruan tinggi negeri yang terdapat di areal kampus Universitas Indonesia, Depok, Jawa Barat, Indonesia..", "https://upload.wikimedia.org/wikipedia/id/1/16/Logo_Politeknik_Negeri_Jakarta.jpg","Kampus Negeri"},
            {"Universitas Telkom", "Universitas Telkom, atau disingkat Tel-U, adalah sebuah perguruan tinggi swasta di Indonesia. Kampus utama Tel-U terletak di Kabupaten Bandung, Jawa Barat, tepatnya di Jalan Telekomunikasi - Terusan Buahbatu, di kawasan Bandung Technoplex (BT-Plex).", "https://upload.wikimedia.org/wikipedia/commons/0/03/Logo_Telkom_University_potrait.png","Kampus Swasta"},
            {"Universitas Negeri Jakarta", "Universitas Negeri Jakarta adalah perguruan tinggi negeri yang terdapat di kota Jakarta, Indonesia yang didirikan pada tahun 1964.", "https://upload.wikimedia.org/wikipedia/id/6/6e/Logo-unj.png", "Kampus Negri"},
            {"Universitas Padjadjaran", "Universitas Padjadjaran (disingkat Unpad) (Aksara Sunda Baku: ᮅᮔᮤᮗᮨᮁᮞᮤᮒᮞ᮪ ᮕᮓ᮪ᮏᮓ᮪ᮏᮛᮔ᮪) adalah sebuah perguruan tinggi negeri di Bandung, Jawa Barat, Indonesia.", "https://upload.wikimedia.org/wikipedia/id/6/62/Logo_Unpad.JPG","Kampus Negeri"},
            {"Universitas Pasundan", "Universitas Pasundan atau dikenal dengan Unpas adalah sebuah universitas swasta di Bandung, Indonesia, yang memiliki Kampus di lima lokasi, yaitu di Jalan Lengkong Besar No. 68 (Kampus I), Jalan Tamansari No. 6-8 (Kampus II), Jalan Wartawan IV No. 22 (Kampus III), Jalan Dr. Setiabudhi No. 193 (Kampus IV), dan Jalan Sumatera No. 41 (Kampus V).", "http://prfmnews.com/images/logounpas-baru.jpg","Kampus Swasta"},
    };
    public static ArrayList<Kampus> getListData(){
        ArrayList<Kampus> list = new ArrayList<>();
        for (String[] aData : data) {
            Kampus kampus = new Kampus();
            kampus.setName(aData[0]);
            kampus.setDetail(aData[1]);
            kampus.setPhoto(aData[2]);
            kampus.setCategory(aData[3]);
            list.add(kampus);
        }
        return list;
    }
}
