package DAO;
import java.sql.*;
import javax.swing.*;

/*Juan Ramon | Leandro Henrique*/

public class ConexaoDAO {

    public Connection conectaBD() {
        Connection con = null;

        try {
            String url = "jdbc:mysql://localhost/.dentista";
            String user = "root";
            String senha = "";
            con = DriverManager.getConnection(url, user, senha);
        }
        catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados!\nErro: " + erro);
        }
        
        return con;
    }
}