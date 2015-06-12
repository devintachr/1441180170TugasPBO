package Tugas7;

/**
 * Created by Vinta on 6/12/2015.
 */
public class testDokter {
    public static void main(String[] args) {
        dokter abigail = new dokter ("Abigail Setyani","Sawojajar","Apotik Harapan Bunda");
        dokter yohanis = new dokter ("Yohanis Putranto","Sukun","Apotik SEjahtera");
        dokter melani = new dokter ("Melani Milanka", "Perum Dieng", "Apotik Sentosa");

        rumahSakit umum = new rumahSakit ("Poli Anak", "08.00 WIB",abigail);
        rumahSakit tentara = new rumahSakit("Poli Penyakit Dalam","08.00 WIB", yohanis);
        System.out.println(umum.toString());
        System.out.println(tentara.toString());

        System.out.println(abigail.toString());
        System.out.println(melani.toString());
    }
}
