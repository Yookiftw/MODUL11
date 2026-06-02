public class MesinKasir {
    public void bayar(int totalBelanja, int uangDiberikan) throws UangKurangException {
        if (uangDiberikan < totalBelanja){
            System.out.println("Uang kurenk.");
        }
    }
    public void cetakStruk(boolean statusPrinter) throws Exception {
        throw new Exception("Kertas Struk Habis!");
    }
}