package tes;

/**
 * Created by Vinta on 6/11/2015.
 */
public class penulis {
    private String namaPenulis;
    private String alamatPenulis;
    private String statusPenulis;
    private char jenisKelaminPenulis;
    private int umurPenulis;

    public penulis(String namaPenulis, String alamatPenulis, char jenisKelaminPenulis) {
        this.namaPenulis = namaPenulis;
        this.alamatPenulis = alamatPenulis;
        this.jenisKelaminPenulis = jenisKelaminPenulis;
    }

    public penulis(String namaPenulis, String alamatPenulis, String statusPenulis, char jenisKelaminPenulis, int umurPenulis) {
        this.namaPenulis = namaPenulis;
        this.alamatPenulis = alamatPenulis;
        this.statusPenulis = statusPenulis;
        this.jenisKelaminPenulis = jenisKelaminPenulis;
        this.umurPenulis = umurPenulis;
    }

    public String getNamaPenulis() {
        return namaPenulis;
    }

    public void setNamaPenulis(String namaPenulis) {
        this.namaPenulis = namaPenulis;
    }

    public String getAlamatPenulis() {
        return alamatPenulis;
    }

    public void setAlamatPenulis(String alamatPenulis) {
        this.alamatPenulis = alamatPenulis;
    }

    public String getStatusPenulis() {
        return statusPenulis;
    }

    public void setStatusPenulis(String statusPenulis) {
        this.statusPenulis = statusPenulis;
    }

    public char getJenisKelaminPenulis() {
        return jenisKelaminPenulis;
    }

    public void setJenisKelaminPenulis(char jenisKelaminPenulis) {
        this.jenisKelaminPenulis = jenisKelaminPenulis;
    }

    public int getUmurPenulis() {
        return umurPenulis;
    }

    public void setUmurPenulis(int umurPenulis) {
        this.umurPenulis = umurPenulis;
    }

    @Override
    public String toString() {
        return "penulis{" +
                "namaPenulis='" + namaPenulis + '\'' +
                ", alamatPenulis='" + alamatPenulis + '\'' +
                ", statusPenulis='" + statusPenulis + '\'' +
                ", jenisKelaminPenulis=" + jenisKelaminPenulis +
                ", umurPenulis=" + umurPenulis +
                '}';
    }
}
