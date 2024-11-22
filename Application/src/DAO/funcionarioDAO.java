package DAO;
import DTO.funcionario;
import java.sql.*;
import javax.swing.JOptionPane;

public class funcionarioDAO {
    Connection con;
    PreparedStatement pstm;
    
    public void cadastro(funcionario fun) {
        String sql = "INSERT INTO funcionario(nome, ctps, telefone) VALUES (?, ?, ?)";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);

            pstm.setString(1, fun.getFuncionario_nome());
            pstm.setString(2, fun.getFuncionario_ctps());
            pstm.setString(3, fun.getFuncionario_tel());

            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
        }
        catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de cadastro!\nErro: " + erro);
        }
    }
}
