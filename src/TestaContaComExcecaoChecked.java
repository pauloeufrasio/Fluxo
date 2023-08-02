// Classe TestaContaComExcecaoChecked
public class TestaContaComExcecaoChecked {
    public static void main(String[] args) {

        // Criando uma inst�ncia da classe Conta
        Conta c = new Conta();

        try {
            // Tentando chamar o m�todo deposita() da inst�ncia da classe Conta
            c.deposita();
        } catch (MinhasExcecao ex) {
            // Bloco catch para capturar a exce��o MinhasExcecao que � uma exce��o checked (obriga tratamento)
            System.out.println("Tratamento.....");
        }
    }
}
