
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
            pstm.setString(2, dent.getDentista_nome());
            pstm.setString(3, dent.getDentista_cro());
            pstm.setString(4, dent.getDentista_tel());
            
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
        
        String sql = "SELECT d.dentista_id dentista_id , e.nome especialidade_id, d.nome nome, d.cro cro, d.telefone telefone FROM `dentista` AS d LEFT JOIN especialidade AS e ON e.especialidade_id = d.especialidade_id;";
        
        try {
        
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                dentista den = new dentista();
                den.setDentista_id(rs.getInt("dentista_id"));
                den.setEspecialidade_id(rs.getString("especialidade_id"));
                den.setDentista_nome(rs.getString("nome"));
                den.setDentista_cro(rs.getString("cro"));
                den.setDentista_tel("telefone");
                
                
                lista.add(den);
            }
            
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros de dentista: "+ e.getMessage());
        }
        
        return lista;
    }
}
