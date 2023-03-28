package TokoOnline;

import java.util.ArrayList;

public class barang {

    ArrayList<String> namaBarang = new ArrayList<String>();
    ArrayList<Integer> stok = new ArrayList<Integer>();
    ArrayList<Integer> harga = new ArrayList<Integer>();
    ArrayList<Integer> idBarang = new ArrayList<Integer>();


    barang(){
        setAwal();
    }

    void cek(){
        for (int i = 0; i < namaBarang.size(); i++) {
            System.out.println(namaBarang.get(i) + "\t\t\t" + harga.get(i));
        }
    }

    void setAwal(){
        namaBarang.add("Nabati");
        namaBarang.add("Basreng");
        namaBarang.add("Milku");

        stok.add(17);//Nabati
        stok.add(14);//Basreng
        stok.add(13);//Milkuu

        harga.add(2000);//Nabati
        harga.add(3000);//Basreng
        harga.add(3000);//Milku

        idBarang.add(1);//Nabati
        idBarang.add(2);//Basreng
        idBarang.add(3);//milku
    }

    int getJumlahBarang (){
        return namaBarang.size();
    }

    void addNamaBarang(String nama){
        namaBarang.add(nama);
    }
    void getNamaBarang(int index){
        namaBarang.get(index);
    }
    void addStok(int stok){
        this.stok.add(stok);
    }
    void editStok(int stok,int index){
        this.stok.set(index,stok);
    }
//    void getStok(int index){
//        stok.get(index);
//    }

    public ArrayList<Integer> getStok() {
        return stok;
    }

    void addHarga(int harga){
        this.harga.add(harga);
    }
    void getHarga(int index){
        this.harga.get(index);
    }
    public ArrayList<Integer> getIdBarang() {
        return idBarang;
    }


}
