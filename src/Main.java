import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Personne personne = new Personne();
        personne.setNom("NIANG");
        personne.setPrenom("PAPE");
        personne.setMatricule("344");
        personne.setAge(23);
        personne.setDateNaissance(29,9,2000);
        System.out.println(personne.toString());


    }
}