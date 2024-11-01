// inheritance 
class Motor extends Kendaraan {
    private String jenisTransmisi;

    // overloading constructor
    public Motor(String noPlat, String merk, String model, int tahun, String jenisTransmisi) {
        super(noPlat, merk, model, tahun);
        this.jenisTransmisi = jenisTransmisi;
    }
    public Motor(String noPlat, String merk, String model, int tahun) {
        super(noPlat, merk, model, tahun);
        this.jenisTransmisi = "Bebek";
    }

    // overriding
    @Override
    public String getJenisKendaraan() {
        return "Motor";
    }

    @Override
    public String getInfoTambahan() {
        return "Jenis Transmisi: " + jenisTransmisi + ", Warna: " + warna;
    }
}