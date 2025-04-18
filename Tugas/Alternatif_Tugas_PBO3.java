import java.util.Scanner;

public class Alternatif_Tugas_PBO3 {
        public class User {
            protected String nama;
    
            public User(String nama) {
                this.nama = nama;
            }
    
            public void displayInfo() {
                System.out.println("Nama: " + nama);
            }
        }

        public class Admin extends User {
            private String user, pwd;
        
            public Admin(String nama, String user, String pwd) {
                super(nama);
                this.user = user;
                this.pwd = pwd;
            }
            public boolean login(String user, String pwd) {
                return this.user.equals(user) && this.pwd.equals(pwd);
            }
        }

        public class Mahasiswa extends User {
            private String nim;
        
            public Mahasiswa(String nama, String nim) {
                super(nama);
                this.nim = nim;
            }
            public boolean login(String nama, String nim) {
                return this.nama.equals(nama) && this.nim.equals(nim);
            }
        
            @Override
            public void displayInfo() {
                super.displayInfo();
                System.out.println("NIM: " + nim);
            }
        }

        public class login {
        private Admin admin;
        private Mahasiswa mahasiswa;
        private Scanner scanner = new Scanner(System.in);

        public void addAdmin() {
            System.out.print("Masukkan nama admin: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan username admin: ");
            String user = scanner.nextLine();
            System.out.print("Masukkan password admin: ");
            String pwd = scanner.nextLine();
            admin = new Admin(nama, user, pwd);
            System.out.println("Admin berhasil ditambahkan.");
        }

        public void addMahasiswa() {
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM mahasiswa: ");
            String nim = scanner.nextLine();
            mahasiswa = new Mahasiswa(nama, nim);
            System.out.println("Mahasiswa berhasil ditambahkan.");
     }

        public void loginAdmin() {
            if (admin == null) {
                System.out.println("Admin belum terdaftar.");
                return;
            }
            System.out.print("Masukkan username admin: ");
            String user = scanner.nextLine();
            System.out.print("Masukkan password admin: ");
            String pwd = scanner.nextLine();
            if (admin.login(user, pwd)) {
                System.out.println("Login admin berhasil.");
                admin.displayInfo();
            } else {
                System.out.println("Login admin gagal.");
            }
        }

        public void loginMahasiswa() {
            if (mahasiswa == null) {
                System.out.println("Mahasiswa belum terdaftar.");
                return;
            }
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM mahasiswa: ");
            String nim = scanner.nextLine();
            if (mahasiswa.login(nama, nim)) {
                System.out.println("Login mahasiswa berhasil.");
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login mahasiswa gagal.");
            }
        }

        public void run() {
            int choice;
            do {
                System.out.println("1. Tambah Admin");
                System.out.println("2. Tambah Mahasiswa");
                System.out.println("3. Login Admin");
                System.out.println("4. Login Mahasiswa");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                switch (choice) {
                    case 1:
                        addAdmin();
                        break;
                    case 2:
                        addMahasiswa();
                        break;
                    case 3:
                        loginAdmin();
                        break;
                    case 4:
                        loginMahasiswa();
                        break;
                    case 5:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } while (choice != 5);
        }

        public static void main(String[] args) {
            login app = new login();
            app.run();
        }
    }
}
