
package lanchonete.pedido;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import lanchonete.ConexaoBanco;
import lanchonete.atendente.Atendente;
import lanchonete.cliente.Cliente;


public class DadosPedido extends ConexaoBanco {
     public ArrayList<Atendente> listar(Atendente filtro) throws Exception {
        ArrayList<Atendente> retorno = new ArrayList<>();

        //instrução sql listando atendente
        String sql = " select a.cod_atendente, a.nome_atendente ";
        sql += " from atendente as a ";
        sql += " where a.cod_atendente > 0 ";
        if (filtro.getCod() > 0) {
            sql += " and a.cod_atendente = ? ";
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
     
public ArrayList<Cliente> listar(Cliente filtro) throws Exception {
        ArrayList<Cliente> retorno = new ArrayList<>();

        //instrução sql listando cliente
        String sql = " select c.cod_cliente, c.nome_cliente ";
        sql += " from cliente as c ";
        sql += " where c.cod_cliente > 0 ";
        if (filtro.getCod() > 0) {
            sql += " and c.cod_cliente = ? ";
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
            Cliente c = new Cliente();
            c.setCod(leitor.getInt("cod_cliente"));
            c.setNome(leitor.getString("nome_cliente"));
            retorno.add(c);
        }
        //fechando a conexão com o banco de dados
        super.desconectar();
        return retorno;
    }
}
       
     
