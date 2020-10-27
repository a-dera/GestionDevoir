/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package devgest;

//librairies 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author deraa
 */
public class Connexion {

    String ev = "?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";

    String url = "jdbc:mysql://localhost/database"+ ev;
    String login = "root";
    String pass = "";

    Connection con = null;
    Statement st = null;
    
    public int accesConnexion(){ 
    
        // Information d'acces a la bdd
        int testCo = 0;
       try {
           // Chargement du driver
           Class.forName("com.mysql.cj.jdbc.Driver");
           // recuperation de la connection

           con = DriverManager.getConnection(url,login, pass);
           // creation d'un statement
           st = con.createStatement();     

       }
       catch(SQLException | ClassNotFoundException e){
           System.out.println("Erreur de connexion a la base de donnée ");
           System.out.println("----> Verifier que le serveur est demarré ");
           testCo = 1;
       }
       return testCo;

   }

   public Connection Connexion() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connexion = DriverManager.getConnection(url,login, pass);
        return connexion;
    }   
  

    
}
    
