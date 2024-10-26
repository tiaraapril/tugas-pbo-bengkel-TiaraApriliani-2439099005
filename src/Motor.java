public class Motor extends Kendaraan {
    private String jenisTranmisi;

    public Motor(String noPlat, String merk, String model, int tahun, String jenisTransmisi) {
        super(noPlat, merk, model, tahun);
        this.jenisTranmisi = jenisTransmisi;
    }

    @Override
    public String getJenisKendaraan() {
        return "Motor";
    }

    @Override
    public String getInfoTambahan() {
        return "Jenis Transmisi: " + jenisTranmisi;
    }
}
