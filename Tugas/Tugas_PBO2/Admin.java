package Tugas_PBO2;

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

