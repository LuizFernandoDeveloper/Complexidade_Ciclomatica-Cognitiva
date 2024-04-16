package complexidades;

public class ContaCorrente extends ContaBancaria {
    private int limit;

    public ContaCorrente(int saldo, int limit) {
        super(saldo);
        this.limit = limit;
    }

    public  boolean temSaldoSuficienteParaDebitar(int saldoADebitar){
        if (saldo + limit >= saldoADebitar){
            return true;
        }
        return false;
    }



}
