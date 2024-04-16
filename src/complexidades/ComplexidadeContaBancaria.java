package complexidades;

public class ComplexidadeContaBancaria {

    public static  boolean checaSeTemSaldo(ContaBancaria conta, int saldo){
        if (conta instanceof ContaCorrente){
            return ((ContaCorrente) conta).temSaldoSuficienteParaDebitar(saldo);
        }
        if(conta instanceof ContaPoupanca){
            return ((ContaPoupanca) conta).temSaldoSuficienteParaDebitar(saldo);
        }

        return false;
    }
}
