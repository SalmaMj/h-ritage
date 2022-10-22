/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prosit;

/**
 *
 * @author User
 */
public class Caissier extends Employee {
    int  num_caisse;
    public Caissier(int id, String nom, String adresse, int nbr_heures,int  num_caisse) {
        super(id);
        this.num_caisse=num_caisse;
        
    }
   @Override
    public String toString() {
        return "Caissier{"+ "id=" + getId() + ", nom=" + getNom() + ", adresse=" + getAdresse() + ", nbr_h= " + getNbr_heures()  + " num_caisse= " + num_caisse + '}';
    }
    
    
     public void salaire(){
         int   nb_h_sup=0;
       if(getNbr_heures()>180) { 
        nb_h_sup=getNbr_heures()-180;}
       
     
     Double total= ((getNbr_heures())*5)+(nb_h_sup*5)*0.15;
        System.out.println("Salaire = "+total);
        
    } 
}
