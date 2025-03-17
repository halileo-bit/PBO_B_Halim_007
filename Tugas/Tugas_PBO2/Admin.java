package Tugas_PBO2;

import java.util.Scanner;

public class Admin {
    String user, pwd;
    Scanner masuk = new Scanner(System.in);

    void masuk() {
        do {
            System.out.print("Username: "); user = masuk.nextLine();
            System.out.print("Password: "); pwd = masuk.nextLine();
            if (user.equals("admin") && pwd.equals("admin1092")) {
                System.out.println("Login Berhasil.");
            } else {
                System.out.println("Login Gagal.");
            }
        } while (!user.equals("admin") && !pwd.equals("admin1092"));
    }
}
