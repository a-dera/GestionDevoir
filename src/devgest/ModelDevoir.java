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
public class ModelDevoir {
    
    public boolean enregistrerDevoir(String codeD,String dateD,String heureD,String codeSa,String codeM,String codeCl,String codeP,String codeS) throws ClassNotFoundException{
        boolean success=true;    
        try{
                
                if(!searchDevoir(codeD)){
                    Connexion c= new Connexion();
                    c.Connexion();

                    Statement t=c.Connexion().createStatement();
                    PreparedStatement pat = c.Connexion().prepareStatement("insert into Devoir values(?,?,?,?,?,?,?,?)");
                    pat.setString(1,codeD);
                    pat.setString(2,dateD);
                    pat.setString(3,heureD);
                    pat.setString(4,codeSa);
                    pat.setString(5,codeM);
                    pat.setString(6,codeCl);
                    pat.setString(7,codeP);
                    pat.setString(8,codeS);

                    pat.execute();
                    c.Connexion().close();      

                    //System.out.println("(01) ligne ajouter avec succes!!!!");
                    
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
    
    public boolean searchDevoir(String code) throws ClassNotFoundException, SQLException{
            Connexion c= new Connexion();
            c.Connexion();
            
            Boolean state = false;    
            Statement start = c.Connexion().createStatement();
            ResultSet del = start.executeQuery("select codeD from Devoir");
            while(del.next()){
                if(code.equals(del.getString("codeD"))){    
                    state = true;
                }
            }     
            return state;       
    }
    
    //afficherDevoirClasse
    public ResultSet afficherDevoirClasse() throws ClassNotFoundException{
        ResultSet del = null;
        try{
            Connexion c= new Connexion();
            c.Connexion();
            
            Statement start = c.Connexion().createStatement();
          
            del = start.executeQuery("select * from Devoir inner join Classe on Devoir.codeCl=Classe.codeCl ");
            
        }catch(SQLException e){
            System.err.println("erreur:"+e.getMessage());
        }
        
        return del;
    }
    
    //afficherDevoirSurveillant
    public ResultSet afficherDevoirSurveillant() throws ClassNotFoundException{
        ResultSet del = null;
        try{
            Connexion c= new Connexion();
            c.Connexion();
            
            Statement start = c.Connexion().createStatement();
          
            del = start.executeQuery("select * from Devoir inner join Surveillant on Devoir.codeS=Surveillant.codeS ");
            
        }catch(SQLException e){
            System.err.println("erreur:"+e.getMessage());
        }
        
        return del;
    }
    
    //afficherDevoirSurveillant
    public ResultSet afficherDevoirSalle() throws ClassNotFoundException{
        ResultSet del = null;
        try{
            Connexion c= new Connexion();
            c.Connexion();
            
            Statement start = c.Connexion().createStatement();
          
            del = start.executeQuery("select * from Devoir inner join Salle on Devoir.codeSa=Salle.codeSa ");
            
        }catch(SQLException e){
            System.err.println("erreur:"+e.getMessage());
        }
        
        return del;
    }
    
    //afficherDevoirProfesseur
    public ResultSet afficherDevoirProfesseur() throws ClassNotFoundException{
        ResultSet del = null;
        try{
            Connexion c= new Connexion();
            c.Connexion();
            
            Statement start = c.Connexion().createStatement();
          
            del = start.executeQuery("select * from Devoir inner join Professeur on Devoir.codeP=Professeur.codeP ");
        }catch(SQLException e){
            System.err.println("erreur:"+e.getMessage());
        }
        
        return del;
    }
    
    //afficherDevoirModule
    public ResultSet afficherDevoirModule() throws ClassNotFoundException{
        ResultSet del = null;
        try{
            Connexion c= new Connexion();
            c.Connexion();
            
            Statement start = c.Connexion().createStatement();
   
            del = start.executeQuery("select * from Devoir inner join Module on Devoir.codeM=Module.codeM ");
            
        }catch(SQLException e){
            System.err.println("erreur:"+e.getMessage());
        }
        
        return del;
    }
    
    public boolean modifierDevoir(String codeD,String dateD,String heureD,String codeM,String codeCl,String codeP,String codeS) throws SQLException{
        boolean success=true;     
        try {
                    if(searchDevoir(codeD)){
                        Connexion c= new Connexion();
                        c.Connexion();

                        PreparedStatement up = c.Connexion().prepareStatement("update Devoir set dateD=?,heureD=?,codeM=?,codeCl=?,codeP=?,codeS=? where codeD=?");
                        up.setString(1, dateD);
                        up.setString(2, heureD);
                        up.setString(3, codeM);
                        up.setString(4, codeCl);
                        up.setString(5, codeP);
                        up.setString(6, codeS);
                        up.setString(7, codeD);

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
    
    public boolean affecterDevoir(String codeD,String codeSa,String codeS) throws SQLException{
        boolean success=true;     
        try {
                    if(searchDevoir(codeD)){
                        Connexion c= new Connexion();
                        c.Connexion();

                        PreparedStatement up = c.Connexion().prepareStatement("update Devoir set codeSa=?,codeS=? where codeD=?");
                  
                        up.setString(1, codeSa);
                        up.setString(2, codeS);
                        up.setString(3, codeD);

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
    
    public boolean supprimerDevoir(String identifiant) throws SQLException{
        boolean success=true;     
        try {
                Connexion c= new Connexion();
                c.Connexion();
                Statement start = c.Connexion().createStatement();
                
                if(searchDevoir(identifiant)){
                        PreparedStatement pat = c.Connexion().prepareStatement("delete from Devoir where codeD=?");
                        pat.setString(1,identifiant);
                        pat.execute();
                        c.Connexion().close();
                        System.out.println("(01) ligne supprim�e avec succes!!!!");
                }
                else{
                        success=false; 
                        System.out.println("impossible de supprimer ce devoir car le code est inexistant");
                }
                
            } catch (ClassNotFoundException ex) {
                success=false;
                System.out.println(""+ex.getMessage());
            }
        return success;
    }
    
    
}
