import java.util.ArrayList;
class Bengkel {
    private String nama;
    private ArrayList<Pelanggan> daftarPelanggan;

    public Bengkel(String nama) {
        this.nama = nama;
        this.daftarPelanggan = new ArrayList<>();
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        daftarPelanggan.add(pelanggan);
    }

    public void tampilkanInfoBengkel() {
        System.out.println("=== " + nama + " ===");
        System.out.println("Jumlah Pelanggan: " + daftarPelanggan.size());
    }
}