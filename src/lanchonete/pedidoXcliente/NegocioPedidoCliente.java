
package lanchonete.pedidoXcliente;

import lanchonete.cliente.Cliente;


public class NegocioPedidoCliente {
    
        public int  validarNomeCliente(Cliente c) throws Exception {
         if ("Luiz".equals(c.getNome())) {
            throw new Exception("Informar o nome do aluno");

        }
        int certo = 1;
        return certo;

        
    }
    
}
