package tes17Juni;

/**
 * Created by Vinta on 6/18/2015.
 */
public class account {
    private double saldo;
    private double tarik;
    private double setor;

    public account(double saldo) {
        this.saldo = saldo;
    }


    public void tarik(double tarik){
       tarik =tarik;
    
    }
    public void setor(double setor){
        saldo = saldo + setor;

    }


    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public double getTarik() {
        return tarik;
    }
    public void setTarik(double tarik) {
        this.tarik = tarik;
        saldo = saldo - tarik;
    }


    public double getSetor() {
        return setor;
    }

    public void setSetor(double setor) {
        this.setor = setor;
        saldo = saldo + setor;
    }


    @Override
    public String toString() {
        return "account{" +
                "saldo=" + saldo +
                '}';
    }


}
