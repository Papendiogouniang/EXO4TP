import java.time.LocalDate;
import java.util.Date;

public class Personne {

    protected String nom;
    protected String prenom;
    private   String matricule;
    private int age;
    private Date dateNaissance;


    public Personne(String nom, String prenom, String matricule, int age, Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.age = age;
        this.dateNaissance = dateNaissance;
    }

    public Personne() {

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

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", matricule='" + matricule + '\'' +
                ", age=" + age +
                ", DateNaissance=" + dateNaissance +
                '}';
    }

    private String generateMatricule() {

        return null;
    }

    // Méthode pour calculer l'âge
    private int calculateAge() {
        LocalDate currentDate = LocalDate.now();

        return 0;
    }


    public void displayDetails() {
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Matricule: " + matricule);
        System.out.println("Âge: " + age + " ans");
        System.out.println("Date de naissance: " + dateNaissance);
    }

    public void setDateNaissance(int i, int i1, int i2) {
    }
}
