package DTO;

public class dentista {
    int dentista_id;
    int especialidade_id;
    String nome;
    String cro;
    String tel;

    public int getDentista_id() {
        return dentista_id;
    }

    public void setDentista_id(int dentista_id) {
        this.dentista_id = dentista_id;
    }

    public int getEspecialidade_id() {
        return especialidade_id;
    }

    public void setEspecialidade_id(int especialidade_id) {
        this.especialidade_id = especialidade_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
}
