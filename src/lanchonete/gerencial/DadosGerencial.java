package lanchonete.gerencial;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import lanchonete.ConexaoBanco;
import lanchonete.pedido.Pedido;

public class DadosGerencial extends ConexaoBanco {

    /**
     * Retorna do banco a soma de valores para uma data especificada.
     * @param d
     * @return
     * @throws SQLException
     * @throws Exception 
     */
    public double valorTotalFechamentoDoDia(Date d) throws SQLException, Exception {
        double ultimo = 0;
        Gerencial gerencial = new Gerencial();
        Pedido p = new Pedido();

        try {
            String sql = "SELECT  SUM(valor_venda)  FROM venda INNER JOIN pedido ON venda.fk_cod_pedido = pedido.cod_pedido WHERE pedido.data_pedido = (?)";
            //preparando a instrução
            PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);

            //passando os valores para os parametros
            preparedStatement.setDate(1, (java.sql.Date) d);
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
