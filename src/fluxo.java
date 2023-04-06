public class fluxo {

    public static void main(String[] args) {
        //Fluxo de execução
        System.out.println("Ini do main");
        // Exceção implementada
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }
    // Depois do metodo1 ele executa o metodo 2

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
    // executando metodo2 agora ele retora pro metodo 1 e printa o fim do main de cada metodo

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            Conta c = null;
            c.deposita();
        }
        System.out.println("Fim do metodo2");
    }
}