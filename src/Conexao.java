public class Conexao implements AutoCloseable {

    // Construtor da classe Conexao
    public Conexao() {
        System.out.println("Abrindo conexao"); // Imprime uma mensagem informando que a conex�o est� sendo aberta.
        //throw new IllegalStateException(); // Se descomentado, lan�aria uma exce��o IllegalStateException ao abrir a conex�o.
    }

    // M�todo leDados()
    public void leDados() {
        System.out.println("Recebendo dados"); // Imprime uma mensagem informando que est� recebendo dados.
        throw new IllegalStateException(); // Lan�a uma exce��o IllegalStateException durante o recebimento de dados.
    }

    // M�todo close() da interface AutoCloseable
    @Override
    public void close() {
        System.out.println("Fechando conexao"); // Imprime uma mensagem informando que a conex�o est� sendo fechada.
    }
}
