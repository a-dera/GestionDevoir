/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devgest;

/**
 *
 * @author HP
 */
public class Accesseur {
    //DECLARATION DES VARIABLES
    private String nom_s ,prenom_s,adresse_s,nom_p,prenom_p,grade_p,adresse_p,codeF,nom_f,nom_m,codeCl,niveau,codeM,codeD,dateD,heureD,codeP,codeS,dateRemise,codeSa;
    private int coef; 
    //CONSTRUCTEUR
public Accesseur(String nom_s ,String prenom_s,String adresse_s,String nom_p,String prenom_p,String grade_p,String codeSa,String adresse_p,String codeF,String nom_f,String nom_m,String codeCl,String niveau,String codeM,String codeD,String dateD,String heureD,String codeP,String codeS,String dateRemise,int coef )
{
       this.nom_s = nom_s;
       this.prenom_s = prenom_s;
       this.adresse_s = adresse_s;
       this.nom_p = nom_p;
       this.prenom_p = prenom_p;
       this.grade_p = grade_p;
       this.adresse_p = adresse_p;
       this.codeF = codeF;
       this.nom_f = nom_f;
       this.nom_m = nom_m;
       this.codeCl = codeCl;
       this.niveau = niveau;
       this.codeM = codeM;
       this.codeD = codeD;
       this.dateD = dateD;
       this.heureD = heureD;
       this.codeP = codeP;
       this.codeS = codeS;
        this.codeSa = codeSa;
       this.dateRemise = dateRemise;
       this.coef = coef;
}
public Accesseur(){
    }
    //ACCESSEURS
    public String getNom_s(){
           return nom_s;
    }
      public String getCodeSa(){
           return codeSa;
    }


    public String getPrenom_s() {
          return prenom_s;  
    }


    public String getAdresse_s() {
          return adresse_s;  
}


    public String getNom_p() {
          return nom_p;  
}


     public String getPrenom_p() {
          return prenom_p;  
}

       public String getGrade_p() {
          return grade_p;  
}

       public String getAdresse_p() {
          return adresse_p;  
}

       public String getCodeF() {
          return codeF;  
}

       public String getNom_f() {
          return nom_f;  
}

      public String getNom_m() {
          return nom_m;  
}

 public String getCodeCl() {
          return codeCl;  
}
 public String getNiveau() {
          return niveau;  
}
 public String getCodeM() {
          return codeM;  
}

public String getCodeD() {
          return codeD;  
}

public String getDateD() {
          return dateD;  
}

public String getHeureD() {
          return heureD;  
}

public String getCodeP() {
          return codeP;  
}

public String getcodeS() {
          return codeS;  
}

public String getDateRemise() {
          return dateRemise;  
}

public int getCoef() {
          return coef;  
}

//MUTATEURS

 public void setNom_s(String nom_s) {
      this.nom_s = nom_s;
    }
  public void setCodeSa(String codeSa) {
      this.codeSa = codeSa;
    }

    public void setPrenom_s(String prenom_s) {
      this.prenom_s= prenom_s;
    }

    public void setAdresse_s(String adresse_s) {
      this.adresse_s = adresse_s;
    }

    public void setNom_p(String nom_p) {
      this.nom_p = nom_p;
    }

    public void setPrenom_p(String prenom_p) {
      this.prenom_p = prenom_p;
    }

    public void setAdresse_p(String adresse_p) {
      this.adresse_p = adresse_p;
    }

    public void setCodeF(String codeF) {
      this.codeF = codeF;
    }


    public void setNom_f(String nom_f) {
      this.nom_f = nom_f;
    }

    public void setNom_m(String nom_m) {
      this.nom_m = nom_m;
    }

    public void setCodeCl(String codeCl) {
      this.codeCl = codeCl;
    }

    public void setNiveau(String niveau) {
      this.niveau = niveau;
    }

    public void setCodeM(String codeM) {
      this.codeM = codeM;
    }

    public void setCodeD(String codeD) {
      this.codeD = codeD;
    }

    public void setDateD(String dateD) {
      this.dateD = dateD;
    }

    public void setHeureD(String heureD) {
      this.heureD = heureD;
    }

    public void setCodeP(String codeP) {
      this.codeP = codeP;
    }

    public void setCodeS(String codeS) {
      this.codeS = codeS;
    }

    public void setDateRemise(String dateRemise) {
      this.dateRemise = dateRemise;
    }

    public void setCoef(int coef) {
      this.coef = coef;
    }

}
