/**
 *
 * @author xtremebass
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//Objeto
public class ConexaoBancoIntegrador {   
    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    private Connection conexao; 
//Construtor
    public ConexaoBancoIntegrador() {
        this.servidor = "200.195.171.124";
        this.banco = "grupo16_integrador";
        this.usuario = "grupo16";
        this.senha = "ivpkygEwYJW7qV9L";
    }
    public boolean conectar(){
        try
        {
            this.conexao = DriverManager.getConnection("jdbc:mysql://"+this.servidor+"/"+this.banco,this.usuario,this.senha);
            return true;
        }
        catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
    public Connection getConnection() {
        return conexao;
    }

}
