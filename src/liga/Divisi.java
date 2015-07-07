package liga;

import java.util.ArrayList;

/**
 * Created by Vinta on 6/25/2015.
 */
public class Divisi{
    private String namaDivisi;

    ArrayList<String> DaftarKlubDivisi = new ArrayList<String>();

    public Divisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }


    public ArrayList<String> getDaftarKlubDivisi() {
        return DaftarKlubDivisi;
    }

    //nomor 1
    public void setDaftarKlubDivisi(Klub a) {
        String namaklub = a.getNamaKlub();
        DaftarKlubDivisi.add(namaklub);
    }


    @Override
    public String toString() {
        return
                "Nama Divisi='" + namaDivisi + '\'' +
                ", Daftar Klub Divisi=" + DaftarKlubDivisi +
                '}';
    }
}
