/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prosit;

/**
 *
 * @author User
 */
public class ProduitFruit  extends ProduitAgricole {

    public ProduitFruit(String saison, float quantite, int id, String libelle) {
        super(saison, quantite, id, libelle);
    }

    @Override
    public String toString() {
        return "ProduitFruit{" + '}' + super.toString();
    }

    public boolean estFrais(String saison) {
        return this.saison.equals(saison);
    }

    
    }
    
