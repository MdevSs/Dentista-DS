
package DAO;
import DTO.dentista;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class dentistaDAO {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<dentista> lista = new ArrayList<>();
    
    public void cadastro(dentista dent) {
        // ESTAVA COM PREGUIÇA, FALTA ARRUMAR AQUI, O JUAN VAI ACHAR E ME OLHAR COM CARA DE BUNDA?! SIM MAS FDS
        String sql = "INSERT INTO dentista(especialidade_id, nome, cro, telefone) VALUES ((SELECT especialidade_id FROM especialidade WHERE nome = ?) ,?, ?, ?)";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);

            pstm.setString(1, dent.getEspecialidade_id());
            pstm.setString(2, dent.getNome());
            pstm.setString(3, dent.getCro());
            pstm.setString(4, dent.getTel());
            
            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Dentista cadastrado com sucesso!");
        }
        catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de cadastro!\nErro: " + erro);
        }
    }
    
    public ArrayList<dentista> CarregaDentista(){
        con = new ConexaoDAO().conectaBD();
        
        String sql = "SELECT d.dentista_id dentista_id , e.nome especialidade_id, d.nome nome, d.cro cro, d.telefone as 'telefone' FROM `dentista` AS d LEFT JOIN especialidade AS e ON e.especialidade_id = d.especialidade_id WHERE d.ativo = 1";
        
        try {
        
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                dentista den = new dentista();
                den.setDentista_id(rs.getInt("dentista_id"));
                den.setEspecialidade_id(rs.getString("especialidade_id"));
                den.setNome(rs.getString("nome"));
                den.setCro(rs.getString("cro"));
                den.setTel(rs.getString("telefone"));
                
                
                lista.add(den);
            }
            
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros de dentista: "+ e.getMessage());
        }
        
        return lista;
    }

    public void RemoverRegistros(int[] nCodigos) {
        String sql = "UPDATE dentista SET ativo = 0 WHERE ";
        
        for(int i = 0; i< nCodigos.length; i++) {
            if(i == 0)
                sql += "dentista_id = "+ nCodigos[i];
            else
                sql += " OR dentista_id = "+ nCodigos[i];
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
    
    public void atualizaDados(dentista den){
        String sql= "UPDATE dentista SET especialidade_id = (SELECT especialidade_id FROM especialidade WHERE nome = ?), nome = ?, cro = ?, telefone = ? WHERE dentista_id = ?";
        con = new ConexaoDAO().conectaBD();
        
        try {
            pstm = con.prepareStatement(sql);
            
            pstm.setString(1, den.getEspecialidade_id());
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
