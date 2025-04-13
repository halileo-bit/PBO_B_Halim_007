import java.util.Scanner;

public class Alternatif_Tugas_PBO2 {
    public class Admin {
        String user, pwd, nama;
        
        public Admin(String user, String pwd, String nama) {
            this.user = user;
            this.pwd = pwd;
            this.nama = nama;
        }
    
        public boolean login(String pengguna, String sandi) {
            return this.user.equals(pengguna) && this.pwd.equals(sandi);
        }
    
        public String getName() {
            return nama;
        }
    }
    
    public class Mahasiswa {
        String nama, nim;
    
        public Mahasiswa(String nama, String nim) {
            this.nama = nama;
            this.nim = nim;
        }
    
        public boolean login(String nama, String nim) {
            return this.nama.equals(nama) && this.nim.equals(nim);
        }
    
        public void displayInfo() {
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
        }
    }

    public class login {
    Admin admin;
    Mahasiswa mahasiswa;

        public void addAdmin() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan nama admin: ");
            String name = scanner.nextLine();
            System.out.print("Masukkan username admin: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password admin: ");
            String password = scanner.nextLine();
            admin = new Admin(username, password, name);
            System.out.println("Admin berhasil ditambahkan!\n");
        }

        public void addMahasiswa() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM mahasiswa: ");
            String nim = scanner.nextLine();
            mahasiswa = new Mahasiswa(nama, nim);
            System.out.println("Mahasiswa berhasil ditambahkan!\n");
        }

        public void start() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Pilih jenis login: 1. Admin 2. Mahasiswa");
            int choice = scanner.nextInt();
            scanner.nextLine(); // untuk membaca newline setelah input angka

            if (choice == 1) {
                if (admin == null) {
                    System.out.println("Admin belum ditambahkan.\n");
                    return;
                }

                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();

                if (admin.login(username, password)) {
                    System.out.println("Login berhasil. Selamat datang, " + admin.getName() + "!\n");
                    } else {
                    System.out.println("Login gagal. Username atau password salah.\n");
                    }
                } else if (choice == 2) {
                    if (mahasiswa == null) {
                    System.out.println("Mahasiswa belum ditambahkan.\n");
                    return;
                    }

                System.out.print("Masukkan nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();

                if (mahasiswa.login(nama, nim)) {
                    System.out.println("Login berhasil.");
                    mahasiswa.displayInfo();
                    System.out.println();
                    } else {
                        System.out.println("Login gagal. Nama atau NIM salah.\n");
                    }
                } else {
                    System.out.println("Pilihan tidak valid.\n");
                }
            }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            login loginSystem = new login();

            while (true) {
                System.out.println("Menu Utama:");
                System.out.println("1. Tambah Admin");
                System.out.println("2. Tambah Mahasiswa");
                System.out.println("3. Login");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu: ");
                int menuChoice = scanner.nextInt();
                scanner.nextLine(); // untuk membaca newline setelah input angka

                switch (menuChoice) {
                    case 1:
                        loginSystem.addAdmin();
                        break;
                    case 2:
                        loginSystem.addMahasiswa();
                        break;
                    case 3:
                        loginSystem.start();
                        break;
                    case 4:
                        System.out.println("Keluar dari sistem. Sampai jumpa!");
                        return;
                    default:
                        System.out.println("Pilihan tidak valid. Coba lagi.\n");
                        break;
                }
            }
        }
    }
}