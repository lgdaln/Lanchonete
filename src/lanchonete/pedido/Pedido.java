package lanchonete.pedido;

public class Pedido {

    private int cod;
    private String data;
    private String hora;
    private String descricao;
    private String status;
    private String obs;
    private int cod_atendente;
    private int cod_cliente;

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }


    public int getCod_atendente() {
        return cod_atendente;
    }

    public void setCod_atendente(int cod_atendente) {
        this.cod_atendente = cod_atendente;
    }


    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
