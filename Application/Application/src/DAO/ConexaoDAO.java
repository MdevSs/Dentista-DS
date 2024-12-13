package DAO;
import java.sql.*;
import javax.swing.*;

/*Juan Ramon | Leandro Henrique*/

public class ConexaoDAO {

    public Connection conectaBD() {
        Connection con = null;

        try {
            String url = "jdbc:mysql://localhost/.dentist";
            String user = "root";
            String senha = "";
            con = DriverManager.getConnection(url, user, senha);
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        
        return con;
    }
}