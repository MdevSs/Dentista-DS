package DAO;
import DTO.atendimento;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class atendimentoDAO {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<atendimento> lista = new ArrayList<>();
    
    public void cadastro(atendimento ate) {
        String sql = "INSERT INTO atendimento(dentista_id, cliente_id, servico_id, funcionario_id) VALUES ((SELECT dentista_id FROM dentista WHERE nome = ?),(SELECT cliente_id FROM cliente WHERE nome =  ?),  (SELECT servico_id FROM servico WHERE descricao =  ?),(SELECT funcionario_id FROM funcionario WHERE nome =  ?))";
        con = new ConexaoDAO().conectaBD();

        try {
            pstm = con.prepareStatement(sql);

            pstm.setString(1, ate.getDentista());
            pstm.setString(2, ate.getCliente());
            pstm.setString(3, ate.getServico());
            pstm.setString(4, ate.getFuncionario());

            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Atendimento cadastrado com sucesso!");
        }
        catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de cadastro!\nErro: " + erro);
        }
    }
    
    public ArrayList<atendimento> CarregaAtendimento(){
        con = new ConexaoDAO().conectaBD();
        
        String sql = "SELECT atendimento_id, d.nome dentista, c.nome cliente, s.descricao servico, f.nome funcionario, `data` FROM atendimento AS a LEFT JOIN dentista AS d ON d.dentista_id = a.dentista_id LEFT JOIN cliente AS c ON c.cliente_id = a.cliente_id LEFT JOIN servico AS s ON s.servico_id = a.servico_id LEFT JOIN funcionario AS f ON f.funcionario_id = a.funcionario_id WHERE a.ativo =1";
        
        try {
        
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                atendimento ate = new atendimento();
                ate.setAtendimento_id(rs.getInt("atendimento_id"));
                ate.setDentista(rs.getString("dentista"));
                ate.setCliente(rs.getString("cliente"));
                ate.setServico(rs.getString("servico"));
                ate.setFuncionario(rs.getString("funcionario"));
                ate.setData(rs.getString("data"));
                
                lista.add(ate);
            }
            
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros de atendimento: "+ e.getMessage());
        }
        
        return lista;
    }

    public void RemoverRegistros(int[] nCodigos) {
        String sql = "UPDATE atendimento SET ativo = 0 WHERE ";
        
        for(int i = 0; i< nCodigos.length; i++) {
            if(i == 0)
                sql += "atendimento_id = "+ nCodigos[i];
            else
                sql += " OR atendimento_id = "+ nCodigos[i];
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
    
    public void atualizaDados(atendimento ate){
        String sql= "UPDATE atendimento SET dentista_id = (SELECT dentista_id FROM dentista WHERE nome = ?), cliente_id = (SELECT cliente_id FROM cliente WHERE nome = ?), servico_id = (SELECT servico_id FROM servico WHERE descricao = \"MUITO RUIM\"), funcionario_id = (SELECT funcionario_id FROM funcionario WHERE nome = ?), data = ? WHERE atendimento_id = ?";
        con = new ConexaoDAO().conectaBD();
        
        try {
            pstm = con.prepareStatement(sql);
            
            pstm.setString(1, ate.getDentista());
            pstm.setString(2, ate.getCliente());
            pstm.setString(3, ate.getServico());
            pstm.setString(4, ate.getFuncionario());
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
