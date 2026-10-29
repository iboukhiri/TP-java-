import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Exercice3 {
    public static void main(String[] args) {
        Predicate<Double> estAdmis = moyenne -> moyenne >= 10.0;

        Function<String, String> nomEnMajuscules = nom -> nom.toUpperCase();

        Function<Double, String> messageStatut = moyenne -> {
            if (moyenne >= 10.0) {
                return "Admis";
            } else {
                return "Rattrapage";
            }
        };

        Consumer<String> afficherBilan = message -> System.out.println("Bilan : " + message);

        Supplier<Double> moyenneParDefaut = () -> 0.0;

        String nom = "Sara";
        double moyenne = 13.5;

        String nomMaj = nomEnMajuscules.apply(nom);
        boolean resultatAdmis = estAdmis.test(moyenne);
        String statut = messageStatut.apply(moyenne);

        afficherBilan.accept(nomMaj + " a obtenu la moyenne " + moyenne + " - Statut : " + statut + " (Admis = " + resultatAdmis + ")");

        double defaut = moyenneParDefaut.get();
        afficherBilan.accept("Moyenne par défaut = " + defaut);
    }
}
