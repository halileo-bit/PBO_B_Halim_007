package Tugas.Tugas_PBO4.app;

import Tugas.Tugas_PBO4.users.Admin;
import Tugas.Tugas_PBO4.users.Mahasiswa;
import Tugas.Tugas_PBO4.users.Pengguna;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pengguna pengguna = null;

        System.out.println("Selamat datang di Aplikasi Temuan dan Barang Hilang!");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih jenis pengguna (1/2): ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            pengguna = new Admin();
        } else if (pilihan == 2) {
            pengguna = new Mahasiswa();
        } 
        
        if (pengguna != null) {
            pengguna.login();
            pengguna.displayAppMenu();
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }
    }
}
