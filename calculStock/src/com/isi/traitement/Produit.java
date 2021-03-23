package com.isi.traitement;

import java.util.Scanner;

public class Produit {
    private int qtE;
    private int prixE;
    private int qteS;
    private int prixS;
    private int stock;
    public void calcul(){
        Scanner scanner = new Scanner(System.in);
        String rep =null;
        stock = 0;
        do {
            do {
            System.out.println("Voulez-vous saisir une entrée ou une sortie e/s");
            rep = scanner.nextLine();
            if (rep.equalsIgnoreCase("e"))
            {
                System.out.println("Saisir la quantité en entrée");
                qtE = Integer.parseInt(scanner.nextLine());
                System.out.println("Saisir le prix en entrée");
                prixE = Integer.parseInt(scanner.nextLine());
                stock = stock + qtE;
            }
            else if (rep.equalsIgnoreCase("s"))
            {
                System.out.println("Saisir la quantité en sortie");
                qteS = Integer.parseInt(scanner.nextLine());
                System.out.println("Saisir le prix en sortie");
                prixS = Integer.parseInt(scanner.nextLine());
                if (stock > qteS)
                {
                    stock = stock - qteS;
                }else
                {
                    System.out.println("Le stock n'est pas disponible");
                }

            }
            else
            {
                rep = "n";
            }
            }while (rep.equalsIgnoreCase("n"));
            System.out.println("Voulez-vous continue!!!");
            rep = scanner.nextLine();
        }while(rep.equalsIgnoreCase("oui"));
        System.out.println("Le stock global est de : "+stock);
    }
}
