// Classe FluxoComError
public class FluxoComError {

    // M�todo main
    public static void main(String[] args) {
        System.out.println("Ini do main");

        try {
            // Chamada do m�todo metodo1() dentro de um bloco try-catch
            metodo1();
        } catch (ArithmeticException | NullPointerException ex) {
            // O bloco catch captura exce��es do tipo ArithmeticException ou NullPointerException
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }

        System.out.println("Fim do main");
    }

    // M�todo metodo1
    private static void metodo1() {
        System.out.println("Ini do metodo1");

        // Chamada do m�todo metodo2() dentro do m�todo metodo1()
        metodo2();

        System.out.println("Fim do metodo1");
    }

    // M�todo metodo2
    private static void metodo2() {
        System.out.println("Chamando metodo2");

        // Recurs�o: chamada do pr�prio m�todo metodo2() dentro do m�todo metodo2()
        metodo2();

        System.out.println("Fim do metodo2");
    }
}

