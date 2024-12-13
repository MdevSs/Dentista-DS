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

    public String getNome() {
        return atendente_nome;
    }

    public void setNome(String atendente_nome) {
        this.atendente_nome = atendente_nome;
    }

    public String getCtps() {
        return atendente_ctps;
    }

    public void setCtps(String atendente_ctps) {
        this.atendente_ctps = atendente_ctps;
    }

    public String getTelefone() {
        return atendente_tel;
    }

    public void setTelefone(String atendente_tel) {
        this.atendente_tel = atendente_tel;
    }
}
