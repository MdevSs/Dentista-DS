package DAO;
import DTO.cliente;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class clienteDAO {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<cliente> lista = new ArrayList<>();
    
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
            JOptionPane.showMessageDialog(null, "Erro de cadastro!\nErro: " + erro.getMessage());
        }
    }
    
    public ArrayList<cliente> CarregaCliente(){
        con = new ConexaoDAO().conectaBD();
        
        String sql = "SELECT * FROM cliente";
        
        try {
        
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                cliente cli = new cliente();
                cli.setCliente_id(rs.getInt("cliente_id"));
                cli.setCliente_nome(rs.getString("nome"));
                cli.setCliente_cpf(rs.getString("cpf"));
                cli.setCliente_email(rs.getString("email"));
                cli.setCliente_numero(rs.getString("numero"));
                cli.setCliente_rua(rs.getString("rua"));
                cli.setCliente_bairro(rs.getString("bairro"));
                cli.setCliente_cidade(rs.getString("cidade"));
                cli.setCliente_estado(rs.getString("estado"));
                
                lista.add(cli);
            }
            
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros de cliente: "+ e);
        }
        
        return lista;
    }
}