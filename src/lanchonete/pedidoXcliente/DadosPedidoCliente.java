package lanchonete.pedidoXcliente;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lanchonete.ConexaoBanco;
import lanchonete.atendente.Atendente;
import lanchonete.cliente.Cliente;
import lanchonete.pedido.Pedido;
import lanchonete.pedidoXcliente.PedidoCliente;


public class DadosPedidoCliente  extends ConexaoBanco {
    
    
    public ArrayList<PedidoCliente> getPedidoCliente() throws SQLException{
        
        ArrayList<PedidoCliente> listaPedidoCliente = new ArrayList();
        Cliente cliente = new Cliente();
        Pedido pedido = new Pedido();
        PedidoCliente pedidoCliente = new PedidoCliente();
        
        try {
            String sql = "SELECT pedido.cod_pedido, pedido.data_pedido, pedido.hora_pedido, pedido.descricao_pedido, pedido.status_pedido, pedido.obs_pedido, pedido.cod_cliente, pedido.cod_atendente, cliente.cod_cliente, cliente.nome_cliente  FROM pedido INNER JOIN cliente ON pedido.cod_cliente = cliente.cod_cliente;";

            PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
            
            ResultSet leitor = preparedStatement.executeQuery();
            
            while (leitor.next()){
                cliente = new Cliente();
                pedido = new Pedido();
                pedidoCliente = new PedidoCliente();
                
                pedido.setCod(leitor.getInt("cod_pedido"));
                
                cliente.setNome(leitor.getString("nome_cliente"));
                
                pedido.setStatus(leitor.getString("status_pedido"));

                pedidoCliente.setPedido(pedido);
                pedidoCliente.setCliente(cliente);
                pedidoCliente.setPedido(pedido);
                
                listaPedidoCliente.add(pedidoCliente);

                
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            super.desconectar();
        }
        return listaPedidoCliente;
    }
    
    
        public ArrayList<PedidoCliente> getPedidoPeloCliente(String nomeCliente) throws SQLException{
        
        ArrayList<PedidoCliente> listaPedidoCliente = new ArrayList();
        Cliente cliente = new Cliente();
        Pedido pedido = new Pedido();
        PedidoCliente pedidoCliente = new PedidoCliente();

        
        try {
            String sql = "SELECT pedido.cod_pedido, pedido.data_pedido, pedido.hora_pedido, pedido.descricao_pedido, pedido.status_pedido, pedido.obs_pedido, pedido.cod_cliente, pedido.cod_atendente, cliente.cod_cliente, cliente.nome_cliente  FROM pedido INNER JOIN cliente ON pedido.cod_cliente = cliente.cod_cliente WHERE cliente.nome_cliente = ?";

            PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
            
            preparedStatement.setString(1, nomeCliente);
            
            ResultSet leitor = preparedStatement.executeQuery();
            
            while (leitor.next()){
                cliente = new Cliente();
                pedido = new Pedido();
                pedidoCliente = new PedidoCliente();
                
                pedido.setDescricao(leitor.getString("descricao_pedido"));
                                
                pedido.setStatus(leitor.getString("status_pedido"));

                pedidoCliente.setPedido(pedido);
                pedidoCliente.setCliente(cliente);
                pedidoCliente.setPedido(pedido);
                
                listaPedidoCliente.add(pedidoCliente);

                
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            super.desconectar();
        }
        return listaPedidoCliente;
    }
    
       
    }
