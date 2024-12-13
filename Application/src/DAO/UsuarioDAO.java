package DAO;
import DTO.*;
import java.sql.*;
import javax.swing.JOptionPane;

/*Juan Ramon | Leandro Henrique*/

public class UsuarioDAO {
    Connection con;
    PreparedStatement pstm;
    
    public boolean cadastro(usuario user) {
        String sql = "INSERT INTO usuario(nome, senha) VALUES(?, ?)";
        con = new ConexaoDAO().conectaBD();
        
        try {
            pstm = con.prepareStatement(sql);
            
            pstm.setString(1, user.getNome());
            pstm.setString(2, user.getSenha());
            
            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
            return true;
        }
        catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro para buscar os dados do metodo cadastrar! Erro: \n" + erro);
            return false;
        }
        
    }
    
    public ResultSet login(usuario user) {
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