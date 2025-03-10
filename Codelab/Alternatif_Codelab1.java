public class Alternatif_Codelab1 {
    public class Hewan {
        String nama, jenis, suara;
    
        Hewan(String nama, String jenis, String suara) {
            this.nama = nama;
            this.jenis = jenis;
            this.suara = suara;
        }
    
        void talk() {
            System.out.println("Nama: " + nama);
            System.out.println("Jenis: " + jenis);
            System.out.println("Suara: " + suara);
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Hewan nama1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
            Hewan nama2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");
    
            nama1.talk();
            nama2.talk();
        }
    }
}

