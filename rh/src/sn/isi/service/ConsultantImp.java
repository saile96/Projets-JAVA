package sn.isi.service;

import sn.isi.entities.Consultant;
import sn.isi.entities.Personne;

import java.util.Scanner;

public class ConsultantImp implements IConsultant{
    private Scanner scanner =new Scanner(System.in);
    @Override
    public Consultant saisie() {

        Consultant c = new Consultant();

        System.out.println("Entrer votre id");
        c.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Entrer votre nom");
        c.setNom(scanner.nextLine());
        System.out.println("Entrer votre prenom");
        c.setPrenom(scanner.nextLine());
        System.out.println("Entrer votre email");
        c.setEmail(scanner.nextLine());
        System.out.println("Entrer votre password");
        c.setPassword(scanner.nextLine());
        System.out.println("Entrer l'etat");
        c.setEtat(Integer.parseInt(scanner.nextLine()));

        return c;
    }

    @Override
    public void afficher(Consultant c) {
        System.out.println("l'identifiant est : "+c.getId());
        System.out.println("le nom est : "+c.getNom());
        System.out.println("le prenom est : "+c.getPrenom());
        System.out.println("l' email est : "+c.getEmail());
        System.out.println("le password  est : "+c.getPassword());
        System.out.println("l'etat est : "+c.getEtat());

    }
}
