package Tugas_PBO2;

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

