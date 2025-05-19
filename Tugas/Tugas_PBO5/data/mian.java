package Tugas_PBO5.data;

import Tugas_PBO5.users.user;
import Tugas_PBO5.users.admin;
import Tugas_PBO5.users.mahasiswa;

import java.util.Scanner;

public class mian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        user user = null;
        do {
            System.out.println("Selamat datang di sistem pelaporan barang hilang!");
            System.out.println("1. Login sebagai Mahasiswa");
            System.out.println("2. Login sebagai Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > 3) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid, silakan coba lagi.");
                continue;
            }

            if (choice == 1) {
                System.out.print("Masukkan username mahasiswa: ");
                String mhsUsername = scanner.nextLine();
                System.out.print("Masukkan password mahasiswa: ");
                String mhsPassword = scanner.nextLine();
                user = new mahasiswa(mhsUsername, mhsPassword);
                login.userList.add(user);
                ((mahasiswa) user).reportItems();
                ((mahasiswa) user).viewReportedItems();
            } else if (choice == 2) {
                System.out.print("Masukkan username admin: ");
                String adminUsername = scanner.nextLine();
                System.out.print("Masukkan password admin: ");
                String adminPassword = scanner.nextLine();
                user = new admin(adminUsername, adminPassword);
                login.userList.add(user);
                ((admin) user).manageItems();
            } else if (choice == 3) {
                System.out.println("Terima kasih telah menggunakan sistem ini!");
                break;
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (true);
    }
}
