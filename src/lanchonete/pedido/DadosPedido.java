
package lanchonete.pedido;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lanchonete.ConexaoBanco;
import lanchonete.atendente.Atendente;
import lanchonete.cliente.Cliente;
import lanchonete.produto.Produto;


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


    public ArrayList<Pedido> listar(Pedido filtro) throws Exception {
        ArrayList<Pedido> retorno = new ArrayList<>();

        //instrução sql listando pedidos
        String sql = " select cod_pedido, data_pedido, hora_pedido, descricao_pedido, status_pedido, obs_pedido,  cod_cliente, cod_atendente";
        sql += " from Pedido as p ";
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
            Atendente a = new Atendente();
            p.setCod(leitor.getInt("cod_pedido"));
            p.setDescricao(leitor.getString("descricao_pedido"));
            /* Inserido*/
            p.setStatus(leitor.getString("status_pedido"));
            p.setCod_atendente(leitor.getInt("cod_atendente"));


            retorno.add(p);
        }
        //fechando a conexão com o banco de dados
        super.desconectar();
        return retorno;
    }
    
    
    public void removerPedido(int p) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "DELETE FROM pedido WHERE cod_pedido = ? ";
        

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, p);
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
    
        public void atualizarPedido(int p, int cod) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "UPDATE pedido SET cod_atendente = ? WHERE cod_pedido = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, p);
        preparedStatement.setInt(2, cod);
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
        
        public void atualizarStatus(String p, int cod) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "UPDATE pedido SET status_pedido = ? WHERE cod_pedido = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, p);
        preparedStatement.setInt(2, cod);
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
        
        
        public void atualizarPedidoEntregue(String p, int cod) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "UPDATE pedido SET status_pedido = ? WHERE cod_pedido = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, p);
        preparedStatement.setInt(2, cod);
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
        
        
        public void cadastrarPedido(Pedido p) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "INSERT INTO pedido (descricao_pedido, cod_cliente, data_pedido) ";
        sql += " VALUES (?, ?, ?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, p.getDescricao());
        preparedStatement.setInt(2, p.getCod_cliente());
        preparedStatement.setDate(3, (Date) p.getData());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
        
            /**
     * Retorna o codigo/ID do último pedido que entrou na tabela pedido.
     * @return
     * @throws SQLException
     * @throws Exception 
     */
    public int retornaIdPedido() throws SQLException, Exception {
        int ultimo = 0;
        try {
            String sql = "select max(cod_pedido) from pedido";
            PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
            ResultSet leitor = preparedStatement.executeQuery();

            while (leitor.next()) {
                ultimo = leitor.getInt("max(cod_pedido)");
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
       
     
