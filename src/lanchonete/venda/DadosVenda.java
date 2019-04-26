
package lanchonete.venda;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import lanchonete.ConexaoBanco;
import lanchonete.pedido.Pedido;
import lanchonete.produto.Produto;


public class DadosVenda extends ConexaoBanco {
    public ArrayList<Pedido> listar(Pedido filtro) throws Exception {
        ArrayList<Pedido> retorno = new ArrayList<>();

        //instrução sql listando pedidos
        String sql = " select p.cod_pedido, p.data_pedido, p.descricao_pedido, p.hora_pedido, p.obs_pedido, p.status_pedido";
        sql += " from pedido as p ";
        sql += " where p.cod_pedido > 0 ";
        if (filtro.getCod() > 0) {
            sql += " and p.cod_pedido = ? ";
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
            Pedido p = new Pedido();
            p.setCod(leitor.getInt("cod_pedido"));
            p.setData(leitor.getString("data_pedido"));
            p.setDescricao(leitor.getString("descricao_pedido"));
            p.setHora(leitor.getString("hora_pedido"));
            p.setObs(leitor.getString("obs_pedido"));
            p.setStatus(leitor.getString("status_pedido"));
            retorno.add(p);
        }
        //fechando a conexão com o banco de dados
        super.desconectar();
        return retorno;
    }
    
        public ArrayList<Produto> listar(Produto filtro) throws Exception {
        ArrayList<Produto> retorno = new ArrayList<>();

        //instrução sql listando produto
        String sql = " select p.cod_produto, p.descricao_produto, p.valor_produto, p.nome_produto ";
        sql += " from produto as p ";
        sql += " where p.cod_produto > 0 ";
        if (filtro.getCod() > 0) {
            sql += " and p.cod_produto = ? ";
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
            Produto p = new Produto();
            p.setCod(leitor.getInt("cod_produto"));
            p.setDescricao(leitor.getString("descricao_produto"));
            p.setValor(leitor.getDouble("valor_produto"));
            p.setNome(leitor.getString("nome_produto"));
            retorno.add(p);
        }
        //fechando a conexão com o banco de dados
        super.desconectar();
        return retorno;
    }
}
