public class fluxo {

    public static void main(String[] args) {
        //"Ini do main", acessaremos o metodo1() através da chamada; //"Ini do main", acessaremos o metodo1() através da chamada;
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }
    // "Ini do metodo1", acessaremos o metodo2();
    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
    // Ini do metodo2", na sequência, será executado um laço no qual a variável i começa em 1 e vai até 5. Essa mensagem será exibida até o final do laço.
    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("Fim do metodo2");
    }
}