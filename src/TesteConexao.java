// Classe TesteConexao
public class TesteConexao {
    // Método main
    public static void main(String[] args) {
        // Aqui estamos criando uma instância da classe Conexao usando o recurso try-with-resources.
        // O try-with-resources garante que a instância de Conexao será fechada automaticamente após a conclusão do bloco try,
        // independentemente se ocorreu uma exceção ou não.
        try (Conexao conexao = new Conexao()) {
            // Chamando o método leDados() na instância de Conexao
            conexao.leDados();
        } catch (IllegalStateException ex) {
            // Bloco catch para capturar a exceção IllegalStateException, caso ocorra
            System.out.println("Deu Erro na conexão");
            // O bloco catch permite que você faça algum tratamento específico para a exceção capturada.
            // Neste caso, estamos apenas imprimindo uma mensagem informando que ocorreu um erro na conexão.
        }
    }
}