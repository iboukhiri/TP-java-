import java.util.function.Predicate;

class Candidat {
    int age;
    int score;

    public Candidat(int age, int score) {
        this.age = age;
        this.score = score;
    }
}

public class Exercice6 {
    public static void main(String[] args) {
        Predicate<Integer> majeur = age -> age >= 18;
        Predicate<Integer> ageMaximal = age -> age <= 30;
        Predicate<Integer> scoreValide = score -> score >= 60;

        Predicate<Integer> ageValide = majeur.and(ageMaximal);

        Predicate<Candidat> testAge = candidat -> ageValide.test(candidat.age);
        Predicate<Candidat> testScore = candidat -> scoreValide.test(candidat.score);

        Predicate<Candidat> admission = testAge.and(testScore);
        Predicate<Candidat> refusAdmission = admission.negate();

        Candidat[] candidats = {
            new Candidat(20, 75),
            new Candidat(17, 80),
            new Candidat(25, 50),
            new Candidat(35, 90)
        };

        for (Candidat candidat : candidats) {
            System.out.println("Candidat (Âge: " + candidat.age + ", Score: " + candidat.score + ") :");
            System.out.println("Admission : " + admission.test(candidat));
            System.out.println("Refus d'admission : " + refusAdmission.test(candidat));

            if (refusAdmission.test(candidat)) {
                if (!testAge.test(candidat)) {
                    System.out.println("Cause du refus : Âge invalide");
                }
                if (!testScore.test(candidat)) {
                    System.out.println("Cause du refus : Score invalide");
                }
            }
            System.out.println("------------------------------------");
        }
    }
}
