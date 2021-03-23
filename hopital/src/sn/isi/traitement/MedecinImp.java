package sn.isi.traitement;

import sn.isi.entities.*;

import java.util.Scanner;

public class MedecinImp implements IMedecin{
    private Scanner scanner =new Scanner(System.in);

    @Override
    public Medecin saisie() {
        Service service = new Service();
        System.out.println("----------------------------------------");
        System.out.println("*************Ajoutez un medecin*********");
        System.out.println("----------------------------------------");
        Medecin m= null ;
        System.out.println("***************************************************************");
        System.out.println("----------------Veuillez choisir un medecin--------------------");
        System.out.println("----------------1.MEDECIN CHEF---------------------------------");
        System.out.println("------------------2.MEDECIN GENERALISTE------------------------");
        System.out.println("--------------------3.MEDECIN SPECIALISTE----------------------");
        System.out.println("***************************************************************");

        int menuAccueil = Integer.parseInt(scanner.nextLine());
        switch (menuAccueil){
            case 1 :
            {
                m = new MedecinChef();
                infosMedecin(m, service);
                System.out.println("Entrer le bureau du medecin");
                ((MedecinChef)m).setBureau(scanner.nextLine());
                m.setService(service);
            }
                break;
            case 2 :
            {
                m = new MedecinGeneraliste();
                infosMedecin(m, service);
                System.out.println("Entrer les specialistes du medecin");
                ((MedecinGeneraliste)m).setListeSpecialistes(scanner.nextLine());
                m.setService(service);
            }
                break;

            case 3 :
            {

                m = new MedecinSpecialiste();
                infosMedecin(m, service);
                System.out.println("Entrer les specialistes du medecin");
                ((MedecinSpecialiste)m).setSpecialite(scanner.nextLine());
                m.setService(service);
            }
                break;

            default:
                System.out.println("Choix non disponible veuillez faire un bon choix svp !!!");
        }
        return m;
        }

    private void infosMedecin(Medecin m, Service service) {
        System.out.println("Entrer l'id du medecin");
        m.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Entrer le nom du medecin");
        m.setNom(scanner.nextLine());
        System.out.println("Entrer le prenom du medecin");
        m.setPrenom(scanner.nextLine());
        System.out.println("Entrer L'id du service du medecin");
        service.setIdService(Integer.parseInt(scanner.nextLine()));
        System.out.println("Entrer le nom du service du medecin");
        service.setNomService(scanner.nextLine());
        m.setService(service);
    }


    @Override
    public void afficher(Medecin m) {
        System.out.println("l'identifiant du medecin est : "+m.getId());
        System.out.println("le nom du medecin est : "+m.getNom());
        System.out.println("le prenom du medecin est : "+m.getPrenom());
        System.out.println("L'id du service du medecin est :"+m.getService().getIdService());
        System.out.println("Le nom du service du medecin est :"+m.getService().getNomService());
        if (m instanceof MedecinChef)
        {
            System.out.println("Le bureau du medecin chef est : "+((MedecinChef)m).getBureau());
        }
        if (m instanceof MedecinGeneraliste)
        {
            System.out.println("La liste des specialites du medecin generaliste  du medecin est :"+((MedecinGeneraliste)m).getListeSpecialistes());
        }
        if (m instanceof MedecinSpecialiste)
        {
            System.out.println("Le bureau du medecin est :"+((MedecinSpecialiste)m).getSpecialite());
        }



    }


}
