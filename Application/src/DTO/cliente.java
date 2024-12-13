package DTO;

public class cliente {
    int cliente_id;
    String cliente_nome;
    String cliente_cpf;
    String cliente_email;
    String cliente_numero;
    String cliente_rua;
    String cliente_bairro;
    String cliente_cidade;
    String cliente_estado;
    
    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getNome() {
        return cliente_nome;
    }

    public void setNome(String cliente_nome) {
        this.cliente_nome = cliente_nome;
    }

    public String getCpf() {
        return cliente_cpf;
    }

    public void setCpf(String cliente_cpf) {
        this.cliente_cpf = cliente_cpf;
    }

    public String getEmail() {
        return cliente_email;
    }

    public void setEmail(String cliente_email) {
        this.cliente_email = cliente_email;
    }

    public String getNumero() {
        return cliente_numero;
    }

    public void setNumero(String cliente_numero) {
        this.cliente_numero = cliente_numero;
    }

    public String getRua() {
        return cliente_rua;
    }

    public void setRua(String cliente_rua) {
        this.cliente_rua = cliente_rua;
    }

    public String getBairro() {
        return cliente_bairro;
    }

    public void setBairro(String cliente_bairro) {
        this.cliente_bairro = cliente_bairro;
    }

    public String getCidade() {
        return cliente_cidade;
    }

    public void setCidade(String cliente_cidade) {
        this.cliente_cidade = cliente_cidade;
    }

    public String getEstado() {
        return cliente_estado;
    }

    public void setEstado(String cliente_estado) {
        this.cliente_estado = cliente_estado;
    }
}