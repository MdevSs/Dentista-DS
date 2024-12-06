package DAO;
import DTO.servico;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author leand
 */
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

            pstm.setString(1, ser.getServico_desc());
            pstm.setString(2, ser.getServico_duracao());
            pstm.setString(3, Double.toString(ser.getServico_valor()));

            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Serviço cadastrado com sucesso!");
        }
        catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de cadastro!\nErro: " + erro);
        }
    }
    
    public ArrayList<servico> CarregaServico(){
        con = new ConexaoDAO().conectaBD();
        
        String sql = "SELECT * FROM servico";
        
        try {
        
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                servico ser = new servico();
                ser.setServico_id(rs.getInt("servico_id"));
                ser.setServico_desc(rs.getString("descricao"));
                ser.setServico_duracao(rs.getString("duracao"));
                ser.setServico_valor(rs.getFloat("valor"));
                
                lista.add(ser);
            }
            
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros de serviço: "+ e.getMessage());
        }
        
        return lista;
    }
}
