package Tugas_PBO5.data;

public class item {
    private String nama, deskripsi, lokasi, status; // status: reported or Claimed

    public item(String nama, String deskripsi, String lokasi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.lokasi = lokasi;
        this.status = "Reported";
    }

    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getLokasi() {
        return lokasi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
