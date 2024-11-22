package DTO;

public class funcionario {
    int atendente_id;
    String atendente_nome;
    String atendente_ctps;
    String atendente_tel;

    public int getFuncionario_id() {
        return atendente_id;
    }

    public void setFuncionario_id(int atendente_id) {
        this.atendente_id = atendente_id;
    }

    public String getFuncionario_nome() {
        return atendente_nome;
    }

    public void setFuncionario_nome(String atendente_nome) {
        this.atendente_nome = atendente_nome;
    }

    public String getFuncionario_ctps() {
        return atendente_ctps;
    }

    public void setFuncionario_ctps(String atendente_ctps) {
        this.atendente_ctps = atendente_ctps;
    }

    public String getFuncionario_tel() {
        return atendente_tel;
    }

    public void setFuncionario_tel(String atendente_tel) {
        this.atendente_tel = atendente_tel;
    }
}
