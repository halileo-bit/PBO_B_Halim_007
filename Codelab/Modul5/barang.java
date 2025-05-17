package Modul5;

public class barang {
    private String nama;
    private int stok;
    // private double harga;

    public barang(String nama, int stok) {
        this.nama = nama;
        // this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    /*
    public double getHarga() {
        return harga;
    }
    */

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
