package lanchonete.pedidoXcliente;

import java.util.ArrayList;
import lanchonete.cliente.Cliente;
import lanchonete.pedido.Pedido;


public class PedidoCliente {
    
    private Pedido pedido;
    private Cliente cliente;
    private ArrayList<PedidoCliente> pedidoCliente;

    /**
     * @return the pedido
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the pedidoCliente
     */
    public ArrayList<PedidoCliente> getPedidoCliente() {
        return pedidoCliente;
    }

    /**
     * @param pedidoCliente the pedidoCliente to set
     */
    public void setPedidoCliente(ArrayList<PedidoCliente> pedidoCliente) {
        this.pedidoCliente = pedidoCliente;
    }
    
    
    
    
}
