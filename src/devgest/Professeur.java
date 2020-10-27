/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devgest;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Try_Except_Finally
 */
public class Professeur {
    public  ResultSet Professeur() throws ClassNotFoundException{
        ResultSet del=null;
        try{
            Connexion c= new Connexion();
            c.Connexion();

            Statement start = c.Connexion().createStatement();
            del = start.executeQuery("select codeP,nom_p,prenom_p from Professeur");
            
        }catch(SQLException e){
            System.err.println(""+e.getMessage());
        }
        return del;
    }
}
