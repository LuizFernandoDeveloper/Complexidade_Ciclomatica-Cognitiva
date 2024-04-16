package complexidades;

public class ComplexidadeContaBancaria {

    public static  boolean checaSeTemSaldo(ContaBancaria conta, int saldo){
        return conta.temSaldoSuficienteParaDebitar(saldo);
    }
}
