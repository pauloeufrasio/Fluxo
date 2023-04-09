public class fluxo {

    public static void main(String[] args) {
        //Fluxo de execução
        System.out.println("Ini do main");
        // Exceção implementada
        try {
            metodo1();
            // capturar ArithmeticException ou NullPointerException ou MinhasExcecao
        } catch (ArithmeticException | NullPointerException | MinhasExcecao ex) { // Lançando 2 exceções
            // Atribuindo mensagem da exceção por chamada getMessage()
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }
    // Depois do metodo1 ele executa o metodo 2

    // metodo checked quando sao verificados pelo compilador
    private static void metodo1() throws MinhasExcecao{
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
    // executando metodo2 agora ele retora pro metodo 1 e printa o fim do main de cada metodo

    private static void metodo2() throws MinhasExcecao {
        System.out.println("Ini do metodo2");
        throw new MinhasExcecao("Deu muito errado");
    }

}
