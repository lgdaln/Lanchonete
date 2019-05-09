package lanchonete.cardapio;


public class Cardapio {
    
    private int cod_cardapio;
    private String nome_cardapio;
    private Double valor_cardapio;
    
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


    public void setCod_cardapio(int cod_cardapio) {
        this.cod_cardapio = cod_cardapio;
    }
    
    
    
}
