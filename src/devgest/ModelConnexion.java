/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devgest;

/**
 *
 * @author deraa
 */
public class ModelConnexion {
    /**
     * Model pour la page de connexion
     * Declaration des variables et des accesseurs
     */
    private String identifiant;
    private String password;

    public ModelConnexion(String identifiant, String password){
        this.identifiant = identifiant;
        this.password = password;
    }

    public String getIdentifiant(){
        return identifiant;
    }
    
    public String getPassword(){
        return password;
    }

    public void setIdentifiant(String identifiant){
        this.identifiant = identifiant;
    }

    public void setPassword(String password){
        this.identifiant = identifiant;
    }
}
