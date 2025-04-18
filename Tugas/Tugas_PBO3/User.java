package Tugas_PBO3;

public class User {
    protected String nama;

    public User(String nama) {
        this.nama = nama;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
    }
}
