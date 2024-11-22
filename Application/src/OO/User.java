package OO;

import javax.swing.JOptionPane;

/*Juan Ramon | Leandro Henrique*/
public class User {
    private String Nome, Email, Senha;
    
    public User(String Nome, String Email, String Senha) {
        this.Nome = Nome;
        this.Email = Email;
        this.Senha = Senha;
    }

    public String getNome() {
        return Nome;
    }
    
    public String getEmail() {
        return Email;
    }
    
    public String getSenha() {
        return Senha;
    }
    
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public void setPassword(String Senha) {
        this.Senha = Senha;
    }
    
    public void exibe(){
        JOptionPane.showMessageDialog(null, " NOME: "+ this.Nome +"\n EMAIL: "+ this.Email +"\n SENHA: "+ this.Senha);
    }
}