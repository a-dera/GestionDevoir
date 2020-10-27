/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devgest;

import javax.swing.JOptionPane;
/**
 *
 * @author deraa
 */
public class ControlerConnexion {

    /**
     * Récupérer des identifiants de  connexion
     * Tester les identifiants de connexion
     * Etablir la session et rediriger vers la page d'acceuil
     */
    private ModelConnexion modelConnexion;
    private PageConnexion pageConnexion;

    public ControlerConnexion(ModelConnexion m, PageConnexion p){
        modelConnexion = m;
        pageConnexion = p;
        testConnexion();
    }

    //initialisation de la vue
    public void initView(){
       // pageConnexion.getIdentifiantTextField().setText(modelConnexion.getIdentifiant());
       // pageConnexion.getPasswordPasswordField().setPassword(modelConnexion.getPassword());

    }

    //initialisation du controller
    public void initControler(){
        //pageConnexion.getIdentitfiantConnexionButton().addActionListner(e ->testConnexion());
        //pageConnexion.getPaswordConnexionButton().addActionListner(e ->testConnexion());
     }

     //test de la connexion
     public void testConnexion(){
        //modelConnexion.setIdentifiant(pageConnexion.getIdentifiantTextField().getText());
        //modelConnexion.setPassword(pageConnexion.getPasswordPasswordField().getPassword());

        // modelConnexion.getIdentifiant()
        // modelConnexion.getPassword()

        JOptionPane.showMessageDialog(null, "test " + modelConnexion.getIdentifiant()+" " + modelConnexion.getPassword(), "info", JOptionPane.INFORMATION_MESSAGE);








        // JOptionPane.showMessageDialog(null, "Informations correctes, redirection en cours", "success", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Identifiant et/ou mot de passe incorrect(s)", "danger", JOptionPane.INFORMATION_MESSAGE);

     }
}
