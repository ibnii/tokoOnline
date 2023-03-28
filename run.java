package TokoOnline;
import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        barang    b = new barang();
        karyawan  c = new karyawan();
        member    d = new member();
        Transaksi a = new Transaksi(b,c,d);

        a.buy();


    }
}
