import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Modul1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("masukkan gender (P/L): ");
        String genderSingkat = scanner.nextLine().toUpperCase();
        String gender = genderSingkat.equals("P") ? "perempuan" : "laki-laki";

        System.out.print("masukkan tanggal lahir (yyyy-mm-dd): ");
        String tanggalLahirInput = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput, DateTimeFormatter.ISO_LOCAL_DATE);

        LocalDate tanggalSekarang = LocalDate.now();
        int umur = Period.between(tanggalLahir, tanggalSekarang).getYears();

        System.out.println("Curiculum Vitae:");
        System.out.println("Nama: " + nama);
        System.out.println("Gender: " + gender);
        System.out.println("Umur: " + umur + " Tahun");
    }    
}
