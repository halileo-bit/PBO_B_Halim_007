package perpustakaan;

public abstract class Buku {
    protected String judul, penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
    public abstract String displayInfo();

    public String getJudul() {
        return judul;
    }
}