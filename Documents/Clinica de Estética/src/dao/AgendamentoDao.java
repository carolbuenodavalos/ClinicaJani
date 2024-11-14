/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.AgendamentoModel;

/**
 *
 * @author marcu
 */
public class AgendamentoDao implements DaoGenerica<AgendamentoModel>{

    private ConexaoBancoIntegrador conexao;
    
    public AgendamentoDao()
    {
        this.conexao = new ConexaoBancoIntegrador();
    }
    
    public AgendamentoDao(ConexaoBancoIntegrador conexao)
    {
        this.conexao = conexao;
    }
    
    @Override
    public void inserir(AgendamentoModel cadastro) {
        String sql = "INSERT INTO agendamento (nome, cpf, telefone, servico, horario, dataAgendamento) VALUES (?,?,?,?,?,?)";
        
        try{
 
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setString(1,cadastro.getNome()); 
                sentenca.setString(2,cadastro.getCpf());
                sentenca.setString(3,cadastro.getTelefone()); 
                sentenca.setString(4,cadastro.getServico()); 
                sentenca.setString(5,cadastro.getHorario()); 
                sentenca.setString(6,cadastro.getDataAgendamento());               
                sentenca.execute(); 
                sentenca.close(); 
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex){
           throw new RuntimeException(ex);
        }
    }

    @Override
    public void alterar(AgendamentoModel cadastro) {
        String sql = "UPDATE agendamento SET nome = ?, cpf = ?, telefone = ?, servico = ?, horario = ?, dataAgendamento = ? WHERE idAgendamento = ?";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql); 
                sentenca.setString(1,cadastro.getNome()); 
                sentenca.setString(2,cadastro.getCpf());
                sentenca.setString(3,cadastro.getTelefone()); 
                sentenca.setString(4,cadastro.getServico()); 
                sentenca.setString(5,cadastro.getHorario()); 
                sentenca.setString(6,cadastro.getDataAgendamento()); 
                sentenca.setInt(7,cadastro.getIdAgendamento()); 
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }
    public void excluirID(int id) {
        String sql = "DELETE FROM agendamento WHERE idAgendamento = ?";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setInt(1, id);
                
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }
    

    @Override
    public ArrayList<AgendamentoModel> consultar() {
        
        ArrayList<AgendamentoModel> listaCadastros = new ArrayList<AgendamentoModel>();
        String sql = "SELECT c.idAgendamento, c.nome, c.cpf, c.telefone, c.horario, c.dataAgendamento "+
                     "FROM agendamento as c "+
                     "ORDER BY c.idAgendamento";
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while(resultadoSentenca.next()) 
                {
                    
                    AgendamentoModel cadastro = new AgendamentoModel();
                    cadastro.setIdAgendamento(resultadoSentenca.getInt("idAgendamento"));
                    cadastro.setNome(resultadoSentenca.getString("nome"));
                    cadastro.setCpf(resultadoSentenca.getString("cpf"));
                    cadastro.setTelefone(resultadoSentenca.getString("telefone"));
                    cadastro.setHorario(resultadoSentenca.getString("horario"));
                    cadastro.setDataAgendamento(resultadoSentenca.getString("dataAgendamento"));
                    
                    
                    
                    listaCadastros.add(cadastro);
                }

                sentenca.close();
                this.conexao.getConnection().close();
            }
            
            return listaCadastros;
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        } 
    }
    public ArrayList<AgendamentoModel> consultar(String str) {
        ArrayList<AgendamentoModel> listaCadastrosStr = new ArrayList<AgendamentoModel>();
         String sql = "SELECT c.idAgendamento, c.nome, c.cpf, c.telefone, c.horario, c.dataAgendamento " +
                 "FROM agendamento AS c " +
                 "WHERE UPPER(c.nome) LIKE UPPER(?) " +
                 "ORDER BY c.nome";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setString(1, "%"+str+"%");
                ResultSet resultadoSentenca = sentenca.executeQuery();

                while(resultadoSentenca.next()) 
                {
                    AgendamentoModel cadastro = new AgendamentoModel();
                    cadastro.setIdAgendamento(resultadoSentenca.getInt("idAgendamento"));
                    cadastro.setNome(resultadoSentenca.getString("nome"));
                    cadastro.setCpf(resultadoSentenca.getString("cpf"));
                    cadastro.setTelefone(resultadoSentenca.getString("telefone"));
                    cadastro.setHorario(resultadoSentenca.getString("horario"));
                    cadastro.setDataAgendamento(resultadoSentenca.getString("dataAgendamento"));
                    
                    listaCadastrosStr.add(cadastro);
                }

                sentenca.close();
                this.conexao.getConnection().close();
            }
            
            return listaCadastrosStr;
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        } 
    }
    
    public ArrayList<AgendamentoModel> consultarPorData(String data) {
    ArrayList<AgendamentoModel> listaCadastrosStr = new ArrayList<>();
    String sql = "SELECT c.idAgendamento, c.nome, c.cpf, c.telefone, c.horario, c.dataAgendamento " +
                 "FROM agendamento AS c " +
                 "WHERE c.dataAgendamento LIKE ? " +
                 "ORDER BY c.nome";

    try {
        if (this.conexao.conectar()) {
            PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
            sentenca.setString(1, "%" + data + "%");
            ResultSet resultadoSentenca = sentenca.executeQuery();

            while (resultadoSentenca.next()) {
                AgendamentoModel cadastro = new AgendamentoModel();
                cadastro.setIdAgendamento(resultadoSentenca.getInt("idAgendamento"));
                cadastro.setNome(resultadoSentenca.getString("nome"));
                cadastro.setCpf(resultadoSentenca.getString("cpf"));
                cadastro.setTelefone(resultadoSentenca.getString("telefone"));
                cadastro.setHorario(resultadoSentenca.getString("horario"));
                String dataString = resultadoSentenca.getString("dataAgendamento");
                cadastro.setDataAgendamento(dataString);
                listaCadastrosStr.add(cadastro);
            }
            sentenca.close();
            this.conexao.getConnection().close();
        }
        return listaCadastrosStr;
    } catch (SQLException ex) {
        System.out.println("Erro ao executar a consulta SQL: " + ex.getMessage());
        ex.printStackTrace();
        throw new RuntimeException("Erro ao executar a consulta SQL", ex);
    }
}


    public void excluir() {
        String sql = "DELETE FROM agendamento";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
   
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }

    @Override
    public ArrayList<AgendamentoModel> dashboard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
