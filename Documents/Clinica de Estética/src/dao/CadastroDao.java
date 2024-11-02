/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Telas.Cadastro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.CadastroModel;

/**
 *
 * @author marcu
 */
public class CadastroDao implements DaoGenerica<CadastroModel> {

    private ConexaoBancoIntegrador conexao;
    
    public CadastroDao()
    {
        this.conexao = new ConexaoBancoIntegrador();
    }
    
    @Override
    public void inserir(CadastroModel cadastro) {
        //string com a consulta que será executada no banco
        String sql = "INSERT INTO cliente (nomeCliente, cpfCliente, telCliente) VALUES (?,?,?)";
        
        try
        {
            //tenta realizar a conexão, se retornar verdadeiro entra no IF
            if(this.conexao.conectar())
            {
                //prepara a sentença com a consulta da string
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                //subtitui as interrograções da consulta, pelo valor específico
                sentenca.setString(1,cadastro.getNome()); //subsitui a primeira ocorrência da interrogação pelo atributo nome
                sentenca.setString(2,cadastro.getCPF());
                sentenca.setString(3,cadastro.getTel()); 
                sentenca.execute(); //executa o comando no banco
                sentenca.close(); //fecha a sentença
                this.conexao.getConnection().close(); //fecha a conexão com o banco
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }

    @Override
    public void alterar(CadastroModel cadastro) {
        String sql = "UPDATE cliente SET nomeCliente = ?, cpfCliente = ?, telCliente = ? where idCliente = ?";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql); 
                sentenca.setString(1,cadastro.getNome());
                sentenca.setString(2,cadastro.getCPF());
                sentenca.setString(3,cadastro.getTel()); ;
                sentenca.setInt(4, cadastro.getID());
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
        String sql = "DELETE FROM cliente";
        
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
    public void excluirID(int id) {
        String sql = "DELETE FROM cliente WHERE idCliente = ?";
        
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
    public ArrayList<CadastroModel> consultar() {
        
        ArrayList<CadastroModel> listaCadastros = new ArrayList<CadastroModel>();
        String sql = "SELECT c.idCliente, c.nomeCliente, c.cpfCliente, c.telCliente"+
                     "FROM cliente as c "+
                     "ORDER BY c.idCliente ";
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                //recebe o resultado da consulta
                ResultSet resultadoSentenca = sentenca.executeQuery();

                //percorrer cada linha do resultado
                while(resultadoSentenca.next()) 
                {
                    CadastroModel cadastro = new CadastroModel();
                    cadastro.setID(resultadoSentenca.getInt("idCliente"));
                    cadastro.setNome(resultadoSentenca.getString("nomeCliente"));
                    cadastro.setCPF(resultadoSentenca.getString("cpfCliente"));
                    cadastro.setTel(resultadoSentenca.getString("telCliente"));
                    
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
    public ArrayList<CadastroModel> consultar(String str) {
        ArrayList<CadastroModel> listaCadastrosStr = new ArrayList<CadastroModel>();
        String sql = "SELECT c.idCliente, c.nomeCliente, c.cpfCliente, c.telCliente"+
                     "FROM cliente as c "+
                     "WHERE ( UPPER(c.nomeCliente like UPPER(?))) "+   
                     "ORDER BY c.nomeCliente ";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                //recebe o resultado da consulta
                sentenca.setString(1, "%"+str+"%");
                ResultSet resultadoSentenca = sentenca.executeQuery();

                //percorrer cada linha do resultado
                while(resultadoSentenca.next()) 
                {
                    //resgata o valor de cada linha, selecionando pelo nome de cada coluna da tabela Escola
                    CadastroModel cadastro = new CadastroModel();
                    cadastro.setID(resultadoSentenca.getInt("idCliente"));
                    cadastro.setNome(resultadoSentenca.getString("nomeCliente"));
                    cadastro.setCPF(resultadoSentenca.getString("cpfCliente"));
                    cadastro.setTel(resultadoSentenca.getString("telCliente"));
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
    public ArrayList<CadastroModel> dashboard() {
        ArrayList<CadastroModel> ListarDashBoard = new ArrayList<CadastroModel>();
        String sql = "select count(idCliente) as numcad, count(idCliete)*2 as sumcad from cliente;";
//        String sql = "select FLOOR(RAND()*(10-5+1)*10) as numcad, FLOOR(RAND()*(10-5+1)*10) as sumcad, FLOOR(RAND()*(10-5+1)*10) as numsexualidade";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                //recebe o resultado da consulta
                 ResultSet resultadoSentenca = sentenca.executeQuery();

                //percorrer cada linha do resultado
                while(resultadoSentenca.next()) 
                {

                    CadastroModel cadastro = new CadastroModel();
                    //cadastro.setTotalCadastros(resultadoSentenca.getInt("numcad"));
                    //cadastro.SetSomaCodigos(resultadoSentenca.getInt("sumcad"));
                    //cadastro.SetNumSexualidade(resultadoSentenca.getInt("numsexualidade"));
                    
                    ListarDashBoard.add(cadastro);
                }

                sentenca.close();
                this.conexao.getConnection().close();
            }
            
            return ListarDashBoard;
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        } 
    } 
}