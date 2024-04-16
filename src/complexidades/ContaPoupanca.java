package complexidades;

public class ContaPoupanca  extends ContaBancaria{


    public ContaPoupanca(int saldo) {
        super(saldo);
    }

    public boolean temSaldoSuficienteParaDebitar(int saldoAdebitar){
        if (saldo >= saldoAdebitar){
            return  true;
        }

        return  false;
    }
}
