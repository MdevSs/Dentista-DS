
package DAO;
import DTO.especialidade;
import java.sql.*;
import javax.swing.JOptionPane;

public class especialidadeDAO {
    Connection con;
    PreparedStatement pstm;
    
    public void cadastro(especialidade esp) {
        // ESTAVA COM PREGUIÇA, FALTA ARRUMAR AQUI, O JUAN VAI ACHAR E ME OLHAR COM CARA DE BUNDA?! SIM MAS FDS
        String sql = "INSERT INTO especialidade(nome, descricao) VALUES (?, ?)";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);

            pstm.setString(1, esp.getEspecialidade_nome());
            pstm.setString(2, esp.getEspecialidade_desc());

            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Especialidade cadastrado com sucesso!");
        }
        catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de cadastro!\nErro: " + erro);
        }
    }
}
