package DAO;
import DTO.atendimento;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class atendimentoDAO {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<atendimento> lista = new ArrayList<>();
    
    public void cadastro(atendimento ate) {
        String sql = "INSERT INTO atendimento(dentista_id, cliente_id, servico_id, funcionario_id, data) VALUES(?, ?, ?, ?, ?)";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);  

            pstm.setString(1, String.valueOf(ate.getDentista_id()));
            pstm.setString(2, String.valueOf(ate.getCliente_id()));
            pstm.setString(3, String.valueOf(ate.getServico_id()));
            pstm.setString(4, String.valueOf(ate.getServico_id()));
            pstm.setString(5, String.valueOf(ate.getData())); 
            
            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Cadastro criado!");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
    
    public ArrayList<atendimento> carregarDados() {
        String sql = "select * from atendimento";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()) {
                atendimento ate = new atendimento();

                ate.setAtendimento_id(rs.getInt("atendimento_id"));
                ate.setDentista_id(rs.getInt("dentista_id"));
                ate.setCliente_id(rs.getInt("cliente_id"));
                ate.setServico_id(rs.getInt("servico_id"));
                ate.setFuncionario_id(rs.getInt("funcionario_id"));
                ate.setData(rs.getString("data"));
                
                lista.add(ate);
           }
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro: " + e.getMessage());
        }

        return lista;
    }
    
    public void atualizaDados(atendimento ate){
        String sql= "UPDATE atendimento SET dentista_id = ?, cliente_id = ?, servico_id = ?, funcionario_id = ?, data = ? WHERE atendimento_id = ?";
        con = new ConexaoDAO().conectaBD();
        
        try {
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, ate.getDentista_id());
            pstm.setInt(2, ate.getCliente_id());
            pstm.setInt(3, ate.getServico_id());
            pstm.setInt(4, ate.getFuncionario_id());
            pstm.setString(5, ate.getData());
            pstm.setInt(6, ate.getAtendimento_id());
            
            pstm.execute();
            pstm.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e.getMessage());
        }
    }
}