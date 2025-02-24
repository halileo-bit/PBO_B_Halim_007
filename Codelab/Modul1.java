import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Modul1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // mengambil alat input dari import.java.util.Scanner

        System.out.print("masukkan nama: "); String nama = scanner.nextLine(); // mengeluarkan pernyataan untuk menginput nama.

        System.out.print("masukkan gender (P/L): "); String genderSingkat = scanner.nextLine().toUpperCase(); // mengeluarkan pernyataan untuk menginput gender.
        String gender = genderSingkat.equals("P") ? "perempuan" : "laki-laki"; // inputan dibikin singkat lalu akan keluar seperti misal L = laki-laki.

        System.out.print("masukkan tanggal lahir (yyyy-mm-dd): "); String tanggalLahirInput = scanner.nextLine(); // mengeluarkan pernyataan untuk menginput tanggal.
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput, DateTimeFormatter.ISO_LOCAL_DATE); // menentukan model penulisan tanggal melalui import java.time.format.DateTimeFormatter 

        LocalDate tanggalSekarang = LocalDate.now(); // mengambil dari tanggal sekarang
        int umur = Period.between(tanggalLahir, tanggalSekarang).getYears(); // dihitung dari tanggal sekarang ke tanggal lahir

        System.out.println("Curiculum Vitae:");
        System.out.println("Nama: " + nama); // lalu akan keluar hasil dari inputan tersebut.
        System.out.println("Gender: " + gender);
        System.out.println("Umur: " + umur + " Tahun");
    }    
}
