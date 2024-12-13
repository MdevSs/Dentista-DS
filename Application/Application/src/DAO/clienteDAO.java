package DAO;
import DTO.cliente;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class clienteDAO {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<cliente> lista = new ArrayList<>();
    
    public void cadastro(cliente cli) {
        String sql = "INSERT INTO cliente(nome, cpf, email, numero, rua, bairro, cidade, estado) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);

            pstm.setString(1, cli.getNome());
            pstm.setString(2, cli.getCpf());
            pstm.setString(3, cli.getEmail());
            pstm.setString(4, cli.getNumero());
            pstm.setString(5, cli.getRua());
            pstm.setString(6, cli.getBairro());
            pstm.setString(7, cli.getCidade());
            pstm.setString(8, cli.getEstado());  

            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Cadastro criado!");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
    
    public ArrayList<cliente> carregarDados() {
        String sql= "select * from cliente";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()) {
                cliente cli = new cliente();

                cli.setCliente_id(rs.getInt("cliente_id"));
                cli.setNome(rs.getString("nome"));
                cli.setCpf(rs.getString("cpf"));
                cli.setEmail(rs.getString("email"));
                cli.setNumero(rs.getString("numero"));
                cli.setRua(rs.getString("rua"));
                cli.setBairro(rs.getString("bairro"));
                cli.setCidade(rs.getString("cidade"));
                cli.setEstado(rs.getString("estado"));

                lista.add(cli);
           }
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro: " + e.getMessage());
        }

        return lista;
    }
    
    public void atualizaDados(cliente cli){
        String sql= "UPDATE cliente SET nome = ?, cpf = ?, email = ?, numero = ?, rua = ?, bairro = ?, cidade = ?, estado = ? WHERE cliente_id = ?";
        con = new ConexaoDAO().conectaBD();
        
        try {
            pstm = con.prepareStatement(sql);
            
            pstm.setString(1, cli.getNome());
            pstm.setString(2, cli.getCpf());
            pstm.setString(3, cli.getEmail());
            pstm.setString(4, cli.getNumero());
            pstm.setString(5, cli.getRua());
            pstm.setString(6, cli.getBairro());
            pstm.setString(7, cli.getCidade());
            pstm.setString(8, cli.getEstado());
            pstm.setInt(9, cli.getCliente_id());
            
            pstm.execute();
            pstm.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e.getMessage());
        }
    }
}