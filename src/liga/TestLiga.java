package liga;

import java.util.ArrayList;

/**
 * Created by Vinta on 6/25/2015.
 */
public class TestLiga {
    public static ArrayList<Liga> daftarLiga = new ArrayList<Liga>();
    public static void main(String[] args) {

        //ArrayList<Liga> daftarLiga= new ArrayList<Liga>();

        Liga Italy = new Liga("Italy");
        Divisi divisi1 = new Divisi("Divisi 1");
        Divisi divisi2 = new Divisi("Divisi 2");
        Klub klub1 = new Klub("Juventus");
        Klub klub2 = new Klub("AC Milan");
        Klub klub3 = new Klub("AS Roma");
        Klub klub4 = new Klub ("Internasionale Milano");

        daftarLiga.add(Italy);

        Italy.setDaftarDivisi(divisi1);
        Italy.setDaftarDivisi(divisi2);
        divisi1.setDaftarKlubDivisi(klub1);
        divisi1.setDaftarKlubDivisi(klub2);
        divisi2.setDaftarKlubDivisi(klub3);
        divisi2.setDaftarKlubDivisi(klub4);


        //System.out.println(serieA.getDaftarKlubDivisi());
       //nomor 1
        System.out.println("Nomor 1");
        System.out.println("Daftar Divisi");
        System.out.println(Italy.getDaftarDivisi());
        System.out.println("#############################");
        //nomor 2
        System.out.println("Nomor 2");
        System.out.println("Daftar klub pada semua divisi");
        Italy.getDaftarKlub();
        System.out.println("#############################");
        //nomor 3
        System.out.println("Nomor 3");
        System.out.println("Daftar klub pada divisi :" + divisi2.getDaftarKlubDivisi());
        System.out.println("#############################");
        //nomor 4
        System.out.println("Nomor 4");
        System.out.println(Italy.getNamaKlub("AC Milan"));
        System.out.println("#############################");
        //nomor 5
        System.out.println("Nomor 5");
        System.out.println(getNamaLiga("Juventus"));



    }
//nomor 5
    public static String getNamaLiga(String klub){
        String namaliga = "klub tidak ditemukan";
        for(int i=0;i<daftarLiga.size();i++){
            Liga liga = daftarLiga.get(i);
            if(liga.getNamaKlub(klub).equals(namaliga)){
            }else{
                namaliga = "klub "+klub+" berada di liga "+liga.getNamaLiga();
            }
        }

        return namaliga;
    }

}
