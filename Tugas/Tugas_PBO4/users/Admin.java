package Tugas.Tugas_PBO4.users;

import Tugas.Tugas_PBO4.actions.AdminActions;
import java.util.Scanner;

public class Admin extends Pengguna implements AdminActions {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void login() {
        System.out.println("Login sebagai Admin");
    }

    @Override
    public void displayAppMenu() {
        System.out.println("1. Kelola Barang Temuan/Hilang");
        System.out.println("2. Kelola Pengguna");
        System.out.println("0. Logout");
        
    int pilihan = scanner.nextInt();
        switch (pilihan) {
            case 1:
                manageItems();
                break;
            case 2:
                manageUsers();
                break;
            case 0:
                System.out.println("Logout berhasil.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    @Override
    public void manageItems() {
        System.out.println("Fitur Kelola Barang Temuan/Hilang Belum Tersedia <<");
    }

    @Override
    public void manageUsers() {
        System.out.println("Fitur Kelola Pengguna Belum Tersedia <<");
    }
}