import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] price = new int[3];
//Nomor 1
        try {
            for(int i = 0; i < 4; i++){
                System.out.println("Masukkan harga: ");
                price[i] = sc.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Kapasitas memori harga sudah penuh@");
        }
//Nomor 2
        try {
            System.out.println("Masukkan umur: ");
            int umur = sc.nextInt();
            Pelanggan member = new Pelanggan();
            member.daftarMember(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Maaf, umur Anda belum mencukupi untuk menjadi Member VIP");
            //ini kenapa harus sout juga walau sudah throw exception
        }
//Nomor 3
        Pelanggan member = new Pelanggan();
        try {
            member.pesanKopi(10);
        } catch (KopiHabisException e) {
            System.out.println("Stok kopi : " + member.stokKopi);
        }

//Nomor 4
        MesinKasir k = new MesinKasir();
        try {
            k.bayar(50000, 30000);
        } catch (KopiHabisException e) {
            System.out.println("Error kocak");
        }

//Nomor 5
        try {
           k.cetakStruk(false); 
        } catch (Exception e) {
            
        } finally {
            System.out.println("Terima kasih telah berkunjung ke Cafe Java Bean. Program kasir ditutup");
        }
    }
}
