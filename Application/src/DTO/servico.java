package DTO;

public class servico {
    int servico_id;
    String servico_desc;
    String servico_duracao;
    float servico_valor;

    public int getServico_id() {
        return servico_id;
    }

    public void setServico_id(int servico_id) {
        this.servico_id = servico_id;
    }

    public String getDesc() {
        return servico_desc;
    }

    public void setDesc(String servico_desc) {
        this.servico_desc = servico_desc;
    }

    public String getDuracao() {
        return servico_duracao;
    }

    public void setDuracao(String servico_duracao) {
        this.servico_duracao = servico_duracao;
    }

    public float getValor() {
        return servico_valor;
    }

    public void setValor(float servico_valor) {
        this.servico_valor = servico_valor;
    }
}
