package Tugas_PBO5.users;

import java.util.InputMismatchException;
import java.util.Scanner;
import Tugas_PBO5.data.login;

public class admin extends user {
    public admin(String username, String pwd) {
        super(username, pwd);
    }
    
public void manageItems() {
    if (login.reportedItems.isEmpty()) {
        System.out.println("Tidak ada barang yang dilaporkan.");
        return;
    }
    System.out.println("Daftar barang yang dilaporkan:");
    for (int i = 0; i < login.reportedItems.size(); i++) {
        System.out.println(i + ". " + login.reportedItems.get(i));
    }

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan indeks barang yang ingin ditandai sebagai 'Claimed': ");
            int index = scanner.nextInt();
            if (index < 0 || index >= login.reportedItems.size()) {
                throw new IndexOutOfBoundsException("Indeks tidak valid!");
            }
            login.reportedItems.get(index).setStatus("Claimed");
            System.out.println("Barang berhasil ditandai sebagai 'Claimed'.");
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

