package Modul3;

public class Karakter {
    // deklarasi variabel yg bersifat private
    private String nama; 
    private int kesehatan;

    // constructor
    public Karakter(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    // method getter dan setter untuk variabel nama dan kesehatan
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    // method serangan yang akan di-override oleh subclass
    public void serangan(Karakter target) {
        System.out.println("serangan perlu dilepaskan dari subclass.");
    }
}
