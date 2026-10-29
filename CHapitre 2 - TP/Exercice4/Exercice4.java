import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Exercice4 {
    public static void main(String[] args) {
        Function<String, Integer> conversionLambda = texte -> Integer.parseInt(texte);
        Function<String, Integer> conversionReference = Integer::parseInt;

        Consumer<String> affichageLambda = texte -> System.out.println(texte);
        Consumer<String> affichageReference = System.out::println;

        Function<String, String> nettoyageLambda = texte -> texte.trim();
        Function<String, String> nettoyageReference = String::trim;

        Supplier<List<String>> listeLambda = () -> new ArrayList<>();
        Supplier<List<String>> listeReference = ArrayList::new;

        int nombreLambda = conversionLambda.apply("150");
        int nombreReference = conversionReference.apply("250");
        affichageReference.accept("Nombre (lambda) : " + nombreLambda);
        affichageReference.accept("Nombre (référence) : " + nombreReference);

        affichageLambda.accept("Affichage via Consumer lambda");
        affichageReference.accept("Affichage via Consumer référence");

        String texteOriginal = "   Java Avancé   ";
        String texteNettoyeLambda = nettoyageLambda.apply(texteOriginal);
        String texteNettoyeReference = nettoyageReference.apply(texteOriginal);
        affichageReference.accept("Texte nettoyé (lambda) : [" + texteNettoyeLambda + "]");
        affichageReference.accept("Texte nettoyé (référence) : [" + texteNettoyeReference + "]");

        List<String> messages = listeReference.get();
        messages.add("Message 1");
        messages.add("Message 2");
        affichageReference.accept("Liste créée : " + messages);
    }
}
