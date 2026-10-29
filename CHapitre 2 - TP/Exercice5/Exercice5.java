import java.util.function.Function;

public class Exercice5 {
    public static void main(String[] args) {
        Function<String, String> nettoyer = String::trim;
        Function<String, String> majuscules = String::toUpperCase;

        Function<String, String> pipelineAndThen = nettoyer.andThen(majuscules);
        Function<String, String> pipelineCompose = majuscules.compose(nettoyer);

        String texte = "   java avancé   ";

        String resultatAndThen = pipelineAndThen.apply(texte);
        String resultatCompose = pipelineCompose.apply(texte);

        System.out.println("Texte original : [" + texte + "]");
        System.out.println("Résultat avec andThen() : [" + resultatAndThen + "]");
        System.out.println("Résultat avec compose() : [" + resultatCompose + "]");
        System.out.println("Les deux résultats sont-ils égaux ? " + resultatAndThen.equals(resultatCompose));
    }
}
