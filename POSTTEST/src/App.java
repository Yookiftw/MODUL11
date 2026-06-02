public class App {
    public static void main(String[] args) {
        AkunBank akunKu = new AkunBank("11223344", 5000000, 0);
        AkunBank akunTujuan = new AkunBank("55667788", 0, 0);

        try {
            akunKu.tarikTunai(6000000);
            
            akunKu.transfer(akunTujuan, 11000000);
            
        } catch (SaldoTidakMencukupiException e) {
            System.out.println(e.getMessage());
            System.out.println("Kekurangan saldo Anda: Rp " + e.getKekurangan());
        } catch (BatasTransferHarianException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Sesi transaksi ATM Anda telah diakhiri. Kartu dikeluarkan otomatis.");
        }
    }
}