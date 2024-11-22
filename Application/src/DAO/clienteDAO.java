package DAO;
import DTO.cliente;
import java.sql.*;
import javax.swing.JOptionPane;

public class clienteDAO {
    Connection con;
    PreparedStatement pstm;
    
    public void cadastro(cliente cli) {
        String sql = "INSERT INTO cliente(`nome`, `cpf`, `email`, `numero`, `rua`, `bairro`, `cidade`, `estado`) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);

            pstm.setString(1, cli.getCliente_nome());
            pstm.setString(2, cli.getCliente_cpf());
            pstm.setString(3, cli.getCliente_email());
            pstm.setString(4, cli.getCliente_numero());
            pstm.setString(5, cli.getCliente_rua());
            pstm.setString(6, cli.getCliente_bairro());
            pstm.setString(7, cli.getCliente_cidade());
            pstm.setString(8, cli.getCliente_estado());  

            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        }
        catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de cadastro!\nErro: " + erro);
        }
    }
}