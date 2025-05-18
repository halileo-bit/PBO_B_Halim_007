package Tugas_PBO5.users;

public abstract class user {
    protected String username, pwd;

    public user(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }

    public String getUsername() {
        return username;
    }

    public String getpwd() {
        return pwd;
    }
}
