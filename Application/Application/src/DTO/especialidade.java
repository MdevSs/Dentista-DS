package DTO;

public class especialidade {
    int especialidade_id;
    String nome;
    String desc;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}