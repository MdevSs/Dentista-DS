
package DAO;
import DTO.especialidade;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class especialidadeDAO {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<especialidade> lista = new ArrayList<>();
    
    public void cadastro(especialidade esp) {
        // ESTAVA COM PREGUIÇA, FALTA ARRUMAR AQUI, O JUAN VAI ACHAR E ME OLHAR COM CARA DE BUNDA?! SIM MAS FDS
        String sql = "INSERT INTO especialidade(nome, descricao) VALUES (?, ?)";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);

            pstm.setString(1, esp.getEspecialidade_nome());
            pstm.setString(2, esp.getEspecialidade_desc());

            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Especialidade cadastrado com sucesso!");
        }
        catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de cadastro!\nErro: " + erro);
        }
    }
    
    public ArrayList<especialidade> CarregaEspecialidade(){
        con = new ConexaoDAO().conectaBD();
        
        String sql = "SELECT * FROM especialidade WHERE ativo = 1";
        
        try {
        
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                especialidade esp = new especialidade();
                esp.setEspecialidade_id(rs.getInt("especialidade_id"));
                esp.setEspecialidade_nome(rs.getString("nome"));
                esp.setEspecialidade_desc(rs.getString("descricao"));
                
                lista.add(esp);
            }
            
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros de especialidade: "+ e.getMessage());
        }
        
        return lista;
    }

    public void RemoverRegistros(int[] nCodigos) {
        String sql = "UPDATE especialidade SET ativo = 0 WHERE ";
        
        for(int i = 0; i< nCodigos.length; i++) {
            if(i == 0)
                sql += "especialidade_id = "+ nCodigos[i];
            else
                sql += " OR especialidade_id = "+ nCodigos[i];
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
