package DTO;

public class especialidade {
    int especialidade_id;
    String especialidade_nome;
    String especialidade_desc;

    public int getEspecialidade_id() {
        return especialidade_id;
    }

    public void setEspecialidade_id(int especialidade_id) {
        this.especialidade_id = especialidade_id;
    }

    public String getNome() {
        return especialidade_nome;
    }

    public void setNome(String especialidade_nome) {
        this.especialidade_nome = especialidade_nome;
    }

    public String getDesc() {
        return especialidade_desc;
    }

    public void setDesc(String especialidade_desc) {
        this.especialidade_desc = especialidade_desc;
    }
}
