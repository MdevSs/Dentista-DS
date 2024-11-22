
package DAO;
import DTO.dentista;
import java.sql.*;
import javax.swing.JOptionPane;

public class dentistaDAO {
    Connection con;
    PreparedStatement pstm;
    
    public void cadastro(dentista dent) {
        // ESTAVA COM PREGUIÇA, FALTA ARRUMAR AQUI, O JUAN VAI ACHAR E ME OLHAR COM CARA DE BUNDA?! SIM MAS FDS
        String sql = "INSERT INTO especialidade(nome, cro, telefone) VALUES (?, ?, ?)";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);

            pstm.setString(1, dent.getDentista_nome());
            pstm.setString(2, dent.getDentista_cro());
            pstm.setString(3, dent.getDentista_tel());
            
            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Dentista cadastrado com sucesso!");
        }
        catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de cadastro!\nErro: " + erro);
        }
    }
}
