package DAO;
import DTO.servico;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class servicoDAO {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<servico> lista = new ArrayList<>();
    
    public void cadastro(servico ser) {
        String sql = "INSERT INTO servico(descricao, duracao, valor) VALUES (?, ?, ?)";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);

            pstm.setString(1, ser.getDesc());
            pstm.setString(2, ser.getDuracao());
            pstm.setString(3, String.valueOf(ser.getValor()));

            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Cadastro criado!");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
    
    public ArrayList<servico> carregarDados() {
        String sql = "select * from servico";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()) {
                servico ser = new servico();

                ser.setServico_id(rs.getInt("servico_id"));
                ser.setDesc(rs.getString("descricao"));
                ser.setDuracao(rs.getString("duracao"));
                ser.setValor(rs.getDouble("valor"));
                
                lista.add(ser);
           }
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro: " + e.getMessage());
        }

        return lista;
    }
    
    public void atualizaDados(servico ser){
        String sql= "UPDATE servico SET descricao = ?, duracao = ?, valor = ? WHERE servico_id = ?";
        con = new ConexaoDAO().conectaBD();
        
        try {
            pstm = con.prepareStatement(sql);
            
            pstm.setString(1, ser.getDesc());
            pstm.setString(2, ser.getDuracao());
            pstm.setDouble(3, ser.getValor());
            pstm.setInt(4, ser.getServico_id());
            
            pstm.execute();
            pstm.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e.getMessage());
        }
    }
}
