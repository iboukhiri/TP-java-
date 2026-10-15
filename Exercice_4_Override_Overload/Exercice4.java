public class Exercice4 {
    static class Calcul {
        public int additionner(int a, int b) {
            return a + b;
        }

        public double additionner(double a, double b) {
            return a + b;
        }

        public int additionner(int a, int b, int c) {
            return a + b + c;
        }
    }

    static class Vehicule {
        public void deplacer() {
            System.out.println("Le véhicule avance");
        }
    }

    static class Voiture extends Vehicule {
        @Override
        public void deplacer() {
            System.out.println("La voiture avance");
        }
    }

    public static void main(String[] args) {
        Calcul calc = new Calcul();

        System.out.println("Addition int : " + calc.additionner(3, 5));
        System.out.println("Addition double : " + calc.additionner(2.5, 3.5));
        System.out.println("Addition 3 entiers : " + calc.additionner(1, 2, 3));

        System.out.println("\n=== Override ===");
        Vehicule v = new Vehicule();
        Vehicule voiture = new Voiture();

        v.deplacer();
        voiture.deplacer();
    }
}
