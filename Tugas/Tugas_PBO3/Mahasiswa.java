package Tugas_PBO3;

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
