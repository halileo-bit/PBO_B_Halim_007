package perpustakaan;

public class NonFiksi extends Buku {
    public NonFiksi(String judul, String penulis) {
        super(judul, penulis);
    }

    @Override
    public String displayInfo() {
        return "Buku Non-Fiksi: " + judul + " oleh " + penulis + " (Bidang: Sejarah & Ilmu Pengetahuan)";
    }
}
