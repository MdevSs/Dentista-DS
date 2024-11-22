package DTO;

public class atendimento {
    int atendimento_id;
    int cliente_id;
    int dentista_id;
    int servico_id;
    String data; //Data + horario

    public int getAtendimento_id() {
        return atendimento_id;
    }

    public void setAtendimento_id(int atendimento_id) {
        this.atendimento_id = atendimento_id;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getDentista_id() {
        return dentista_id;
    }

    public void setDentista_id(int dentista_id) {
        this.dentista_id = dentista_id;
    }

    public int getServico_id() {
        return servico_id;
    }

    public void setServico_id(int servico_id) {
        this.servico_id = servico_id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
