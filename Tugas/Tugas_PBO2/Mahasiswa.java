package Tugas_PBO2;

import java.util.Scanner;

public class Mahasiswa {
    String nama, nim;
    Scanner masuk = new Scanner(System.in);

    void masuk() {
        do {
            System.out.print("Nama: "); nama = masuk.nextLine();
            System.out.print("NIM: "); nim = masuk.nextLine();
            if (nama.equals(masuk) && nim.equals(masuk)) {
                System.out.println("Login Berhasil.");
            } else {
                System.out.println("Login Gagal.");
            }
        } while (!nama.equals(masuk) && !nim.equals(masuk));
    }

    void talk() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println();
    }
}
