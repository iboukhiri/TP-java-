import java.util.function.Predicate;
import java.util.function.Function;

public class Exercice1 {
    public static void main(String[] args) {
        Predicate<Integer> noteValide = note -> note >= 0 && note <= 20;

        Predicate<Integer> noteAdmise = note -> note >= 10;

        Predicate<Integer> noteValideEtAdmise = noteValide.and(noteAdmise);

        Function<Integer, String> appreciation = note -> {
            if (note >= 16) {
                return "Excellent";
            } else if (note >= 10) {
                return "Validé";
            } else {
                return "À revoir";
            }
        };

        int[] notes = {-2, 8, 14, 18};

        for (int note : notes) {
            System.out.println("Note : " + note);
            System.out.println("Est valide : " + noteValide.test(note));
            System.out.println("Est admise : " + noteAdmise.test(note));
            System.out.println("Est valide et admise : " + noteValideEtAdmise.test(note));

            if (noteValide.test(note)) {
                System.out.println("Appréciation : " + appreciation.apply(note));
            } else {
                System.out.println("Appréciation : Invalide (hors intervalle [0, 20])");
            }
            System.out.println("------------------------------------");
        }
    }
}
