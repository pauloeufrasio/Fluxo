public class Conexao implements AutoCloseable {

    // Construtor da classe Conexao
    public Conexao() {
        System.out.println("Abrindo conexao"); // Imprime uma mensagem informando que a conexão está sendo aberta.
        //throw new IllegalStateException(); // Se descomentado, lançaria uma exceção IllegalStateException ao abrir a conexão.
    }

    // Método leDados()
    public void leDados() {
        System.out.println("Recebendo dados"); // Imprime uma mensagem informando que está recebendo dados.
        throw new IllegalStateException(); // Lança uma exceção IllegalStateException durante o recebimento de dados.
    }

    // Método close() da interface AutoCloseable
    @Override
    public void close() {
        System.out.println("Fechando conexao"); // Imprime uma mensagem informando que a conexão está sendo fechada.
    }
}
