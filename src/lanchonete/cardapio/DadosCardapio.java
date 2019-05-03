
package lanchonete.cardapio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lanchonete.ConexaoBanco;
import lanchonete.atendente.Atendente;
import lanchonete.pedido.Pedido;

public class DadosCardapio extends ConexaoBanco{
    
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
    
}
