package perpustakaan;

public interface Peminjaman {
    void pinjamBuku(String judulBuku, int durasiPeminjaman);
    void kembalikanBuku(String judulBuku);
}
