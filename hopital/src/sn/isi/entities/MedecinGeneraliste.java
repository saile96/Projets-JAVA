package sn.isi.entities;

public class MedecinGeneraliste extends Medecin{
    private String listeSpecialistes;

    public MedecinGeneraliste() {
    }

    public MedecinGeneraliste(int id, String nom, String prenom, Service service, String listeSpecialistes) {
        super(id, nom, prenom, service);
        this.listeSpecialistes = listeSpecialistes;
    }

    public String getListeSpecialistes() {
        return listeSpecialistes;
    }

    public void setListeSpecialistes(String listeSpecialistes) {
        this.listeSpecialistes = listeSpecialistes;
    }
}
