public class  App {
    public static void main(String[] args) {
        // Membuat objek bengkel
        Bengkel bengkel = new Bengkel("Bengkel Mutiara Merdeka");

        // Membuat pelanggan
        Pelanggan pelanggan1 = new Pelanggan("P061", "wawa", "082375365599", "Jl. Yosudarso No. 15");
        Pelanggan pelanggan2 = new Pelanggan("P005", "araa", "081276898870", "Jl. Paus No. 6");

        // Membuat kendaraan
        Mobil mobil1 = new Mobil("BM 2424 TA", "Toyota", "Avanza", 2021, 7);
        Motor motor1 = new Motor("BM 8888 HM", "Honda", "Scoopy", 2023, "Matic");

        // Menambahkan pelanggan dan kendaraan ke bengkel
        bengkel.tambahPelanggan(pelanggan1);
        bengkel.tambahPelanggan(pelanggan2);

        // Mencatat servis
        LayananServis servis1 = new LayananServis("SV005", mobil1, pelanggan1, "Ganti Oli");
        servis1.tambahLayanan("Ganti Oli Mesin", 300000);
        servis1.tambahLayanan("Ganti Filter Udara", 200000);

        LayananServis servis2 = new LayananServis("SV008", motor1, pelanggan2, "Tune Up");
        servis2.tambahLayanan("Tune Up Mesin", 300000);
        servis2.tambahLayanan("Ganti Busi", 60000);

        // Menambahkan servis ke bengkel
        bengkel.tambahServis(servis1);
        bengkel.tambahServis(servis2);

        // Menampilkan informasi
        bengkel.tampilkanInfoBengkel();
        System.out.println("\nDetail Servis:");
        bengkel.tampilkanRiwayatServis();
    }
}
