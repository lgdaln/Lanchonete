
package lanchonete.atendente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lanchonete.ConexaoBanco;
import lanchonete.pedido.Pedido;


public class DadosAtendente extends ConexaoBanco{
    
    
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
    

        

}