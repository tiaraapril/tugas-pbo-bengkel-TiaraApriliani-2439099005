class Pelanggan {
    private String id;
    private String nama;
    private String noTelp;
    private String alamat;

    public Pelanggan(String id, String nama, String noTelp, String alamat) {
        this.id = id;
        this.nama = nama;
        this.noTelp = noTelp;
        this.alamat = alamat;
    }

    // Getter dan Setter
    public String getId() { return id; }
    public String getNama() { return nama; }
    public String getNoTelp() { return noTelp; }
    public String getAlamat() { return alamat; }

    public void setNoTelp(String noTelp) { this.noTelp = noTelp; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
}
