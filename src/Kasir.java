import java.util.ArrayList;
class Kasir {
    private String nama;
    private String noTelp;
    private ArrayList<Layanan> layananList = new ArrayList<>();

    public Kasir(String nama, String noTelp) {
        this.nama = nama;
        this.noTelp = noTelp;
    }

    // Method overloading
    public void tambahLayanan(String namaLayanan, int harga) {
        layananList.add(new Layanan(namaLayanan, harga));
    }

    public void tambahLayanan(int harga) {
        layananList.add(new Layanan(harga));
    }

    public void pelayanan(String kode, Kendaraan kendaraan, Pelanggan pelanggan, String... layananNames) {
        StringBuilder detail = new StringBuilder("Kode: " + kode + ", Pelanggan: " + pelanggan.getNama() + 
                        ", Kendaraan: " + kendaraan.getJenisKendaraan() + 
                        " (" + kendaraan.getNoPlat() + "), Layanan: ");

        for (String layananName : layananNames) {
            for (Layanan layanan : layananList) {
                if (layanan.getNama().equals(layananName)) {
                    detail.append(layanan.getNama()).append(" (").append(layanan.getHarga()).append("), ");
                    kendaraan.addPelayanan(new Pelayanan(layanan.getNama() + " (" + layanan.getHarga() + ")")); // Add only this service
                }
            }
        }

        if (detail.length() > 0) {
            detail.setLength(detail.length() - 2);
        }

        System.out.println(detail.toString()); // Display the transaction detail
    }
}

// layanan class
class Layanan {
    private String nama;
    private int harga;

    public Layanan(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public Layanan(int harga) {
        this.nama = "Pembersihan mesin";
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
}

// Pelayanan class
class Pelayanan {
    private String detail;

    public Pelayanan(String detail) {
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }
}