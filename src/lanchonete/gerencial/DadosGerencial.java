
package lanchonete.gerencial;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import lanchonete.ConexaoBanco;
import lanchonete.pedido.Pedido;


public class DadosGerencial extends ConexaoBanco{
    
    public double valorTotalEntreduasDatas() throws SQLException, Exception {
        double ultimo = 0;
        Gerencial gerencial = new Gerencial();
        try {
            String sql = "SELECT SUM(valor_venda) FROM venda WHERE cod_venda >= '2' AND cod_venda <= '3'";
            //preparando a instrução
            PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);

            //passando os valores para os parametros
            //preparedStatement.setDate(1, (java.sql.Date) i.getDataInicial());
            //preparedStatement.setDate(2, (java.sql.Date) i.getDataFinal());

            ResultSet leitor = preparedStatement.executeQuery();

            while (leitor.next()) {
                ultimo = leitor.getDouble("SUM(valor_venda)");
            }

            return ultimo;

        } catch (Exception e) {
            e.printStackTrace();
            return 200;
        } finally {
            super.desconectar();

        }

    }
    
    
        public double valorTotalFechamentoDoDia() throws SQLException, Exception {
        double ultimo = 0;
        Gerencial gerencial = new Gerencial();
        try {
            String sql = "SELECT  SUM(valor_venda)  FROM venda INNER JOIN pedido ON venda.fk_cod_pedido = pedido.cod_pedido WHERE pedido.data_pedido = (?)";
            //preparando a instrução
            PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);

            //passando os valores para os parametros
            preparedStatement.setDate(1, (java.sql.Date) gerencial.getPedido().getData());
            //preparedStatement.setDate(2, (java.sql.Date) i.getDataFinal());

            ResultSet leitor = preparedStatement.executeQuery();

            while (leitor.next()) {
                ultimo = leitor.getDouble("SUM(valor_venda)");
            }

            return ultimo;

        } catch (Exception e) {
            e.printStackTrace();
            return 200;
        } finally {
            super.desconectar();

        }

    }
    
}
