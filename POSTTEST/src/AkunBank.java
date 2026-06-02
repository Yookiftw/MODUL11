public class AkunBank {
    private String nomorRekening;
    private double saldo, totalTransferHariIni;

    public AkunBank(String nomorRekening, double saldo, double totalTransferHariIni) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
        this.totalTransferHariIni = totalTransferHariIni;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTotalTransferHariIni() {
        return totalTransferHariIni;
    }

    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void tarikTunai(double nominal) throws SaldoTidakMencukupiException {
        if (saldo < nominal) {
            throw new SaldoTidakMencukupiException(nominal - saldo);
        }
        saldo -= nominal;
    }

    public void transfer(AkunBank tujuan, double nominal) throws SaldoTidakMencukupiException, BatasTransferHarianException {
        if (saldo < nominal) {
            throw new SaldoTidakMencukupiException(nominal - saldo);
        }
        if (totalTransferHariIni + nominal > 10000000) {
            throw new BatasTransferHarianException("Transaksi gagal! Melebihi limit transfer harian Rp 10.000.000.");
        }
        saldo -= nominal;
        totalTransferHariIni += nominal;
        tujuan.setSaldo(tujuan.getSaldo() + nominal);
    }
}