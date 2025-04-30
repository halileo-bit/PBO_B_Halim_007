package Tugas.Tugas_PBO4.users;

import Tugas.Tugas_PBO4.actions.MahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends Pengguna implements MahasiswaActions {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void login() {
        System.out.println("Login sebagai Mahasiswa");
    }

    @Override
    public void displayAppMenu() {
        System.out.println("1. Laporkan Barang Temuan/Hilang");
        System.out.println("2. Lihat Daftar Laporan");
        System.out.println("0. Logout");
        
        int pilihan = scanner.nextInt();
        switch (pilihan) {
            case 1:
                reportItems();
                break;
            case 2:
                viewReportedItems();
                break;
            case 0:
                System.out.println("Logout berhasil.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    @Override
    public void reportItems() {
        // Implementasi method reportItems()
        System.out.println("Silakan masukkan detail barang yang ingin dilaporkan.");
        // Input Logic
    }

    @Override
    public void viewReportedItems() {
        // Implementasi placeholder
        System.out.println("Fitur Lihat Laporan Belum Tersedia <<");
    }
}
