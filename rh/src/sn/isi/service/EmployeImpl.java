package sn.isi.service;

import sn.isi.entities.Employe;
import sn.isi.entities.Personne;
import sn.isi.entities.Service;

import java.util.Scanner;

public class EmployeImpl  implements IEmploye{
private Scanner scanner = new Scanner(System.in);
    @Override
    public Employe saisie() {
        Employe e = new Employe();
        Service service = new Service();
        System.out.println("EntrerL'id du service");
        service.setIdService(Integer.parseInt(scanner.nextLine()));
        System.out.println("Entrer le nom du service");
        service.setNomService(scanner.nextLine());
        System.out.println("Entrer votre id");
        e.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Entrer votre nom");
        e.setNom(scanner.nextLine());
        System.out.println("Entrer votre prenom");
        e.setPrenom(scanner.nextLine());
        System.out.println("Entrer votre email");
        e.setEmail(scanner.nextLine());
        System.out.println("Entrer votre password");
        e.setPassword(scanner.nextLine());
        System.out.println("Entrer l'etat");
        e.setEtat(Integer.parseInt(scanner.nextLine()));
        e.setService(service);
        return e;
    }

    @Override
    public void afficher(Employe e) {
        System.out.println("l'identifiant est : "+e.getId());
        System.out.println("le nom est : "+e.getNom());
        System.out.println("le prenom est : "+e.getPrenom());
        System.out.println("l' email est : "+e.getEmail());
        System.out.println("le password  est : "+e.getPassword());
        System.out.println("l'etat est : "+e.getEtat());
        System.out.println("L'id service de l'employe est :"+e.getService().getIdService());
        System.out.println("Le nom du service de l'employe est :"+e.getService().getNomService());

    }
}
