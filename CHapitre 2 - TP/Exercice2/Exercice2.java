@FunctionalInterface
interface Operation {
    double appliquer(double a, double b);
}

public class Exercice2 {

    public static void afficherResultat(double a, double b, String libelle, Operation operation) {
        if (libelle.equalsIgnoreCase("Division") && b == 0) {
            System.out.println(libelle + " : Erreur, le diviseur est nul !");
            return;
        }
        double resultat = operation.appliquer(a, b);
        System.out.println(libelle + " de " + a + " et " + b + " = " + resultat);
    }

    public static void main(String[] args) {
        Operation addition = (double a, double b) -> a + b;
        Operation soustraction = (double a, double b) -> a - b;
        Operation multiplication = (double a, double b) -> a * b;
        Operation division = (double a, double b) -> a / b;

        afficherResultat(18, 3, "Addition", addition);
        afficherResultat(18, 3, "Soustraction", soustraction);
        afficherResultat(18, 3, "Multiplication", multiplication);
        afficherResultat(18, 3, "Division", division);

        afficherResultat(18, 0, "Division", division);
    }
}
