abstract class Kendaraan {
    protected String noPlat;
    protected String merk;
    protected String model;
    protected int tahun;

    public Kendaraan(String noPlat, String merk, String model, int tahun) {
        this.noPlat = noPlat;
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }

    // Method yang akan di-override
    abstract public String getJenisKendaraan();
    abstract public String getInfoTambahan();

    // Getter
    public String getNoPlat() { return noPlat; }
    public String getMerk() { return merk; }
    public String getModel() { return model; }
    public int getTahun() { return tahun; }
}