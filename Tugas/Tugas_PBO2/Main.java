package Tugas_PBO2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        Admin adm = new Admin();

        System.out.println("Login: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Keluar");
        System.out.print("Pilih: ");
        int pilih = masuk.nextInt();

        switch (pilih) {
            case 1:
                adm.masuk();   
                break;

            case 2:
                mhs.masuk();
                mhs.talk();
                break;

            case 3:
                System.out.println("Keluar.");
                break;
        
            default:
                break;
        }
    }
}
