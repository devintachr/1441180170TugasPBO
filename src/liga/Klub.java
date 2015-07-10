package liga;

import java.util.ArrayList;

/**
 * Created by Vinta on 6/25/2015.
 */
public class Klub {
    private String namaKlub;

    public Klub(String namaKlub) {
        this.namaKlub = namaKlub;
    }

    public String getNamaKlub() {
        return namaKlub;
    }

    public void setNamaKlub(String namaKlub) {
        this.namaKlub = namaKlub;
    }

    public String getNamaLiga(ArrayList<Liga> daftarLiga,String klub){
        String namaliga="klub tidak ditemukan";
        for(int i=0;i<daftarLiga.size();i++){ // pengulangan untuk mengambil data tiap divisi
            Liga liga = daftarLiga.get(i);
            if(liga.getNamaKlub(klub).equals(namaliga)){
            }else{
                namaliga = "klub "+klub+" berada di liga "+liga.getNamaLiga();
            }
        }

        return namaliga;
    }
}
