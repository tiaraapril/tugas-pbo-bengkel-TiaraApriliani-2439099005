// Kelas induk 1: Bengkel

import java.util.ArrayList;

class Bengkel {
    private String nama;
    private ArrayList<Pelanggan> daftarPelanggan;
    private ArrayList<LayananServis> riwayatServis;

    public Bengkel(String nama) {
        this.nama = nama;
        this.daftarPelanggan = new ArrayList<>();
        this.riwayatServis = new ArrayList<>();
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        daftarPelanggan.add(pelanggan);
    }

    public void tambahServis(LayananServis servis) {
        riwayatServis.add(servis);
    }

    public void tampilkanInfoBengkel() {
        System.out.println("=== " + nama + " ===");
        System.out.println("Jumlah Pelanggan: " + daftarPelanggan.size());
        System.out.println("Jumlah Servis: " + riwayatServis.size());
    }

    public void tampilkanRiwayatServis() {
        for (LayananServis servis : riwayatServis) {
            servis.tampilkanInfo();
            System.out.println();
        }
    }
}