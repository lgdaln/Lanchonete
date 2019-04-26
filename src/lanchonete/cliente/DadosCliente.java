
package lanchonete.cliente;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import lanchonete.ConexaoBanco;


public class DadosCliente extends ConexaoBanco {
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

    
    public void removerCliente(Cliente c) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "DELETE FROM cliente WHERE cod_cliente = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, c.getCod());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }


    public void atualizarCliente(Cliente c) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "UPDATE cliente SET nome = ? WHERE cod_cliente = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, c.getNome());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
}
