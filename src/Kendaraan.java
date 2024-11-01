import java.util.ArrayList;
abstract class Kendaraan {
    protected String noPlat;
    protected String merk;
    protected String model;
    protected int tahun;
    protected String warna;
    protected ArrayList<Pelayanan> riwayatPelayanan = new ArrayList<>();

    public Kendaraan(String noPlat, String merk, String model, int tahun) {
        this.noPlat = noPlat;
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }

    abstract public String getJenisKendaraan();
    abstract public String getInfoTambahan();

    // setter dan getter
    public String getNoPlat() { return noPlat; }
    public String getMerk() { return merk; }
    public String getModel() { return model; }
    public int getTahun() { return tahun; }
    public String getWarna() { return warna; }
    public void setWarna(String warna){
        this.warna = warna;
    }

    public void addPelayanan(Pelayanan pelayanan) {
        riwayatPelayanan.add(pelayanan);
    }

    public void tampilkanRiwayatPelayanan() {
        System.out.println("Riwayat pelayanan untuk " + getJenisKendaraan() + " (" + getNoPlat() + "):");
        for (Pelayanan pelayanan : riwayatPelayanan) {
            System.out.println(pelayanan.getDetail());
        }
    }
}