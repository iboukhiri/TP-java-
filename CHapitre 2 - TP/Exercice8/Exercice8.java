import java.util.function.Function;

public class Exercice8 {
    public static void main(String[] args) {
        Function<String, String> nettoyer = String::trim;
        Function<String, String> majuscules = String::toUpperCase;
        Function<String, String> ajouterPrefixe = texte -> "CMD-" + texte;

        Function<String, String> pipelineAndThen = nettoyer.andThen(majuscules).andThen(ajouterPrefixe);
        Function<String, String> pipelineCompose = ajouterPrefixe.compose(majuscules).compose(nettoyer);

        String commande = "  ab-204  ";

        String resultatAndThen = pipelineAndThen.apply(commande);
        String resultatCompose = pipelineCompose.apply(commande);

        System.out.println("Commande brute : [" + commande + "]");
        System.out.println("Résultat avec andThen() : [" + resultatAndThen + "]");
        System.out.println("Résultat avec compose() : [" + resultatCompose + "]");
        System.out.println("Les deux résultats sont-ils identiques ? " + resultatAndThen.equals(resultatCompose));
    }
}
