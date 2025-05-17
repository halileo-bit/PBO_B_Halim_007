package Modul5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class manajemenStok {
    public static ArrayList<barang> listBarang = new ArrayList<>(); // wrapper class
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int pilihan, stok = 0, stokBaru = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Barang");
            System.out.println("3. Update Stok Barang");
            System.out.println("4. Hapus Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            
            try {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Clear the newline character
            } catch (InputMismatchException e) {
                pilihan = 0; // Set to an invalid option
                scanner.nextLine(); // Clear the invalid input
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama barang: "); String nama = scanner.nextLine();
                    // System.out.print("Masukkan harga barang: "); double harga = scanner.nextDouble();
                    System.out.print("Masukkan stok barang: ");
                    try {
                        stok = scanner.nextInt();
                        scanner.nextLine(); // Clear the newline character
                    } catch (InputMismatchException e) {
                        System.out.println("Stok harus berupa angka.");
                        scanner.nextLine(); // Clear the invalid input
                    }
                    listBarang.add(new barang(nama, stok)); // autoboxing
                    System.out.println("Barang berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("Daftar Barang:");
                    for (int i = 0; i < listBarang.size(); i++) {
                        barang b = listBarang.get(i); // unboxing
                        System.out.println((i + 1) + ". " + b.getNama() + " Stok: " + b.getStok());
                    }
                    if (listBarang.isEmpty()) {
                        System.out.println("Tidak ada barang dalam daftar.");
                    } else {
                        System.out.println("Total barang: " + listBarang.size());
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nomor barang yang ingin diupdate: "); int nomorUpdate = scanner.nextInt();
                    if (nomorUpdate > 0 && nomorUpdate <= listBarang.size()) {
                        System.out.print("Masukkan stok baru: ");
                        try {
                            stokBaru = scanner.nextInt();
                            scanner.nextLine(); // Clear the newline character
                        } catch (InputMismatchException e) {
                            System.out.println("Stok harus berupa angka.");
                            scanner.nextLine(); // Clear the invalid input
                        }
                        listBarang.get(nomorUpdate - 1).setStok(stokBaru);
                        System.out.println("Stok barang berhasil diupdate.");
                    } else {
                        System.out.println("Nomor barang tidak valid.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nomor barang yang ingin dihapus: "); int nomorHapus = scanner.nextInt();
                    if (nomorHapus > 0 && nomorHapus <= listBarang.size()) {
                        listBarang.remove(nomorHapus - 1);
                        System.out.println("Barang berhasil dihapus.");
                    } else {
                        System.out.println("Nomor barang tidak valid.");
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}
