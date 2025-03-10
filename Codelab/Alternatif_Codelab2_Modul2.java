import java.util.Scanner;

public class Alternatif_Codelab2_Modul2 {
    public class Rekening {
        String noRek, naPem;
        double saldo;
        Scanner masuk = new Scanner(System.in);
    
        void Rek() {
            System.out.print("Nomor Rekening: "); noRek = masuk.nextLine();
            System.out.print("Nama: "); naPem = masuk.nextLine();
            System.out.print("Saldo: "); saldo = masuk.nextDouble();
        }
    
        void talk() {
            System.out.println("Nomor Rekening: " + noRek);
            System.out.println("Nama: " + naPem);
            System.out.println("Saldo: " + saldo);
            System.out.println();
        }
    
        void setor(double jumlah) {
            System.out.print("Setor Berapa: "); jumlah = masuk.nextDouble();
            saldo += jumlah;
            System.out.println(naPem + " menabung sebesar Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
        }
    
        void tarik(double jumlah) {
            do {
                System.out.print("Tarik Berapa: "); jumlah = masuk.nextDouble();
                if (saldo >= jumlah) {
                    saldo -= jumlah;
                    System.out.println(naPem + " menarik uang sebesar Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
                } else {
                    System.out.println(naPem + " menarik uang sebesar Rp" + jumlah + ". (Saldo tidak cukup) Saldo saat ini: Rp" + saldo);
                }
            } while (saldo < jumlah);
            
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Rekening rekening1 = new Rekening();
            rekening1.Rek();
            rekening1.talk();
            rekening1.setor(0);
            rekening1.tarik(0);
            System.out.println();
        
            Rekening rekening2 = new Rekening();
            rekening2.Rek();
            rekening2.talk();
            rekening2.setor(0);
            rekening2.tarik(0);
            System.out.println();
    
            rekening1.talk();
            rekening2.talk();
        }
    }
}
