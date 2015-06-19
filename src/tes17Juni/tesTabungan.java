package tes17Juni;

/**
 * Created by Vinta on 6/19/2015.
 */
public class tesTabungan {
    public static void main(String[] args) {

        account aa = new account (20000000.0);
        nasabah saya = new nasabah ("Devinta",aa);

        System.out.println("Hallo "+saya.getNamaNasabah()+", selamat datang di Bank Sesuka Hati");


        aa.setTarik(350000.0);
        System.out.println("Anda menarik uang sejumlah: "+aa.getTarik());
        System.out.println("saldo anda saat ini adalah: "+aa.getSaldo());

        System.out.println();
        System.out.println();

        aa.setSetor(5000000.0);
        System.out.println("Anda menyetor uang sejumlah: "+aa.getSetor());
        System.out.println("saldo anda saat ini adalah: "+aa.getSaldo());
    }

}
