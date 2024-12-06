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

    public String getDentista_nome() {
        return dentista_nome;
    }

    public void setDentista_nome(String dentista_nome) {
        this.dentista_nome = dentista_nome;
    }

    public String getDentista_cro() {
        return dentista_cro;
    }

    public void setDentista_cro(String dentista_cro) {
        this.dentista_cro = dentista_cro;
    }

    public String getDentista_tel() {
        return dentista_tel;
    }

    public void setDentista_tel(String dentista_tel) {
        this.dentista_tel = dentista_tel;
    }
}
