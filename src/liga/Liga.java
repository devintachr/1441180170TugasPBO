package liga;

import java.util.ArrayList;

/**
 * Created by Vinta on 6/25/2015.
 */
public class Liga {
    private String namaLiga;
    private String[] daftarklub;
    ArrayList<Divisi> DaftarDivisi = new ArrayList<Divisi>();

    public Liga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public String getNamaLiga() {

        return namaLiga;
    }

    public void setNamaLiga(String namaLiga) {

        this.namaLiga = namaLiga;
    }

    public ArrayList<Divisi> getDaftarDivisi() {
        return DaftarDivisi;
    }

    public void setDaftarDivisi(Divisi divisi) {

        DaftarDivisi.add(divisi);
    }
//nomor 2
    public void getDaftarKlub() {
        for(int i=0;i<DaftarDivisi.size();i++){
            Divisi divisi = DaftarDivisi.get(i);
            System.out.println(divisi.getDaftarKlubDivisi());
        }

    }
//nomor 4
    public String getNamaKlub(String klub){
        String namadivisi="klub tidak ditemukan";
        for(int i=0;i<DaftarDivisi.size();i++){ // pengulangan untuk mengambil data tiap divisi
            Divisi divisi = DaftarDivisi.get(i);
            ArrayList<String> daftarklub = divisi.getDaftarKlubDivisi(); // arraylist sementara untuk menampung data klub
            for(int j=0;j<daftarklub.size();j++){ // pengulangan untuk mengambil data tiap klub
                String namaklub = daftarklub.get(j); //variabel penampung nama klub
                if(klub.equals(namaklub)){ // mengecek nama klub dengan nama klub dari parameter

                    namadivisi = "Klub "+klub+" berada dalam "+divisi.getNamaDivisi();
                }
            }
        }
        return namadivisi;
    }

    @Override
public String toString() {
        return "Liga{" +
                "namaLiga='" + namaLiga + '\'' +
                ", DaftarDivisi=" + DaftarDivisi +
                '}';
    }
}
 