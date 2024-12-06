package DTO;

public class atendimento {
    int atendimento_id;
    String cliente_id;
    String dentista_id;
    String servico_id;
    String funcionario_id;
    String data; //Data + horario

    public int getAtendimento_id() {
        return atendimento_id;
    }

    public void setAtendimento_id(int atendimento_id) {
        this.atendimento_id = atendimento_id;
    }

    public String getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(String cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getDentista_id() {
        return dentista_id;
    }

    public void setDentista_id(String dentista_id) {
        this.dentista_id = dentista_id;
    }

    public String getServico_id() {
        return servico_id;
    }

    public void setServico_id(String servico_id) {
        this.servico_id = servico_id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public String getFuncionario_id(){
        return funcionario_id;
    }
    
    public void setFunctionario_id(String funcionario_id) {
        this.funcionario_id = funcionario_id;
    }
}
