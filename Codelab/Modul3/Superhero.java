package Modul3;

public class Superhero extends Karakter {
    // constructor for Superhero, use super()
    public Superhero(String nama, int kesehatan) {
        super(nama, kesehatan); // call constructor from Karakter
    }

    // override serangan method from Karakter
    @Override
    public void serangan(Karakter target) {
        // pesan serangan
        System.out.println(getNama() + " menyerang " + target.getNama() + " dengan kekuatan super!");
        // darah terkuras 20
        target.setKesehatan(target.getKesehatan() - 20);
        // pesan darah terkuras
        System.out.println("Kesehatan " + target.getNama() + " Note: terkena serangan, darahnya terkuras 20 dan sekarang: " + target.getKesehatan());
    }
}
