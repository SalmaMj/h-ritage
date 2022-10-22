/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prosit;

/**
 *
 * @author User
 */
public class Responsable extends Employee {
       Double prime;
    public Responsable(int id, String nom, String adresse, int nbr_heures,double prime) {
           
        super(id);
        this.prime=prime;
    }
        @Override
    public String toString() {
        return "Responsable{"+ "id=" + getId() + ", nom=" + getNom() + ", adresse=" + getAdresse() + ", nbr_h= "  + getNbr_heures()  + " prime= " + prime + '}';
    }
    
    public void salaire(){
     int   nb_h_sup=0;
       if(getNbr_heures() >160) { 
        nb_h_sup=getNbr_heures() -160;}
       
     Double total= ((getNbr_heures())*10)+(nb_h_sup*10)*0.2;
        System.out.println("Salaire resonsable = "+total);
        
    }
    
}
