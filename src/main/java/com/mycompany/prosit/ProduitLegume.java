/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prosit;

/**
 *
 * @author User
 */
public class ProduitLegume extends ProduitAgricole {
    private String[] mois={"Janvier","Février","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Décembre"};

    public ProduitLegume(String saison, float quantite, int id, String libelle) {
        super(saison, quantite, id, libelle);
    }

    @Override
    public String toString() {
        return "ProduitLegume{" + '}' + super.toString();
    }

    @Override
    public boolean estFrais(String saison) {
        int index=-1;
        for(int i=0;i<mois.length-1;i++){
            if(mois[i].equals(this.saison)){
                index=i;
            }
        }
        if(index!=-1){
            if(index==mois.length-1){
                if(mois[index].equals(saison) || mois[0].equals(saison)){
                    return true;
            }
            else {
                if(mois[index].equals(saison) || mois[index+1].equals(saison)){
                    return true;
                }   
            }
        }  
        }
        return false;
    }
    
}
