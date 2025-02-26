import java.util.Scanner;

public class Tugas_PBO1 {
    public static void main(String[] args) {
        String nama, nim, pwd;

        Scanner masuk = new Scanner(System.in);

        System.out.println("Menu buat pilih login anda: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Keluar");
        System.out.print("Pilihan anda: "); String pilih = masuk.nextLine();

        switch (pilih) {
            case "1" :

                    System.out.print("masukkan username: "); nama = masuk.nextLine();
                    System.out.print("masukkan password: "); pwd = masuk.nextLine();

                    if (nama.equals("Bang256") && pwd.equals("sabrina25")) {
                        System.out.println("login anda telah berhasil.");
                    } else {
                        System.out.println("username/password anda salah.");
                    }
                
                break;

            case "2" :

                    System.out.print("masukkan NIM: "); nim = masuk.nextLine();

                    if (nim.length() == 15) {
                        System.out.println("login anda telah berhasil.");
                    } else {
                        System.out.println("NIM harus 15 karakter.");
                    }

            case "3" :

                    System.exit(0);
                    break;
        
            default:
                System.out.println("pilihan anda cuma 1, 2, dan 3 yah!!");
        }
    }
}
