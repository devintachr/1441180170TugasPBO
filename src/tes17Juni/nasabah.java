package tes17Juni;

/**
 * Created by Vinta on 6/18/2015.
 */
public class nasabah {
    private String namaNasabah;
    private account rekening;

    public nasabah(String namaNasabah, account rekening) {
        this.namaNasabah = namaNasabah;
        this.rekening = rekening;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public account getRekening() {
        return rekening;
    }

    public void setRekening(account rekening) {
        this.rekening = rekening;
    }

    @Override
    public String toString() {
        return "nasabah{" +
                "namaNasabah='" + namaNasabah + '\'' +
                ", rekening=" + rekening +
                '}';
    }
}
