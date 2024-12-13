package DAO;
import DTO.dentista;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class dentistaDAO {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<dentista> lista = new ArrayList<>();
    
    public void cadastro(dentista den) {
        String sql = "INSERT INTO (nome, cro, telefone) VALUES (?, ?, ?)";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);

            pstm.setString(1, den.getNome());
            pstm.setString(2, den.getCro());
            pstm.setString(3, den.getTel());
            
            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Cadastro criado!");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
    
    public ArrayList<dentista> carregarDados() {
        String sql = "select * from dentista";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()) {
                dentista den = new dentista();

                den.setDentista_id(rs.getInt("dentista_id"));
                den.setEspecialidade_id(rs.getInt("especialidade_id"));
                den.setNome(rs.getString("nome"));
                den.setCro(rs.getString("cro"));
                den.setTel(rs.getString("telefone"));
                
                lista.add(den);
           }
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro: " + e.getMessage());
        }

        return lista;
    }
    
    public void atualizaDados(dentista den){
        String sql= "UPDATE dentista SET especialidade_id = ?, nome = ?, cro = ?, telefone = ? WHERE dentista_id = ?";
        con = new ConexaoDAO().conectaBD();
        
        try {
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, den.getEspecialidade_id());
            pstm.setString(2, den.getNome());
            pstm.setString(3, den.getCro());
            pstm.setString(4, den.getTel());
            pstm.setInt(5, den.getDentista_id());
            
            pstm.execute();
            pstm.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e.getMessage());
        }
    }
}
