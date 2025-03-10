package Codelab2_Modul2;

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
