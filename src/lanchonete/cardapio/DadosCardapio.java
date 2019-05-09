package lanchonete.cardapio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lanchonete.ConexaoBanco;

public class DadosCardapio extends ConexaoBanco {

    /**
     * Método que busca no banco o cardápio do dia.
     * @param filtro
     * @return
     * @throws Exception 
     */
    public ArrayList<Cardapio> ListarCardapio(Cardapio filtro) throws Exception {
        ArrayList<Cardapio> retorno = new ArrayList<>();

        //instrução sql listando o cardápio do dia
        String sql = " select cod_cardapio, nome_cardapio, valor_cardapio";
        sql += " from cardapiododia as c ";
        sql += " where c.cod_cardapio > 0 ";
        if (filtro.getCod_cardapio() > 0) {
            sql += " and c.cod_cardapio = ? ";
        }
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);

        if (filtro.getCod_cardapio() > 0) {
            preparedStatement.setInt(1, filtro.getCod_cardapio());
        }
        //executando a instrução sql
        ResultSet leitor = preparedStatement.executeQuery();
        //lendo os resultados
        while (leitor.next()) {
            Cardapio c = new Cardapio();
            c.setNome_cardapio(leitor.getString("nome_cardapio"));
            c.setValor_cardapio(leitor.getDouble("valor_cardapio"));

            retorno.add(c);
        }
        //fechando a conexão com o banco de dados
        super.desconectar();
        return retorno;
    }

    
    /**
     * Inseri ou atualiza os dados da tela no banco de dados.
     * @param c
     * @throws SQLException
     * @throws Exception 
     */ 
    public void inseriAtualizaCardapio(Cardapio c) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "INSERT INTO cardapiododia (cod_cardapio, nome_cardapio, valor_cardapio) VALUES((?), (?), (?)) ON DUPLICATE KEY UPDATE  nome_cardapio = (?), valor_cardapio=(?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, c.getCod_cardapio());
        preparedStatement.setString(2, c.getNome_cardapio());
        preparedStatement.setDouble(3, c.getValor_cardapio());
        preparedStatement.setString(4, c.getNome_cardapio());
        preparedStatement.setDouble(5, c.getValor_cardapio());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
    

}
