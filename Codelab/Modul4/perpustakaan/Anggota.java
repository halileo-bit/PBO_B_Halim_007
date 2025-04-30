package perpustakaan;

public class Anggota implements Peminjaman {
    private String nama;
    private String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    @Override
    public void pinjamBuku(String judulBuku, int durasiPeminjaman) {
        System.out.println(nama + " meminjam buku berjudul: " + judulBuku + " selama " + durasiPeminjaman + " hari.");
    }
    @Override
    public void kembalikanBuku(String judulBuku) {
        System.out.println(nama + " mengembalikan buku berjudul: " + judulBuku);
    }
}