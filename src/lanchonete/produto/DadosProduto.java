
package lanchonete.produto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lanchonete.ConexaoBanco;
import lanchonete.tipo.Tipo;


public class DadosProduto extends ConexaoBanco{
    public void cadastrarProduto(Produto p) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "INSERT INTO produto (valor_produto, nome_produto, descricao_produto) ";
        sql += " VALUES (?,?,?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setDouble(1, p.getValor());
        preparedStatement.setString(2, p.getNome());
        preparedStatement.setString(3, p.getDescricao());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }

    
    public void removerProduto(int p) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "DELETE FROM produto WHERE cod_produto = ? ";
        

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, p);
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }


    public void atualizarAluno(Produto p) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "UPDATE atendente SET nome_produto, descricao_produto, valor_produto = ?, ?, ? WHERE cod_atendente = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, p.getNome());
        preparedStatement.setString(2, p.getDescricao());
        preparedStatement.setDouble(3, p.getValor());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }

    public ArrayList<Tipo> listar(Tipo filtro) throws Exception {
        ArrayList<Tipo> retorno = new ArrayList<>();

        //instrução sql listando tipo
        String sql = " select t.cod_tipo, t.descricao_tipo ";
        sql += " from tipo as t ";
        sql += " where t.cod_tipo > 0 ";
        if (filtro.getCod() > 0) {
            sql += " and t.cod_tipo = ? ";
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
            Tipo t = new Tipo();
            t.setCod(leitor.getInt("cod_tipo"));
            t.setDescricao(leitor.getString("descricao_tipo"));
            retorno.add(t);
        }
        //fechando a conexão com o banco de dados
        super.desconectar();
        return retorno;
    }
}
