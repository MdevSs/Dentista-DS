package DAO;
import DTO.funcionario;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class funcionarioDAO {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<funcionario> lista = new ArrayList<>();
    
    public void cadastro(funcionario fun) {
        String sql = "INSERT INTO funcionario(nome, ctps, telefone) VALUES (?, ?, ?)";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);

            pstm.setString(1, fun.getNome());
            pstm.setString(2, fun.getCtps());
            pstm.setString(3, fun.getTel());

            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
    
    public ArrayList<funcionario> carregarDados() {
        String sql = "select * from funcionario";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()) {
                funcionario fun = new funcionario();

                fun.setFuncionario_id(rs.getInt("funcionario_id"));
                fun.setNome(rs.getString("nome"));
                fun.setCtps(rs.getString("ctps"));
                fun.setTel(rs.getString("telefone"));

                lista.add(fun);
           }
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro: " + e.getMessage());
        }

        return lista;
    }
    
    public void atualizaDados(funcionario fun){
        String sql= "UPDATE funcionario SET nome = ?, ctps = ?, telefone = ? WHERE funcionario_id = ?";
        con = new ConexaoDAO().conectaBD();
        
        try {
            pstm = con.prepareStatement(sql);
            
            pstm.setString(1, fun.getNome());
            pstm.setString(2, fun.getCtps());
            pstm.setString(3, fun.getTel());
            pstm.setInt(4, fun.getFuncionario_id());
            
            pstm.execute();
            pstm.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e.getMessage());
        }
    }
}
