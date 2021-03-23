package sn.isi.entities;

public abstract class Medecin extends Personne{
    Service service;

    public Medecin() {
    }

    public Medecin(int id, String nom, String prenom, Service service) {
        super(id, nom, prenom);
        this.service = service;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
