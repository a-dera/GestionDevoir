/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devgest;

/**
 *
 * @author Try_Except_Finally
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Try_Except_Finally
 */
public class ModelSurveillant {
    public boolean enregistrerSurveillant(String codeS,String nom_s,String prenom_s,String adresse_s) throws ClassNotFoundException{
        boolean success=true;     
        try{
                if(!searchSurveillant(codeS)){
                    Connexion c= new Connexion();
                    c.Connexion();
                     
                    Statement t=c.Connexion().createStatement();
                    PreparedStatement up = c.Connexion().prepareStatement("insert into Surveillant values(?,?,?,?)");
                    up.setString(1, codeS);
                    up.setString(2, nom_s);
                    up.setString(3, prenom_s);
                    up.setString(4, adresse_s);
                    
                    up.execute();
                    c.Connexion().close();      
                    System.out.println("(01) ligne ajouter avec succes!!!!");
                }
                else{
                    System.out.println("ce matricule existe deja...");
                    success=false;
                }
            }catch(SQLException e){
                System.err.println("erreur d'insertion:"+e.getMessage());
                success=false;
            }
        return success;
    }
        
    public boolean searchSurveillant(String code) throws ClassNotFoundException, SQLException{
            Connexion c= new Connexion();
            c.Connexion();
            
            Boolean state = false;    
            Statement start = c.Connexion().createStatement();
            ResultSet del = start.executeQuery("select codeS from Surveillant");
            while(del.next()){
                if(code.equals(del.getString("codeS"))){    
                    state = true;
                }
            }     
            return state;       
    }
    
    public ResultSet afficherSurveillant() throws ClassNotFoundException{
        ResultSet del=null;
        try{
            Connexion c= new Connexion();
            c.Connexion();
            
            Statement start = c.Connexion().createStatement();
            del = start.executeQuery("select * from Surveillant");
            
        }catch(SQLException e){
            System.err.println("erreur:"+e.getMessage());
        }
        
        return del;
    
    }
    
    
    public boolean modifierSurveillant(String codeS,String nom_s,String prenom_s,String adresse_s) throws SQLException{
        boolean success=true;    
        try {
                    if(searchSurveillant(codeS)){
                        Connexion c= new Connexion();
                        c.Connexion();

                        PreparedStatement up = c.Connexion().prepareStatement("update Surveillant set nom_s=?,prenom_s=?,adresse_s=? where codeS=?");
                        up.setString(1, nom_s);
                        up.setString(2, prenom_s);
                        up.setString(3, adresse_s);
                        up.setString(4, codeS);
                       
                        up.execute();
                        c.Connexion().close();
                        System.out.println("(01) ligne modifier avec succes!!!!");
                    }else{
                        System.out.println("ce matricule est inexistant...");
                        success=false;
                    }
                
            } catch (ClassNotFoundException ex) {
                System.out.println(""+ex.getMessage());
                success=false;
            }
                
       return success;
    }
    
    public boolean supprimerSurveillant(String identifiant) throws SQLException{
        boolean success=true;    
        try {
                Connexion c= new Connexion();
                c.Connexion();
                Statement start = c.Connexion().createStatement();
                
                if(searchSurveillant(identifiant)){
                        PreparedStatement pat = c.Connexion().prepareStatement("delete from Surveillant where codeS=?");
                        pat.setString(1,identifiant);
                        pat.execute();
                        c.Connexion().close();
                        System.out.println("(01) ligne supprim�e avec succes!!!!");
                }
                else{
                        System.out.println("impossible de supprimer ce devoir car le code est inexistant");
                        success=false; 
                }
                
            } catch (ClassNotFoundException ex) {
                System.out.println(""+ex.getMessage());
                success=false; 
            }
           
        return success; 
    }
}
