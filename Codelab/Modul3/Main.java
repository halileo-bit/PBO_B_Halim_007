package Modul3;

public class Main {
    public static void main(String[] args) {
        // membuat objek dari class Karakter, Superhero, dan Musuh
        Karakter karakter = new Karakter("Karakter Umum", 100);
        Superhero superman = new Superhero("Superman", 150);
        Musuh joker = new Musuh("Joker", 200);

        // status kesehatan awal
        System.out.println(superman.getNama() + " memiliki kesehatan: " + superman.getKesehatan());
        System.out.println(joker.getNama() + " memiliki kesehatan: " + joker.getKesehatan());
        
        // pertempuran dimulai
        superman.serangan(joker); // Superman menyerang Joker
        joker.serangan(superman); // Joker menyerang Superman
    }
}
