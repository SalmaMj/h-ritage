/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prosit;

/**
 *
 * @author User
 */
public class Magasin {
    private int id ;
    private String adresse ;
    private int capacite; 
    private Produit[] produits;
    private Employee[] employees;
    
    
public  Magasin(){
      this.produits= new Produit[50];
   
}    
public Magasin (int id, String adresse, String centreville){
    this.id=id;
    this.adresse= adresse ;
    this.capacite=0;
     this.produits= new Produit[50];
}
public void ajouterProduit (Produit p){
    if (this.capacite<50){
    
    //tab[i]=2;    
    produits[this.capacite]=p;
    this.capacite++;
    }else 
    {
        System.out.println("Tableau plient .....");
    }
}


      @Override
      public String toString (){
    String str ="";
    for (int i =0 ; i<this.capacite;i++){
        //str=str+"7ajja"
        str+="\n nom  "+produits[i].getLibelle()+"  Prix"+produits[i].getPrix();
    }
    
    
    return "le maginsin  id :"+this.id+"\nadresse "+this.adresse+"\n Produit "+str;
   
}
public void ajouterEmployee(Employee e) {

        if (this.getNbrEmployee() == 20) {
            System.out.println("Tableau Employés plein");
        } else {
            employees[this.getNbrEmployee()] = e;
        }
    }

    public boolean exist(Produit p) {
        for (int i = 0; i < getNbrProduit(); i++) {
            if (Magasin.comparer(this.produits[i], p)) {
                return true;
            }
        }
        return false;
    }

    public int getIndex(Produit p) {
        if (this.exist(p)) {
            for (int i = 0; i < getNbrProduit(); i++) {
                if (Magasin.comparer(this.produits[i], p)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean comparer(Produit p1, Produit p2) {
        if (p1.getId() == p2.getId() && p1.getLibelle().equals(p2.getLibelle()) && p1.getPrix() == p2.getPrix()) {
            return true;
        }
        return false;
    }

    public boolean supprimer(Produit p) {
        if (this.getIndex(p) != -1) {
            for (int i = this.getIndex(p); i < this.getNbrProduit(); i++) {
                this.produits[i] = this.produits[i + 1];
            }
            this.produits[this.getNbrProduit()] = null;
            return true;
        }
        return false;
    }

    public String ToString() {
        String result = "";
        //System.out.println(produits.length);
        for (int i = 0; i < produits.length; i++) {
            if (produits[i] != null) {
                result += "\n " + produits[i].toString();
            }
        }
        String emp = "";
        for (int i = 0; i < getNbrEmployee(); i++) {
            if (employees[i] != null) {
                emp += "\n " + employees[i];
            }
        }

        return ("ID: " + this.id + " Adresse: " + this.adresse
                + " Capacité: " + this.capacite + "\n" + " Ensemble Produits: " + result + "\n"
                + " Ensemble Employés: " + emp);

    }

    public float calculStock() {
        float total = 0;
        for (int i = 0; i < getNbrProduit(); i++) {
            //if(this.produits[i].getClass().equals(ProduitFruit.class))
            if (this.produits[i] instanceof ProduitFruit) {
                total = +this.produits[i].getQuantite();
            }
        }
        return total;
    }
        public void AjouterEmployee(Employee e) {

        if (this.getNbrEmployee() == 20) {
            System.out.println("Tableau Employés plein");
        } else {
            employees[this.getNbrEmployee()] = e;
        }
    }

    public boolean Exist(Produit p) {
        for (int i = 0; i < getNbrProduit(); i++) {
            if (Magasin.comparer(this.produits[i], p)) {
                return true;
            }
        }
        return false;
    }

    public int GetIndex(Produit p) {
        if (this.exist(p)) {
            for (int i = 0; i < getNbrProduit(); i++) {
                if (Magasin.comparer(this.produits[i], p)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean Comparer(Produit p1, Produit p2) {
        if (p1.getId() == p2.getId() && p1.getLibelle().equals(p2.getLibelle()) && p1.getPrix() == p2.getPrix()) {
            return true;
        }
        return false;
    }

    public boolean Supprimer(Produit p) {
        if (this.getIndex(p) != -1) {
            for (int i = this.getIndex(p); i < this.getNbrProduit(); i++) {
                this.produits[i] = this.produits[i + 1];
            }
            this.produits[this.getNbrProduit()] = null;
            return true;
        }
        return false;
    }

   
    public String tostring() {
        String result = "";
        //System.out.println(produits.length);
        for (int i = 0; i < produits.length; i++) {
            if (produits[i] != null) {
                result += "\n " + produits[i].toString();
            }
        }
        String emp = "";
        for (int i = 0; i < getNbrEmployee(); i++) {
            if (employees[i] != null) {
                emp += "\n " + employees[i];
            }
        }

        return ("ID: " + this.id + " Adresse: " + this.adresse
                + " Capacité: " + this.capacite + "\n" + " Ensemble Produits: " + result + "\n"
                + " Ensemble Employés: " + emp);

    }

    public float CalculStock() {
        float total = 0;
        for (int i = 0; i < getNbrProduit(); i++) {
            //if(this.produits[i].getClass().equals(ProduitFruit.class))
            if (this.produits[i] instanceof ProduitFruit) {
                total = +this.produits[i].getQuantite();
            }
        }
        return total;
    
    }

    private int getNbrEmployee() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int getNbrProduit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void AjouterEmployee(Caissier c1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    }
