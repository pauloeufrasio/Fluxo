// Classe TestaContaComExcecaoChecked
public class TestaContaComExcecaoChecked {
    public static void main(String[] args) {

        // Criando uma instância da classe Conta
        Conta c = new Conta();

        try {
            // Tentando chamar o método deposita() da instância da classe Conta
            c.deposita();
        } catch (MinhasExcecao ex) {
            // Bloco catch para capturar a exceção MinhasExcecao que é uma exceção checked (obriga tratamento)
            System.out.println("Tratamento.....");
        }
    }
}
