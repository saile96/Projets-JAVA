package sn.isi.entities;

public class Specialite {
    public Specialite(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private String nom;

    public Specialite() {
    }
}
