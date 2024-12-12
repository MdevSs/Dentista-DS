package DAO;
import DTO.funcionario;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    
    public ArrayList<funcionario> CarregaFuncionario(){
        con = new ConexaoDAO().conectaBD();
        
        String sql = "SELECT * FROM funcionario WHERE ativo = 1";
        
        try {
        
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                funcionario fun = new funcionario();
                fun.setFuncionario_id(rs.getInt("funcionario_id"));
                fun.setFuncionario_nome(rs.getString("nome"));
                fun.setFuncionario_ctps(rs.getString("ctps"));
                fun.setFuncionario_tel(rs.getString("telefone"));
                
                
                lista.add(fun);
            }
            
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros de funcionario: "+ e.getMessage());
        }
        
        return lista;
    }

    public void RemoverRegistros(int[] nCodigos) {
        String sql = "UPDATE funcionario SET ativo = 0 WHERE ";
        
        for(int i = 0; i< nCodigos.length; i++) {
            if(i == 0)
                sql += "funcionario_id = "+ nCodigos[i];
            else
                sql += " OR funcionario_id = "+ nCodigos[i];
        }
        
        try{
        
            con = new ConexaoDAO().conectaBD();
            
            pstm = con.prepareStatement(sql);
            
            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso");
        } 
        catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro, Não fo possivel atualizar os dados: \n"+ erro);
        }
        
    }
}
