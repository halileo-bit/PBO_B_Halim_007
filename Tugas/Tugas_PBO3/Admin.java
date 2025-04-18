package Tugas_PBO3;

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
