package DTO;

public class servico {
    int servico_id;
    String desc;
    String duracao;
    Double valor;

    public int getServico_id() {
        return servico_id;
    }

    public void setServico_id(int servico_id) {
        this.servico_id = servico_id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}