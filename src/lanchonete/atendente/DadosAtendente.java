
package lanchonete.atendente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lanchonete.ConexaoBanco;
import lanchonete.cardapio.Cardapio;
import lanchonete.pedido.Pedido;


public class DadosAtendente extends ConexaoBanco{
    
    
    /**
     * Lista os atendentes que estão no banco
     * @param filtro
     * @return
     * @throws Exception 
     */ 
    public ArrayList<Atendente> ListarAtendentes(Atendente filtro) throws Exception {
        ArrayList<Atendente> retorno = new ArrayList<>();

        //instrução sql listando atendentes
        String sql = " select cod_atendente, nome_atendente";
        sql += " from atendente as p ";
        sql += " where p.cod_atendente > 0 ";
        if (filtro.getCod() > 0) {
            sql += " and p.cod_atendente = ? ";
        }
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);

        if (filtro.getCod() > 0) {
            preparedStatement.setInt(1, filtro.getCod());
        }
        //executando a instrução sql
        ResultSet leitor = preparedStatement.executeQuery();
        //lendo os resultados
        while (leitor.next()) {
            Atendente a = new Atendente();
            a.setCod(leitor.getInt("cod_atendente"));
            a.setNome(leitor.getString("nome_atendente"));



            retorno.add(a);
        }
        //fechando a conexão com o banco de dados
        super.desconectar();
        return retorno;
    }
     
    
    /**
     * Atualiza o banco com base nas informações da tela.
     * @param c
     * @param cod_atendente
     * @throws SQLException
     * @throws Exception 
     */
    public void atualizarAtendentes(Atendente c, int cod_atendente) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "UPDATE atendente SET nome_atendente = ? WHERE cod_atendente = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, c.getNome());
        preparedStatement.setInt(2, cod_atendente);
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
    
        public void inseriAtualizaAtendentes(Atendente a) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "INSERT INTO atendente (cod_atendente, nome_atendente) VALUES((?), (?)) ON DUPLICATE KEY UPDATE  nome_atendente = (?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, a.getCod());
        preparedStatement.setString(2, a.getNome());
        preparedStatement.setString(3, a.getNome());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
    

        

}