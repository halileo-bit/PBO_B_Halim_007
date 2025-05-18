package Tugas_PBO5.data;

import java.util.ArrayList;
import Tugas_PBO5.users.admin;
import Tugas_PBO5.users.mahasiswa;
import Tugas_PBO5.users.user;

public class login {
    public static ArrayList<user> userList = new ArrayList<>();
    public static ArrayList<item> reportedItems = new ArrayList<>();

    public static user loginUser(String username, String pwd) {
        for (user user : userList) {
            if (user instanceof admin && user.getUsername().equals(username) && user.getpwd().equals(pwd)) {
                return user;
            } else if (user instanceof mahasiswa && user.getUsername().equals(username) && ((mahasiswa) user).getNim().equals(pwd)) {
                return user;
            }
        }
        System.err.println("Username atau password salah.");
        return null;
    }
}
