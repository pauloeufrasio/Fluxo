
public class TesteContas {

    public static void main(String[] args) {


        //instancia para testar exceção!!!!
        ContaCorrente conta = null;
        conta.deposita(200.0);

        //instancia da conta corrente
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        //instancia da conta poupança
        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);
    }
}
