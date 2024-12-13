package DTO;

public class funcionario {
    int funcionario_id;
    String nome;
    String ctps;
    String tel;

    public int getFuncionario_id() {
        return funcionario_id;
    }

    public void setFuncionario_id(int funcionario_id) {
        this.funcionario_id = funcionario_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}