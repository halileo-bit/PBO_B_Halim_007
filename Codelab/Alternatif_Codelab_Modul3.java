public class Alternatif_Codelab_Modul3 {
    public class Karakter {
        // deklarasi variabel yg bersifat private
        private String nama; 
        private int kesehatan;
    
        // constructor
        public Karakter(String nama, int kesehatan) {
            this.nama = nama;
            this.kesehatan = kesehatan;
        }
    
        // method getter dan setter untuk variabel nama dan kesehatan
        public String getNama() {
            return nama;
        }
    
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        public int getKesehatan() {
            return kesehatan;
        }
    
        public void setKesehatan(int kesehatan) {
            this.kesehatan = kesehatan;
        }
    
        // method serangan yang akan di-override oleh subclass
        public void serangan(Karakter target) {
            System.out.println("serangan perlu dilepaskan dari subclass.");
        }
    }

    public class Superhero extends Karakter {
        // constructor for Superhero, use super()
        public Superhero(String nama, int kesehatan) {
            super(nama, kesehatan); // call constructor from Karakter
        }
    
        // override serangan method from Karakter
        @Override
        public void serangan(Karakter target) {
            // pesan serangan
            System.out.println(getNama() + " menyerang " + target.getNama() + " dengan kekuatan super!");
            // darah terkuras 20
            target.setKesehatan(target.getKesehatan() - 20);
            // pesan darah terkuras
            System.out.println("Kesehatan " + target.getNama() + " Note: terkena serangan, darahnya terkuras 20 dan sekarang: " + target.getKesehatan());
        }
    }

    public class Musuh extends Karakter {
        // constructor for Musuh, use super()
        public Musuh(String nama, int kesehatan) {
            super(nama, kesehatan); // call constructor from Karakter
        }
    
        // override serangan method from Karakter
        @Override
        public void serangan(Karakter target) {
            // pesan serangan
            System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan sihir!");
            // darah terkuras 15
            target.setKesehatan(target.getKesehatan() - 15);
            // pesan darah terkuras
            System.out.println("Kesehatan " + target.getNama() + " Note: terkena serangan, darahnya terkuras 15 dan sekarang: " + target.getKesehatan());
        }
    }

    public static void main(String[] args) {
        // membuat objek dari class Karakter, Superhero, dan Musuh
        Karakter karakter = new Karakter("Karakter Umum", 100);
        Superhero superman = new Superhero("Superman", 150);
        Musuh joker = new Musuh("Joker", 200);

        // status kesehatan awal
        System.out.println(superman.getNama() + " memiliki kesehatan: " + superman.getKesehatan());
        System.out.println(joker.getNama() + " memiliki kesehatan: " + joker.getKesehatan());

        // pertempuran dimulai
        superman.serangan(joker); // Superman menyerang Joker
        joker.serangan(superman); // Joker menyerang Superman
    }
}
