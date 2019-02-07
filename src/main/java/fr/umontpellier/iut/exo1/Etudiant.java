package fr.umontpellier.iut.exo1;
import java.time.LocalDate;

public class Etudiant {

    private String nom;
    private String prenom;
    private String adresseMail;
    private String adressePostale;
    private LocalDate dateNaissance;

    public Etudiant(String nom, String prenom, String adresseMail, String adressePostale, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresseMail = adresseMail;
        this.adressePostale = adressePostale;
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresseMail='" + adresseMail + '\'' +
                ", adressePostale='" + adressePostale + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }

    public void setNom(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
