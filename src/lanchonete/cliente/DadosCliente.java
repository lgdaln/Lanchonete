package lanchonete.cliente;

import java.sql.PreparedStatement;
import lanchonete.ConexaoBanco;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DadosCliente extends ConexaoBanco {
    
    
    /**
     * Cadastra um novo cliente com base no nome informado na tela FazerPedido
     * @param c
     * @throws SQLException
     * @throws Exception 
     */
    public void cadastrarCliente(Cliente c) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "INSERT INTO cliente (nome_cliente)";
        sql += " VALUES (?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, c.getNome());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
    

    /**
     * Retorna o codigo/ID do último cliente que entrou na tabela cliente.
     * @return
     * @throws SQLException
     * @throws Exception 
     */
    public int retornaIdCliente() throws SQLException, Exception {
        int ultimo = 0;
        try {
            String sql = "select max(cod_cliente) from cliente";
            PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
            ResultSet leitor = preparedStatement.executeQuery();

            while (leitor.next()) {
                ultimo = leitor.getInt("max(cod_cliente)");
            }

            return ultimo;

        } catch (Exception e) {
            e.printStackTrace();
            return 200;
        } finally {
            super.desconectar();

        }

    }
    
    
}
