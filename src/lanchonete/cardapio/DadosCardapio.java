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

        if (filtro.cod_cardapio > 0) {
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
     * Método que atualiza o cardápio do banco de acordo com as informações introduzidas na tela.
     * @param c
     * @param cod_cardapio
     * @throws SQLException
     * @throws Exception 
     */
    public void atualizarCardapio(Cardapio c, int cod_cardapio) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "UPDATE cardapiododia SET nome_cardapio = ?, valor_cardapio = ? WHERE cod_cardapio = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, c.getNome_cardapio());
        preparedStatement.setDouble(2, c.getValor_cardapio());
        preparedStatement.setInt(3, cod_cardapio);
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
    
    /*
    Cria os campos para a tabela cardápio do dia.
    */ 
    public void criarCardapio() throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "INSERT INTO  CardapioDoDia (nome_cardapio, valor_cardapio) VALUES ((?), (?)); ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, "Entre aqui com a descrição");
        preparedStatement.setDouble(2, '0');
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
    

}
