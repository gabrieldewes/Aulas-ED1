/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ramon
 */
public class Pessoa {
    private int idContato;
    private String nome;
    private String fone;
 
    public Pessoa(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public int getIdContato() {
        return idContato;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    
    
    public boolean save(){
        
        String stringConexao= "jdbc:mysql://localhost/PessoaAP3";
        String usuario="root";
        String senha="";
        boolean ok=false;
        try{
            Connection conexao=DriverManager.getConnection(stringConexao,usuario,senha);
            String sql= "INSERT INTO Contato(nome,fone)VALUES('"+this.nome+"','"+this.fone +"');";
            PreparedStatement comando = conexao.prepareStatement(sql);
            
            ok=comando.execute();
            
            comando.close();
                
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return ok;
    }
    
    
     public static ResultSet listar(){
        
        String stringConexao= "jdbc:mysql://localhost/PessoaAP3";
        String usuario="root";
        String senha="";
           try{
            Connection conexao=DriverManager.getConnection(stringConexao,usuario,senha);
          
            String sql= "SELECT idContato,nome,fone FROM Contato;";
            PreparedStatement comando = conexao.prepareStatement(sql);
        
            ResultSet rs = comando.executeQuery();
           
            
            
            //comando.close();
                 return rs;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return null;
        
     
     }
    
}
