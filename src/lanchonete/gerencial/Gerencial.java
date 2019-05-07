
package lanchonete.gerencial;

import java.util.Date;
import lanchonete.pedido.Pedido;
import lanchonete.venda.Venda;


public class Gerencial {
    
private Venda venda;
private Pedido pedido;

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }


    
    
    
}
