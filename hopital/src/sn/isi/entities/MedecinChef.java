package sn.isi.entities;

public class MedecinChef extends Medecin{
   private String bureau;

    public MedecinChef() {
    }

    public MedecinChef(int id, String nom, String prenom, Service service, String bureau) {
        super(id, nom, prenom, service);
        this.bureau = bureau;
    }

    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }
}
