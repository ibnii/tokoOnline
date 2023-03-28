package TokoOnline;

import java.util.ArrayList;

public class karyawan implements User {

    ArrayList<String> namaKaryawan = new ArrayList<String>();
    ArrayList<String> Alamat = new ArrayList<String>();
    ArrayList<String> jabatan = new ArrayList<String>();
    ArrayList<String> telepon = new ArrayList<String>();

    karyawan(){
        setAwal();
    }
    void setAwal(){
        namaKaryawan.add("Paijo");
        namaKaryawan.add("Sumi");
        namaKaryawan.add("Kuci");

        Alamat.add("Denpasar");//Paijo
        Alamat.add("Cianjur");//Sumi
        Alamat.add("Bali");//Kuci

        telepon.add("0823 1831 6301");
        telepon.add("0852 5914 5807");
        telepon.add("0854 6753 6521");

        jabatan.add("Karyawan");
        jabatan.add("Karyawan");
        jabatan.add("Karyawan");
    }

    void print(){

    }

//    void setSaldo(int saldo){
//        this.jabatan.add(saldo);
//    }
//    int getsaldo(int index){
//        return this.jabatan.get(index);
//    }
    int jumlahKaryawan(){
        return (this.namaKaryawan.size() + 1);
    }
    @Override
    public void setnama(String name) {
        namaKaryawan.add(name);
    }
    @Override
    public void setAlamat(String alamat) {
        Alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    @Override
    public String getAlamat(String alamat) {
        return null;
    }
    @Override
    public String getTelepon(String telepon) {
        return null;
    }
    @Override
    public String getNama(String nama) {
        return null;
    }
}
