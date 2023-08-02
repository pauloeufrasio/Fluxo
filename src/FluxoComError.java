// Classe FluxoComError
public class FluxoComError {

    // Método main
    public static void main(String[] args) {
        System.out.println("Ini do main");

        try {
            // Chamada do método metodo1() dentro de um bloco try-catch
            metodo1();
        } catch (ArithmeticException | NullPointerException ex) {
            // O bloco catch captura exceções do tipo ArithmeticException ou NullPointerException
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }

        System.out.println("Fim do main");
    }

    // Método metodo1
    private static void metodo1() {
        System.out.println("Ini do metodo1");

        // Chamada do método metodo2() dentro do método metodo1()
        metodo2();

        System.out.println("Fim do metodo1");
    }

    // Método metodo2
    private static void metodo2() {
        System.out.println("Chamando metodo2");

        // Recursão: chamada do próprio método metodo2() dentro do método metodo2()
        metodo2();

        System.out.println("Fim do metodo2");
    }
}

