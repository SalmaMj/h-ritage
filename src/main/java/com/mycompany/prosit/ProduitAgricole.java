/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prosit;

/**
 *
 * @author User
 */
public abstract class ProduitAgricole extends Produit implements Critere {
    String saison;

    public ProduitAgricole(String saison, float quantite, int id, String libelle) {
       
        this.saison = saison;
    }

    private ProduitAgricole(float quantite, int id, String libele) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "ProduitAgricole{" + "saison=" + saison + '}' + super.toString();
    }

    @Override
    public abstract boolean estFrais(String saison);
    
    
}
