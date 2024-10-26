import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;

class LayananServis {
    private String idServis;
    private Kendaraan kendaraan;
    private Pelanggan pelanggan;
    private String jenisServis;
    private ArrayList<Map.Entry<String, Double>> daftarLayanan;
    private LocalDateTime waktuServis;

    // Constructor overloading
    public LayananServis(String idServis, Kendaraan kendaraan, Pelanggan pelanggan) {
        this(idServis, kendaraan, pelanggan, "Servis Umum");
    }

    public LayananServis(String idServis, Kendaraan kendaraan, Pelanggan pelanggan, String jenisServis) {
        this.idServis = idServis;
        this.kendaraan = kendaraan;
        this.pelanggan = pelanggan;
        this.jenisServis = jenisServis;
        this.daftarLayanan = new ArrayList<>();
        this.waktuServis = LocalDateTime.now();
    }

    public void tambahLayanan(String namaLayanan, double harga) {
        daftarLayanan.add(new AbstractMap.SimpleEntry<>(namaLayanan, harga));
    }

    public double hitungTotalBiaya() {
        return daftarLayanan.stream()
                .mapToDouble(layanan -> layanan.getValue())
                .sum();
    }

    public void tampilkanInfo() {
        System.out.println("ID Servis: " + idServis);
        System.out.println("Waktu: " + waktuServis.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
        System.out.println("Pelanggan: " + pelanggan.getNama());
        System.out.println("Kendaraan: " + kendaraan.getJenisKendaraan() + " " + 
                          kendaraan.getMerk() + " " + kendaraan.getModel());
        System.out.println("No. Plat: " + kendaraan.getNoPlat());
        System.out.println("Jenis Servis: " + jenisServis);
        System.out.println("Detail Layanan:");
        for (Map.Entry<String, Double> layanan : daftarLayanan) {
            System.out.printf("- %s: Rp %.2f%n", layanan.getKey(), layanan.getValue());
        }
        System.out.printf("Total Biaya: Rp %.2f%n", hitungTotalBiaya());
    }
}
