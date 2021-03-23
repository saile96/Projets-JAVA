package main;

import sn.isi.dao.EtudiantDB;
import sn.isi.entities.Etudiant;

public class Main {
    public static void main(String[] args) {
        EtudiantDB eDB = new EtudiantDB();
        eDB.infoEtudiant();
    }
}
