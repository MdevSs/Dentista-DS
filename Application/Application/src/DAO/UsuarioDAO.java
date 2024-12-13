package DAO;
import OO.*;
import java.sql.*;
import javax.swing.JOptionPane;

/*Juan Ramon | Leandro Henrique*/

public class UsuarioDAO {
    Connection con;
    PreparedStatement pstm;
    
    public void cadastro(User user) {
        String sql = "INSERT INTO usuarioDS(nome, email, senha) VALUES(?, ?, ?)";
        con = new ConexaoDAO().conectaBD();
        
        try {
            pstm = con.prepareStatement(sql);
            
            pstm.setString(1, user.getNome());
            pstm.setString(1, user.getEmail());
            pstm.setString(1, user.getSenha());
            
            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
        }
        catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro para buscar os dados do metodo cadastrar! Erro: \n" + erro);
        }
    }
    
    public ResultSet login(User user) {
        Connection con = new ConexaoDAO().conectaBD();
        try {
            String sql = "SELECT * FROM usuario WHERE nome = ? AND senha = ?";

            pstm = con.prepareStatement(sql);
            pstm.setString(1, user.getNome());
            pstm.setString(2, user.getSenha());
        
            ResultSet res = pstm.executeQuery();
            
            return res;
        
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Errro na autenticação"+ e.getMessage());
            
            return null;
        }
    }
    
}