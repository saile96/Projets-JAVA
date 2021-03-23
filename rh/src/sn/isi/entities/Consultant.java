package sn.isi.entities;

public class Consultant extends  Personne{
    private int nbheure;
    private double tauxHoraire;

    public Consultant(int id, String nom, String prenom, String email, String password, int etat) {
        super(id, nom, prenom, email, password, etat);
    }

    public Consultant() {
    }

    public int getNbheure() {
        return nbheure;
    }

    public void setNbheure(int nbheure) {
        this.nbheure = nbheure;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }
}
