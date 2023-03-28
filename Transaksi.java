package TokoOnline;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi extends laporan{

    ArrayList<String> barangdibeli = new ArrayList<String>();
    ArrayList<String> namaPembeli = new ArrayList<String>();
    private ArrayList<Integer> banyakyangdibeli = new ArrayList<Integer>();
    barang barang;
    member member;
    karyawan karyawan;

    boolean Admins = false;

    ArrayList<Integer> banyak = new ArrayList<Integer>();
    ArrayList<Integer> idMember = new ArrayList<Integer>();

    int idMemberStart = 1,idKaryawanStart = 3;
    int indexofbarang;
    int angkaKaryawan;
    int jumlahTransaksi;
    int idbarangstart;
    String Yorn,YornAdmin,YornSwitchAccount,YornKaryawan;
    int pilih;
    int tahuindexusername;
    int saldotopup;
    int total = 0;

    Transaksi(barang barang,karyawan karyawan,member member){
        this.barang = barang;
        this.karyawan = karyawan;
        this.member = member;
    }

    public ArrayList<Integer> getBanyaknya() {
        return banyak;
    }

    public int getJumlahTransaksi() {
        return jumlahTransaksi;
    }

    void buy(){
        Scanner sc = new Scanner(System.in);

//        barang.setAwal();

        while (true) {
            Admins = false;
            System.out.println("Sign up Member / Sign in ? (U/I)");
            String Uori = sc.next();
            if (Uori.equalsIgnoreCase("U")) {
                System.out.print("Masukkan Username\t\t\t\t:");
                String username = sc.next();
                namaPembeli.add(username);
                System.out.print("Masukkan Alamat\t\t\t\t\t:");
                String adress = sc.next();
                System.out.print("Masukkan Telepon\t\t\t\t:");
                String number = sc.next();

                idMember.add(idMemberStart);
                ++idMemberStart;
                this.member.setnama(username);
                this.member.setAlamat(adress);
                this.member.setTelepon(number);

                tahuindexusername = this.member.namaMember.indexOf(username);

                System.out.println("Saldo anda 0 rupiah, Silahkan isi Saldo");
                System.out.println("Top up ? (Y/N)");
                String topup = sc.next();

                if (topup.equalsIgnoreCase("Y")) {
                    System.out.println("Masukkan nominal Top up ");
                    System.out.print("==> ");
                    saldotopup = sc.nextInt();

                    this.member.setSaldo(saldotopup);
                }

            } else if (Uori.equalsIgnoreCase("I")) {
                System.out.println("Silahkan masukkan Username anda ! ");
                System.out.println("Username : ");
                String usernameinput = sc.next();
                namaPembeli.add(usernameinput);

                if (usernameinput.equalsIgnoreCase("Admin")) {
                    Admins = true;
                    System.out.println("======================================");
                    System.out.println("         ANDA SEBAGAI ADMIN");
                    System.out.println("======================================");
                    System.out.println("Ingin menambah barang ? (Y/N)");
                    String YornAdmin = sc.next();
                    if (YornAdmin.equalsIgnoreCase("Y")) {

                        while (true) {
                            System.out.println("Masukkan nama barang");
                            System.out.print("==> ");
                            String namabarang = sc.next();
                            System.out.println("Masukkan stok");
                            System.out.print("==> ");
                            int stokbarang = sc.nextInt();
                            System.out.println("Masukkan harga");
                            System.out.print("==> ");
                            int hargabarang = sc.nextInt();

                            ++idbarangstart;
                            this.barang.addNamaBarang(namabarang);
                            this.barang.addStok(stokbarang);
                            this.barang.addHarga(hargabarang);
                            this.barang.idBarang.add(idbarangstart);

                            System.out.println("Ingin menambah kembali ? (Y/N)");
                            YornAdmin = sc.next();
                            if (YornAdmin.equalsIgnoreCase("N")) {
                                break;
                            }
                        }
                    }
                    System.out.println("Ingin Menambah Karyawan ? (Y/N)");
                    YornKaryawan = sc.next();
                    if(YornKaryawan.equalsIgnoreCase("Y")){
                        while (true) {
                            System.out.println("Masukkan nama");
                            System.out.print("==> ");
                            String namakaryawanInput = sc.next();
                            System.out.println("Masukkan Alamat");
                            System.out.print("==>");
                            String alamatInput = sc.next();
                            System.out.println("Masukkan nomor Telepon ");
                            System.out.print("==>");
                            String NoHpInput = sc.next();
                            System.out.println("Masukkan Jabatan");
                            System.out.print("==>");
                            String jabatanKaryawan = sc.next();


                            ++idKaryawanStart;
                            this.karyawan.namaKaryawan.add(namakaryawanInput);
                            this.karyawan.Alamat.add(alamatInput);
                            this.karyawan.telepon.add(NoHpInput);
                            this.karyawan.jabatan.add(jabatanKaryawan);

                            System.out.println("Ingin menambah kembali ? (Y/N)");
                            YornAdmin = sc.next();
                            if (YornAdmin.equalsIgnoreCase("N")) {
                                break;
                            }
                        }
                    }
                }
                tahuindexusername = this.member.namaMember.indexOf(usernameinput);

                System.out.println("======================================");
                System.out.println("Saldo anda\t\t: " + this.member.getsaldo(tahuindexusername));

            }

            System.out.println("======================================");
            System.out.println("Pilih karyawan / Default ? (P/D)");
            String Pord = sc.next();

            switch (Pord){
                case "P" :
                    for (int i = 0; i < karyawan.namaKaryawan.size(); i++) {
                        System.out.println((i + 1) + ". " + karyawan.namaKaryawan.get(i));
                    }
                    System.out.print("Masukkan angka : ");
                    angkaKaryawan = sc.nextInt();
                    System.out.println("Select / Lihat info ? (S/L)");
                    String Sorl = sc.next();
                    if (Sorl.equalsIgnoreCase("L")) {
                        System.out.println("======================================");
                        System.out.println("                INFO");
                        System.out.println("======================================");
                        System.out.println("Nama\t\t\t: " + this.karyawan.namaKaryawan.get(angkaKaryawan - 1));
                        System.out.println("Alamat\t\t\t: " + this.karyawan.Alamat.get(angkaKaryawan - 1));
                        System.out.println("Jabatan\t\t\t: " + this.karyawan.jabatan.get(angkaKaryawan - 1));
                        System.out.println("No HP\t\t\t: " + this.karyawan.telepon.get(angkaKaryawan - 1));
                    }
                case "D":
                    while (true) {
                        System.out.println("======================================");
                        for (int i = 0; i < barang.namaBarang.size(); i++) {
                            System.out.println(barang.namaBarang.get(i) + "\t\t\t" + barang.harga.get(i) + " ( " + this.barang.stok.get(i) + " stok )");
                        }
                        System.out.println("======================================");
                        System.out.println("Your id\t\t\t\t\t\t\t\t\t\t: " + idMemberStart);


                        System.out.print("Masukkan nama barang yang ingin dibeli\t\t: ");
                        String nameof = sc.next();
                        barangdibeli.add(nameof);
                        indexofbarang = barang.namaBarang.indexOf(nameof);

                        System.out.print("Masukkan jumlah yang ingin dibeli\t\t\t: ");
                        int jumlah = sc.nextInt();
                        banyakyangdibeli.add(jumlah);
                        //            System.out.println(this.barang.stok.get(indexofbarang));


                        int subtotal = barang.harga.get(indexofbarang) * jumlah;
                        this.total += subtotal;

                        if (this.member.saldo.get(tahuindexusername) < subtotal) {
                            System.out.println("======================================");
                            System.out.println("Saldo Anda tidak mencukupi");
                            System.out.println("======================================");
                            System.out.println("ingin Top up ? (Y/N)");
                            String topup = sc.next();

                            if (topup.equalsIgnoreCase("Y")) {
                                System.out.println("Masukkan nominal Top up ");
                                System.out.print("==> ");
                                saldotopup = sc.nextInt();

                                this.member.setSaldo(saldotopup);
                            }
                        } else if (this.member.saldo.get(tahuindexusername) >= subtotal && this.barang.stok.get(indexofbarang) >= jumlah) {
                            int kurangsaldo = this.member.saldo.get(tahuindexusername) - subtotal;
                            this.member.saldo.set(tahuindexusername, kurangsaldo);
                            //                this.member.saldo.set(kurangsaldo,tahuindexusername);
                            System.out.println("TOTAL\t\t\t\t\t\t\t\t\t\t: " + subtotal);
                            System.out.println("======================================");
                            System.out.println("Saldo anda\t\t: " + this.member.getsaldo(tahuindexusername) + " ==> ( " + (this.member.getsaldo(tahuindexusername) + subtotal) + " - " + subtotal + " )");
                            System.out.println("======================================");
                            int kurangstok = this.barang.stok.get(indexofbarang) - jumlah;
                            this.barang.editStok(kurangstok, indexofbarang);
                        } else if (this.barang.stok.get(indexofbarang) < jumlah) {
                            System.out.println("======================================");
                            System.out.println("   Mohon Maaf, Stok tidak mencukupi");
                            System.out.println("======================================");
                        }


                        System.out.println("ingin membeli kembali? (Y/N)");
                        Yorn = sc.next();
                        if (Yorn.equalsIgnoreCase("N")) {
                            break;
                        }


                    }
                    System.out.println("TOTAL\t\t\t\t\t\t\t\t\t\t: " + total);
                    System.out.println("======================================");
                    break;
                case "cek":
                    if(Admins){
                        while (true) {
                            System.out.println("1.Member\n2.Barang\n3.Transaksi");
                            System.out.print("Pilih = ");
                            pilih = sc.nextInt();

                            switch (pilih) {
                                case 1:
                                    laporanmember();
                                    break;
                                case 2:
                                    laporanbarang();
                                    break;
                                case 3:
                                    laporanTransaksi();
                                    break;
                            }
                            System.out.println("Ingin mengecek yang lain? (Y/N)");
                            String Yorncek = sc.next();
                            if(Yorncek.equalsIgnoreCase("N")){
                                break;
                            }
                        }
                    }else {
                        System.out.println("======================================");
                        System.out.println("MAAF SELAIN ADMIN TIDAK BISA MENGAKSES ");
                        System.out.println("======================================");
                    }


            }

            System.out.println("Ingin Switch Account ? (Y/N)");
            YornSwitchAccount = sc.next();
            if(YornSwitchAccount.equalsIgnoreCase("N")){
                break;
            }
        }

    }


    @Override
    public void laporanbarang(){
        System.out.println("======================================");
        System.out.print("Barang\t\t\t\t\t\t: " );
        for (int i = 0; i < this.barang.getJumlahBarang(); i++) {
            System.out.print(this.barang.namaBarang.get(i) + "\t\t");
        }
        System.out.println();

        System.out.print("ID barang\t\t\t\t\t: ");
        for (int i = 0; i < this.barang.getJumlahBarang(); i++) {
            System.out.print(this.barang.idBarang.get(i) + "\t\t\t\t");
        }
        System.out.println();

        System.out.print("Harga barang\t\t\t\t: " );
        for (int i = 0; i < this.barang.getJumlahBarang(); i++) {
            System.out.print(this.barang.harga.get(i) + "\t\t\t");
        }
        System.out.println();

        System.out.print("Stok tersedia\t\t\t\t: ");
        for (int i = 0; i < this.barang.getJumlahBarang(); i++) {
            System.out.print(this.barang.stok.get(i) + "\t\t\t");
        }
        System.out.println();
    }
    @Override
    public void laporanmember(){
        System.out.println("======================================");
        System.out.print("Nama pembeli\t\t\t: " );
        for (int i = 0; i < this.namaPembeli.size(); i++) {
            System.out.print(this.namaPembeli.get(i) + "\t");
        }
        System.out.println();

        System.out.print("ID member\t\t\t\t: " );
        for (int i = 0; i < this.idMember.size(); i++) {
            System.out.print(this.idMember.get(i) + "\t");
        }
        System.out.println();

        System.out.print("Alamat member\t\t\t: " );
        for (int i = 0; i < this.member.Alamat.size(); i++) {
            System.out.print(this.member.Alamat.get(i) + "\t");
        }
        System.out.println();
    }

    @Override
    public void laporanTransaksi(){
        System.out.println("======================================");
        System.out.print("Barang yang baru saja dibeli\t\t: " );
        for (int i = 0; i < this.barangdibeli.size(); i++) {
            System.out.print(this.barangdibeli.get(i) + "\t" + this.banyakyangdibeli.get(i) + " buah ,");
        }
        System.out.println();
        System.out.println("======================================");
    }




}
