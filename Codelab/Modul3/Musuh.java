package Modul3;

public class Musuh extends Karakter {
    // constructor for Musuh, use super()
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan); // call constructor from Karakter
    }

    // override serangan method from Karakter
    @Override
    public void serangan(Karakter target) {
        // pesan serangan
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan sihir!");
        // darah terkuras 15
        target.setKesehatan(target.getKesehatan() - 15);
        // pesan darah terkuras
        System.out.println("Kesehatan " + target.getNama() + " Note: terkena serangan, darahnya terkuras 15 dan sekarang: " + target.getKesehatan());
    }
}
