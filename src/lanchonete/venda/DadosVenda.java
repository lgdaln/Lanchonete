package lanchonete.venda;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import lanchonete.ConexaoBanco;
import lanchonete.pedido.Pedido;

public class DadosVenda extends ConexaoBanco {

    /**
     * Cadastra uma nova venda/pedido na tabela vendas.
     *
     * @param p
     * @param v
     * @throws SQLException
     * @throws Exception
     */
    public void registrarVenda(Pedido p, Venda v) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "INSERT INTO venda (valor_venda, fk_cod_pedido) ";
        sql += " VALUES (?, ?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setDouble(1, v.getValor());
        preparedStatement.setInt(2, p.getCod());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }

    public void removerVenda(int v) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "DELETE FROM venda WHERE cod_venda = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, v);
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }

}
