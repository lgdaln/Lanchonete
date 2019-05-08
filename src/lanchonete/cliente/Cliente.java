package lanchonete.cliente;


public class Cliente {
    private int cod;
    private String nome;
    private int ultimo_cod;

    public int getUltimo_cod() {
        return ultimo_cod;
    }

    public void setUltimo_cod(int ultimo_cod) {
        this.ultimo_cod = ultimo_cod;
    }

    
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
