import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employe {
    String nom;
    double salaire;

    public Employe(String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public double getSalaire() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Employe{nom='" + nom + "', salaire=" + salaire + "}";
    }
}

public class Exercice9 {
    public static void main(String[] args) {
        List<Employe> employes = new ArrayList<>();
        employes.add(new Employe("Ali", 7000.0));
        employes.add(new Employe("Sara", 5000.0));
        employes.add(new Employe("Omar", 5000.0));
        employes.add(new Employe("Zineb", 9000.0));

        System.out.println("--- Liste avant le tri ---");
        for (Employe e : employes) {
            System.out.println(e);
        }

        Comparator<Employe> triSalaireDecroissant = (e1, e2) -> Double.compare(e2.getSalaire(), e1.getSalaire());
        employes.sort(triSalaireDecroissant);

        System.out.println("\n--- Liste après tri par salaire décroissant (lambda) ---");
        for (Employe e : employes) {
            System.out.println(e);
        }

        Comparator<Employe> triAmeliore = Comparator.comparing(Employe::getSalaire)
                                                    .reversed()
                                                    .thenComparing(Employe::getNom);
        employes.sort(triAmeliore);

        System.out.println("\n--- Liste après tri amélioré (salaire décroissant puis nom alphabétique) ---");
        for (Employe e : employes) {
            System.out.println(e);
        }
    }
}
