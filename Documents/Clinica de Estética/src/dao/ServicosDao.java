/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.ServicosModel;
import dao.DaoGenerica;
/**
 *
 * @author marcu
 */

public class ServicosDao implements DaoGenerica<ServicosModel>{

    private ConexaoBancoIntegrador conexao;
    
    public ServicosDao()
    {
        this.conexao = new ConexaoBancoIntegrador();
    }
    
    @Override
    public void inserir(ServicosModel cadastro) {
        String sql = "INSERT INTO Servicos (idServico, nomeServico) VALUES (?,?)";
        //eu nn sei oq caralhos aconteceu q simplesmente pega "nomeProfissional" de algum lugar e simplesmnete nn cadastra, pfv alguem da uma luz
        try{
 
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setInt(1,cadastro.getID()); 
                sentenca.setString(2,cadastro.getServico());             
                sentenca.execute(); 
                sentenca.close(); 
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex){
           throw new RuntimeException(ex);
        }
    }
    
    public ArrayList<ServicosModel> consultar() {
         ArrayList<ServicosModel> listServico = new ArrayList<ServicosModel>();
        String sql = "SELECT idServico, nomeServico FROM Servicos ORDER BY nomeServico";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                ResultSet resultadoSentenca = sentenca.executeQuery();

                while(resultadoSentenca.next()) 
                {
                    ServicosModel Servlist = new ServicosModel();
                    Servlist.setID(resultadoSentenca.getInt("idServico"));
                    Servlist.setServico(resultadoSentenca.getString("nomeServico"));

                    listServico.add(Servlist);
                }

                sentenca.close();
                this.conexao.getConnection().close();
            }
            
            return listServico;
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }
     public void excluirID(int id) {
        String sql = "DELETE FROM Servicos WHERE idServico = ?";
        
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
    public void excluir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alterar(ServicosModel objt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<ServicosModel> dashboard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
