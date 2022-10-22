/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prosit;


/**
 *
 * @author User
 */
public class Prosit {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // TODO code application logic here
        Produit p1 = new Produit();
        Produit p2 = new Produit(1021, "lait", "delice");
        Produit p3 = new Produit(2510, "Yaourt", "vitalait");
        Produit p4 = new Produit(3250, "tomate", "sicam", 1.2f);

        p2.prix = 0.7f;
     Magasin aziza = new Magasin(1, "ESPRIT ", "centre-ville");

        aziza.ajouterProduit(p4);
        aziza.ajouterProduit(p3);
        aziza.ajouterProduit(p2);
        aziza.ajouterProduit(new Produit(2, "tomate", "tomate"));

    
         Magasin mg = new Magasin();   
         
        Magasin mg1 = new Magasin(1, "carrefour", "centre-ville");
        Magasin mg2 = new Magasin(2, "Monoprix", "menzah 6");
        Caissier c1 = new Caissier(1, "css1", "adr1", 18, 10);
        Caissier c2 = new Caissier(2, "css2", "adr2", 18 , 10);
        Vendeur v1 = new Vendeur(1, "vend1", "adr3", 15 , 20);
        Responsable r1 = new Responsable(1, "chef", "adr4", 12, 40.0);
        
        Caissier c3 = new Caissier(1, "css3", "adr5", 18 , 10);
        Vendeur v2 = new Vendeur(2, "vend2", "adr6", 15, 20);
        Vendeur v3 = new Vendeur(3, "vend3", "adr7", 15, 20);
        Vendeur v4 = new Vendeur(4, "vend4", "adr8", 15, 20);
        Responsable r2 = new Responsable(11, "azerty", "tunis", 150, 30.0);
        mg1.ajouterProduit(p2);
        mg1.ajouterProduit(p3);
        mg1.ajouterProduit(p4);
        
         
        mg1.AjouterEmployee(c1); 
        mg1.AjouterEmployee(c2);
        mg1.AjouterEmployee(r1);
        mg1.AjouterEmployee(v1);
        
        System.out.println(mg1);
        System.out.println("****************************************");
        Produit produit1= new ProduitFruit("Mars",12.3f,1254,"Fraise");
        Produit produit2= new ProduitFruit("Juin",50,1224,"Pastèque");
        Produit produit3= new ProduitLegume("Janvier",14,8521,"Artichauts");
        
        mg1.ajouterProduit(produit1);
        mg1.ajouterProduit(produit2);
        mg1.ajouterProduit(produit3);
        System.out.println(mg1);
     
    }
    
     
    }

