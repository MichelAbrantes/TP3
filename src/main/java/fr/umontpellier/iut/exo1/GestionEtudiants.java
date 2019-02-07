package fr.umontpellier.iut.exo1;

import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {

    public static void main(String[] args) {
        Etudiant lolo, toto;
        lolo = new Etudiant("lolo", "lolo", "lolo@gmail.com", "13 rue de Lolo", LocalDate.of(2000, Month.JANUARY, 1));
        System.out.println(lolo.toString());

        toto = new Etudiant("lolo", "lolo", "lolo@gmail.com", "13 rue de Lolo", LocalDate.of(2000, Month.JANUARY, 1));
        System.out.println(toto.toString());

        if (lolo == toto) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        toto = lolo;
        if (lolo == toto) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        toto.setNom("momo", "momo");
        System.out.println(toto.toString());
        System.out.println(lolo.toString());
    }
}
