package sn.isi.entities;

public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private int etat;

    public Personne() {
    }
    public  Personne (int id, String nom, String prenom, String email, String password, int etat)
    {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email= email;
        this.password= password;
        this.etat = etat;
    }

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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}
