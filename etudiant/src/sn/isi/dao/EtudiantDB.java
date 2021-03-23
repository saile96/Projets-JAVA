package sn.isi.dao;

import sn.isi.entities.Etudiant;

import java.util.Scanner;

public class EtudiantDB  {
public void infoEtudiant (){
        System.out.println("Etudiant créé");
        DB d = new DB();
         d.message();
        Etudiant e = new Etudiant();
//Saisie
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le matricule de l'étudiant");
        e.setMat(scanner.nextLine());
        System.out.println("Entrer le nom de l'étudiant");
        e.setNom(scanner.nextLine());
        System.out.println("Entrer le prenom de l'étudiant");
        e.setPrenom(scanner.nextLine());
//Affichage

        System.out.println("Le matricule de l'étudiant est : "+e.getMat());
        System.out.println("Le nom de l'étudiant est : "+e.getNom());
        System.out.println("Le prénom de l'étudiant est : "+e.getPrenom());
    }

}
