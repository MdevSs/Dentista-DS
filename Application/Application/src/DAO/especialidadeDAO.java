package DAO;
import DTO.especialidade;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class especialidadeDAO {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<especialidade> lista = new ArrayList<>();
    
    public void cadastro(especialidade esp) {
        String sql = "INSERT INTO especialidade(nome, descricao) VALUES (?, ?)";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);

            pstm.setString(1, esp.getNome());
            pstm.setString(2, esp.getDesc());

            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Cadastro criado!");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
    
    public ArrayList<especialidade> carregarDados() {
        String sql = "select * from especialidade";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()) {
                especialidade esp = new especialidade();

                esp.setEspecialidade_id(rs.getInt("especialidade_id"));
                esp.setNome(rs.getString("nome"));
                esp.setDesc(rs.getString("descricao"));

                lista.add(esp);
           }
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro: " + e.getMessage());
        }

        return lista;
    }
    
    public void atualizaDados(especialidade esp){
        String sql= "UPDATE especialidade SET nome = ?, descricao = ? WHERE especialidade_id = ?";
        con = new ConexaoDAO().conectaBD();
        
        try {
            pstm = con.prepareStatement(sql);
            
            pstm.setString(1, esp.getNome());
            pstm.setString(2, esp.getDesc());
            pstm.setInt(3, esp.getEspecialidade_id());
            
            pstm.execute();
            pstm.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e.getMessage());
        }
    }
}
