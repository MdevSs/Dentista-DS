package DTO;

public class dentista {
    int dentista_id;
    String especialidade_id; //FK
    String dentista_nome;
    String dentista_cro;
    String dentista_tel;

    public int getDentista_id() {
        return dentista_id;
    }

    public void setDentista_id(int dentista_id) {
        this.dentista_id = dentista_id;
    }

    public String getEspecialidade_id() {
        return especialidade_id;
    }

    public void setEspecialidade_id(String especialidade_id) {
        this.especialidade_id = especialidade_id;
    }

    public String getNome() {
        return dentista_nome;
    }

    public void setNome(String dentista_nome) {
        this.dentista_nome = dentista_nome;
    }

    public String getCro() {
        return dentista_cro;
    }

    public void setCro(String dentista_cro) {
        this.dentista_cro = dentista_cro;
    }

    public String getTel() {
        return dentista_tel;
    }

    public void setTel(String dentista_tel) {
        this.dentista_tel = dentista_tel;
    }
}
