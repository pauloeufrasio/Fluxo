public class TesteConexao {

    public static void main(String[] args) {
        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu Erro na conexão");
            {

                //-----------------------------------------------------------------------

//        Conexao con = null;
//
//        try {
//            con = new Conexao();
//            con.leDados();
//        } catch (IllegalStateException ex) {
//            System.out.println("Deu erro na conexão");
//            // finally, um bloco opcional que podemos colocar no final e que sempre será executado, com ou sem erro.
//        } finally {
//            con.fecha();
//
//        }

            }
        }
    }
}
