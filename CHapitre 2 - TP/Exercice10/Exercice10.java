import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Exercice10 {
    public static void main(String[] args) {
        Predicate<String> codeValide = code -> code != null && !code.trim().isEmpty();

        Function<String, String> nettoyer = String::trim;
        Function<String, String> majuscules = String::toUpperCase;

        Function<String, String> pipeline = nettoyer.andThen(majuscules);

        Consumer<String> afficherDossier = dossier -> System.out.println("Dossier traité : " + dossier);

        String[] dossiers = {"ab-12", "cd-34", "   ", null};

        for (String dossier : dossiers) {
            if (codeValide.test(dossier)) {
                String codeFinal = pipeline.apply(dossier);
                afficherDossier.accept(codeFinal);
            } else {
                System.out.println("Code rejeté : [" + dossier + "] -> Le code ne doit être ni null ni vide.");
            }
        }
    }
}
