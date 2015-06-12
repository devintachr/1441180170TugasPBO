package tes;

/**
 * Created by Vinta on 6/11/2015.
 */
public class Buku {
    private String namaBuku;
    private Double hargaBuku;
    private String penerbitBuku;
    private String createdBy;

    public Buku(String namaBuku, Double hargaBuku, String penerbitBuku) {
        this.namaBuku = namaBuku;
        this.hargaBuku = hargaBuku;
        this.penerbitBuku = penerbitBuku;
    }

    public Buku(String namaBuku, Double hargaBuku, String penerbitBuku, String createdBy) {
        this.namaBuku = namaBuku;
        this.hargaBuku = hargaBuku;
        this.penerbitBuku = penerbitBuku;
        this.createdBy = createdBy;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public Double getHargaBuku() {
        return hargaBuku;
    }

    public void setHargaBuku(Double hargaBuku) {
        this.hargaBuku = hargaBuku;
    }

    public String getPenerbitBuku() {
        return penerbitBuku;
    }

    public void setPenerbitBuku(String penerbitBuku) {
        this.penerbitBuku = penerbitBuku;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
