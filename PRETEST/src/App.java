import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        try {
            system.out.println("Masukkan angka pertama: ");
        int angka1 = scan.nextInt();
        system.out.println("Masukkan angka kedua: ");
        int angka2 = scan.nextInt();
        
        int hasil = angka1 / angka2;
        System.out.println("hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("tidak bisa membagi dengan nol");
        } catch (InputMismatchException e) {
            System.out.println("input tidak valid");
        } finally {
            scan.close();
            System.out.println("program selesai");
        }
    }
}