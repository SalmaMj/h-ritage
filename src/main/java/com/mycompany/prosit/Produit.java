/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prosit;

/**
 *
 * @author User
 */
public class Produit {
    private  int id;
    private  String libelle, marque;
    float prix;
    private int capacité;

    public Produit() {
    }

    public Produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }

    public Produit(int id, String libelle, String marque, float prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        if(prix>=0)
        this.prix = prix;
    }
    public String getLibelle (){
        return this.libelle;
    }
    
    public float getPrix (){
        return this.prix;
    }
    void afficher() {

        System.out.println("le produit est id = " + this.id + "\nlibelle " + this.libelle + "\nmarque" + marque + "\nprix" + this.prix);
    }

    @Override
    public String toString() {
        return "le produit est id = " + this.id + "\nlibelle " + this.libelle + "\nmarque" + marque + "\nprix" + this.prix;
    }
     Magasin mg = new Magasin();   
 
      public boolean comparer (Produit p){
      return  
      (this.id == p.id)&&(this.libelle==p.libelle)&&(this.prix==p.prix);
}//

public boolean rechercher (Produit p) {
boolean resultat = false ;
int i =0;
while ((resultat)&& (i<this.capacité)){
   resultat = comparer (p);
i++ ;
}
return resultat;
}

    boolean getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    float getQuantite() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    
    
}
   


