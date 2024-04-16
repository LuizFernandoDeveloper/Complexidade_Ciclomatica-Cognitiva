package complexidades;

public  abstract class ContaBancaria {

    protected  int saldo;

    public ContaBancaria(int saldo){
        this.saldo = saldo;
    }

    public abstract boolean temSaldoSuficienteParaDebitar(int saldoADebitar);
}
