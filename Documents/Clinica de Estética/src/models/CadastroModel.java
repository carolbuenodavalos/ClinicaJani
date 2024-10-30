/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author marcu
 */
public class CadastroModel {
    private int idCliente;
    private String nomeCliente;
    private String cpfCliente;
    private String telCliente;
    
    
    public CadastroModel(){
    }
    
    public CadastroModel (int idCliente, String nomeCliente, String cpfCliente, String telCliente){
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.telCliente = telCliente;
    }
    
    
    public int getID(){
        return idCliente;
    }
    
    public void setID(int idCliente){
        this.idCliente = idCliente;
    }
    
    public String getNome(){
        return nomeCliente;
    }
    
    public void setNome(String nomeCliente){
     this.nomeCliente = nomeCliente;
    }
    
    public String getCPF(){
        return cpfCliente;
    }
    
    public void setCPF(String cpfCliente){
     this.cpfCliente = cpfCliente;
    }
    
    public String getTel(){
        return telCliente;
    }
    
    public void setTel(String telCliente){
     this.telCliente = telCliente;
    }
}