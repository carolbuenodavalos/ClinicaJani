/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author marcu
 */

public class ServicosModel {
    private int idServico;
    private String nomeServico;
    
    
    public ServicosModel(){
    }
    
    public ServicosModel (int idServico, String nomeServico){
        this.idServico = idServico;
        this.nomeServico = nomeServico;
    }
    
    
    public int getID(){
        return idServico;
    }
    
    public void setID(int idServico){
        this.idServico = idServico;
    }
    
    public String getServico(){
        return nomeServico;
    }
    
    public void setServico(String nomeServico){
     this.nomeServico = nomeServico;
    }
}
