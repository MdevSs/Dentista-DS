package DAO;
import DTO.servico;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author leand
 */
public class servicoDAO {
    Connection con;
    PreparedStatement pstm;
    
    public void cadastro(servico ser) {
        String sql = "INSERT INTO servico(descricao, duracao, valor) VALUES (?, ?, ?)";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);

            pstm.setString(1, ser.getServico_desc());
            pstm.setString(2, ser.getServico_duracao());
            pstm.setString(3, Double.toString(ser.getServico_valor()));

            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Serviço cadastrado com sucesso!");
        }
        catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de cadastro!\nErro: " + erro);
        }
    }
}
