/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prosit;

/**
 *
 * @author User
 */
public class Vendeur extends Employee {
    int TAUX_Vente;
    public Vendeur(int id, String nom, String adresse, int nbr_heures,int TAUX_Vente) {
        super(id);
      
        this.TAUX_Vente = TAUX_Vente;
    }
     @Override
    public String toString() {
        return "Vendeur{" + "id=" + getId() + ", nom=" + getNom() + ", adresse=" + getAdresse() + ", nbr_h= " + getNbr_heures() + " tauxDeVente= " + TAUX_Vente + '}';
    }
    
     public void salaire(){
     float  total;
     float taux= (this.TAUX_Vente)/100;
     total=450 * taux;
        System.out.println("Salaire vendeur = "+total);
        
    }

    
}
