package Tugas7;

/**
 * Created by Vinta on 6/12/2015.
 */
public class rumahSakit {
    private String jenisPoli;
    private String jamMasuk;
    private dokter dataDokter;

    public rumahSakit(String jenisPoli, String jamMasuk, dokter dataDokter) {
        this.jenisPoli = jenisPoli;
        this.jamMasuk = jamMasuk;
        this.dataDokter = dataDokter;
    }

    public String getJenisPoli() {
        return jenisPoli;
    }

    public void setJenisPoli(String jenisPoli) {
        this.jenisPoli = jenisPoli;
    }

    public String getJamMasuk() {
        return jamMasuk;
    }

    public void setJamMasuk(String jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    public dokter getDataDokter() {
        return dataDokter;
    }

    public void setDataDokter(dokter dataDokter) {
        this.dataDokter = dataDokter;
    }

    @Override
    public String toString() {
        return "Datanya adalah :" +
                "jenisPoli='" + jenisPoli + '\'' +
                ", jamMasuk='" + jamMasuk + '\'' +
                ", dataDokter=" + dataDokter +
                '}';
    }
}
