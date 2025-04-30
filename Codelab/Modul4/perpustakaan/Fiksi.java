package perpustakaan;

public class Fiksi extends Buku {
    public Fiksi(String judul, String penulis) {
        super(judul, penulis);
    }

    @Override
    public String displayInfo() {
        return "Buku Fiksi: " + judul + " oleh " + penulis + " (Genre: Fiksi)";
    }
}
