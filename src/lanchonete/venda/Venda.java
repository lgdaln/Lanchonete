package lanchonete.venda;

import lanchonete.produto.Produto;

public class Venda {

    private int qtde_venda;
    private double total_venda;

    Produto p = new Produto();

    public double CalcularTotalPedido() {
        double total = p.getValor() * qtde_venda;
        return total;
    }

    public int getQtde_venda() {
        return qtde_venda;
    }

    public void setQtde_venda(int qtde_venda) {
        this.qtde_venda = qtde_venda;
    }

    public double getTotal_venda() {
        return total_venda;
    }

    public void setTotal_venda(double total_venda) {
        this.total_venda = total_venda;
    }

}
