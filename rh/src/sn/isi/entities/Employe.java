package sn.isi.entities;

import sn.isi.entities.Personne;

public class Employe extends Personne {
    public Service getService() {
        return service;
    }

    public Employe() {
    }

    public Employe(int id, String nom, String prenom, String email, String password, int etat, Service service) {
        super(id, nom, prenom, email, password, etat);
        this.service = service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    private  Service service;

}
