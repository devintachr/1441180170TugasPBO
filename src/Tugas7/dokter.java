package Tugas7;

/**
 * Created by Vinta on 6/12/2015.
 */
public class dokter {
    private String namaDokter;
    private String alamatDokter;
    private String tempatPraktik;
    private String statusDokter;

    public dokter(String namaDokter, String alamatDokter, String tempatPraktik) {
        this.namaDokter = namaDokter;
        this.alamatDokter = alamatDokter;
        this.tempatPraktik = tempatPraktik;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public String getAlamatDokter() {
        return alamatDokter;
    }

    public void setAlamatDokter(String alamatDokter) {
        this.alamatDokter = alamatDokter;
    }

    public String getTempatPraktik() {
        return tempatPraktik;
    }

    public void setTempatPraktik(String tempatPraktik) {
        this.tempatPraktik = tempatPraktik;
    }

    public String getStatusDokter() {
        return statusDokter;
    }

    public void setStatusDokter(String statusDokter) {
        this.statusDokter = statusDokter;
    }

    @Override
    public String toString() {
        return "Data dokter adalah :" +
                "namaDokter='" + namaDokter + '\'' +
                ", alamatDokter='" + alamatDokter + '\'' +
                ", tempatPraktik='" + tempatPraktik + '\'' +
                ", statusDokter='" + statusDokter + '\'' +
                '}';
    }
}
