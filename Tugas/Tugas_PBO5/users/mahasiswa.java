package Tugas_PBO5.users;

import Tugas_PBO5.data.item;
import Tugas_PBO5.data.login;
import java.util.Scanner;

public class mahasiswa extends user {
    private String nama, nim;

    public mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
    
    public void reportItems() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama barang: ");
        String itemName = scanner.nextLine();
        System.out.print("Masukkan deskripsi barang: ");
        String description = scanner.nextLine();
        System.out.print("Masukkan lokasi barang: ");
        String location = scanner.nextLine();

        item item = new item(itemName, description, location);
        login.reportedItems.add(item);
        System.out.println("Barang berhasil dilaporkan!");
    }

    public void viewReportedItems() {
        if (login.reportedItems.isEmpty()) {
            System.out.println("Belum ada laporan barang.");
            return;
        }
        System.out.println("Daftar barang yang telah dilaporkan:");
        for (item item : login.reportedItems) {
            if (item.getStatus().equals("Reported")) {
                System.out.println(item);
            }
        }
    }
}
