import java.util.function.Predicate;

public class Exercice7 {

    public static Predicate<Integer> creerControle(int ageMinimal) {
        return age -> age >= ageMinimal;
    }

    public static void main(String[] args) {
        Predicate<Integer> regle16 = creerControle(16);
        Predicate<Integer> regle18 = creerControle(18);

        int[] ages = {15, 16, 17, 18};

        System.out.println("--- Tests des règles d'accès ---");
        for (int age : ages) {
            System.out.println("Âge : " + age);
            System.out.println("Accès règle 16 ans : " + regle16.test(age));
            System.out.println("Accès règle 18 ans : " + regle18.test(age));
            System.out.println("------------------------------------");
        }

        System.out.println("Question 37 :");
        System.out.println("La variable 'ageMinimal' peut être utilisée dans la lambda car elle est capturée depuis sa portée englobante.");
        System.out.println("En Java, toute variable locale capturée par une lambda doit être 'final' ou 'effectivement finale' (effectively final).");
        System.out.println("Si 'ageMinimal' était réaffectée dans la méthode, elle perdrait ce statut, ce qui provoquerait une erreur de compilation.");
    }
}
