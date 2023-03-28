package TokoOnline;

import java.util.ArrayList;

public class member implements User{

//    private String name,alamat,telepon;



    public ArrayList<String> namaMember = new ArrayList<String>();
    ArrayList<String> Alamat = new ArrayList<String>();
    protected ArrayList<String> Telepon = new ArrayList<String>();
    ArrayList<Integer> saldo = new ArrayList<Integer>();

    member(){
        setdefault();
    }
    void setdefault(){
        namaMember.add("Customer");
        Alamat.add("-");
        Telepon.add("-");
        saldo.add(0);

        namaMember.add("Admin");
        Alamat.add("-");
        Telepon.add("-");
        saldo.add(5000000);
    }

//    ArrayList<Integer> idMember = new ArrayList<Integer>();

    void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
//    public ArrayList<Integer> getIdMember() {
//        return idMember;
//    }
    int getsaldo(int index){
        return this.saldo.get(index);
    }
    void editsaldo(int index,int edit){
        this.saldo.set(index,edit);
    }
    int jumlahMember(){
        return (this.namaMember.size() + 1);
    }
    @Override
    public void setnama(String name) {
        namaMember.add(name);
    }
    @Override
    public void setAlamat(String alamat) {
        Alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon) {
        Telepon.add(telepon);
    }
//    @Override
//    public String getName(int index) {
//        return namaMember.get(index);
//    }
//    @Override
//    public String getAlamat(int index) {
//        return Alamat.get(index);
//    }
//    @Override
//    public String getTelepon(int index) {
//        return Telepon.get(index);
//    }

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
