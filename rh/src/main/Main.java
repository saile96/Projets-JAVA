package main;

import sn.isi.entities.Employe;
import sn.isi.entities.Personne;
import sn.isi.service.EmployeImpl;
import sn.isi.service.IEmploye;

public class Main {
    public static void main(String[] args) {
        IEmploye employe = new EmployeImpl();
        Employe e = employe.saisie();

        employe.afficher(e);
    }
}
