
package lanchonete.atendente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lanchonete.ConexaoBanco;


public class DadosAtendente extends ConexaoBanco{
    public void cadastrarAluno(Atendente a) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "INSERT INTO atendente (nome) ";
        sql += " VALUES (?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, a.getNome());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }

    
    public void removerAluno(Atendente a) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "DELETE FROM atendente WHERE cod_atendente = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, a.getCod());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }


    public void atualizarAluno(Atendente a) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "UPDATE atendente SET nome = ? WHERE cod_atendente = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, a.getNome());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }

}