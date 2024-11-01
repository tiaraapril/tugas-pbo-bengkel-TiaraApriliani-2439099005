public class Main {
    public static void main(String[] args) {
        Bengkel bengkel = new Bengkel("Bengkel Mutiara Merdeka");
        Kasir kasir = new Kasir("Zaila", "08222341331");

        // membuat objek dengan class Pelanggan
        Pelanggan pelanggan1 = new Pelanggan("P061", "Wawa", "082375365599", "Jl. Yosudarso No. 15");
        Pelanggan pelanggan2 = new Pelanggan("P005", "Ara", "081276898870", "Jl. Paus No. 6");
        Pelanggan pelanggan3 = new Pelanggan("P006", "Yaya", "082275225372", "Jl. Harapan No.4");

        // membuat objek dengan class mobil dan motor yang inheritance terhadap class kendaraan
        Mobil mobil1 = new Mobil("BM 2424 TA", "Toyota", "Avanza", 2021, 6);
        mobil1.setWarna("Putih");
        Motor motor1 = new Motor("BM 8888 HM", "Honda", "Scoopy", 2023, "Matic");
        motor1.setWarna("Hitam");
        Motor motor2 = new Motor("BM 8888 HM", "Honda", "Scoopy", 2023);
        motor2.setWarna("Hitam");
        Mobil mobil2 = new Mobil("BM 6450 AP", "BMW", "520i", 2024, 4);
        mobil2.setWarna("Kuning");


        // menambahkan costumer ke class bengkel
        bengkel.tambahPelanggan(pelanggan1);
        bengkel.tambahPelanggan(pelanggan2);
        bengkel.tambahPelanggan(pelanggan3);

        // kelas pelayanan yang di inginkan
        kasir.tambahLayanan("Ganti Oli", 300000);
        kasir.tambahLayanan("Ganti Filter Udara", 200000);
        kasir.pelayanan("SV005", mobil1, pelanggan1, "Ganti Oli", "Ganti Filter Udara");

        kasir.tambahLayanan("Tune Up Mesin", 300000);
        kasir.pelayanan("SV008", motor1, pelanggan2, "Tune Up Mesin");

        kasir.tambahLayanan(300000);
        kasir.pelayanan("SV008", motor1, pelanggan2, "Tune Up Mesin");

        kasir.tambahLayanan("Ganti Kaca", 300000);
        kasir.tambahLayanan("Ganti Oli Mesin", 6000000);
        kasir.pelayanan("SV009", mobil2, pelanggan3, "Ganti Kaca", "Ganti Oli Mesin");

        // Menampilkan info
        bengkel.tampilkanInfoBengkel();
        System.out.println("\n\nDETAIL RIWAYAT SERVICE:");
        mobil1.tampilkanRiwayatPelayanan();
        motor1.tampilkanRiwayatPelayanan();
        mobil2.tampilkanRiwayatPelayanan();
    }
}