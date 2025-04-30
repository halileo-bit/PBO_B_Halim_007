package app;

import perpustakaan.Buku;
import perpustakaan.Anggota;
import perpustakaan.Fiksi;
import perpustakaan.NonFiksi;

public class Main {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Wahyuu Andika", "B075");
        Anggota anggota2 = new Anggota("Ega Faiz", "A047");

        Buku buku1 = new NonFiksi("Madilog", "Tan Malaka");
        Buku buku2 = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu");

        System.out.println(buku1.displayInfo());
        System.out.println(buku2.displayInfo());

        anggota1.pinjamBuku(buku1.getJudul(), 5);
        anggota2.pinjamBuku(buku2.getJudul(), 7);
        anggota1.kembalikanBuku(buku1.getJudul());
        anggota2.kembalikanBuku(buku2.getJudul());
    }
}