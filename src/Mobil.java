// Kelas anak 1: Mobil (turunan dari Kendaraan)
class Mobil extends Kendaraan {
    private int jumlahKursi;

    public Mobil(String noPlat, String merk, String model, int tahun, int jumlahKursi) {
        super(noPlat, merk, model, tahun);
        this.jumlahKursi = jumlahKursi;
    }

    @Override
    public String getJenisKendaraan() {
        return "Mobil";
    }

    @Override
    public String getInfoTambahan() {
        return "Jumlah Kursi: " + jumlahKursi;
    }
}