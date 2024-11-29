package DAO;
import DTO.atendimento;
import java.sql.*;
import javax.swing.JOptionPane;

public class atendimentoDAO {
    Connection con;
    PreparedStatement pstm;
    
    public void cadastro(atendimento ate) {
        String sql = "INSERT INTO atendimento(dentista_id, cliente_id, servico_id, funcionario_id) VALUES ((SELECT dentista_id FROM dentista WHERE nome = ?), (SELECT servico_id FROM servico WHERE descricao =  ?),(SELECT cliente_id FROM cliente WHERE nome =  ?), (SELECT funcionario_id FROM funcionario WHERE nome =  ?))";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);

            pstm.setString(1, Integer.toString(ate.getCliente_id()));
            pstm.setString(2, Integer.toString(ate.getDentista_id()));
            pstm.setString(3, Integer.toString(ate.getServico_id()));
            pstm.setString(4, Integer.toString(ate.getFuncionario_id()));

            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Atendimento cadastrado com sucesso!");
        }
        catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de cadastro!\nErro: " + erro);
        }
    }
}
