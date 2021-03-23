package main;

import sn.isi.entities.Medecin;
import sn.isi.entities.MedecinChef;
import sn.isi.entities.MedecinGeneraliste;
import sn.isi.entities.MedecinSpecialiste;
import sn.isi.traitement.*;


public class Main {
    public static void main(String[] args) {
        IMedecin medecin = new MedecinImp();
        Medecin m = medecin.saisie();
        medecin.afficher(m);
    }
}
