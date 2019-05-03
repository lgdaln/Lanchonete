/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete.cardapio;

/**
 *
 * @author lgdal
 */
public class Cardapio {
    
    int cod_cardapio;
    String nome_cardapio;
    Double valor_cardapio;

    public int getCod_cardapio() {
        return cod_cardapio;
    }


    public String getNome_cardapio() {
        return nome_cardapio;
    }

    public void setNome_cardapio(String nome_cardapio) {
        this.nome_cardapio = nome_cardapio;
    }

    public Double getValor_cardapio() {
        return valor_cardapio;
    }

    public void setValor_cardapio(Double valor_cardapio) {
        this.valor_cardapio = valor_cardapio;
    }
    
    
    
}
