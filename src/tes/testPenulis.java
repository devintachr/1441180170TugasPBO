package tes;

/**
 * Created by Vinta on 6/11/2015.
 */
public class testPenulis {
    public static void main(String[] args) {

        penulis RadityaDika = new penulis ("Raditya Dika", "Jakarta", 'L');
        penulis DevintaChristanti = new penulis ("Devinta Christanti","Jayapura", "Lajang", 'P', 19);

        System.out.println(DevintaChristanti.toString());
        System.out.println(RadityaDika.toString());
    }
}
