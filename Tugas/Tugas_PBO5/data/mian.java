package Tugas_PBO5.data;

import Tugas_PBO5.users.user;
import Tugas_PBO5.users.admin;
import Tugas_PBO5.users.mahasiswa;

import java.util.Scanner;

public class mian {
    public static void main(String[] args) {
        login.userList.add(new admin("admin", "admin123"));
        login.userList.add(new mahasiswa("Halim", "12345"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        user user = login.loginUser(username, password);
        if (user instanceof mahasiswa) {
            mahasiswa mahasiswa = (mahasiswa) user;
            mahasiswa.reportItems();
            mahasiswa.viewReportedItems();
        } else if (user instanceof admin) {
            admin admin = (admin) user;
            admin.manageItems();
        }
    }
}
