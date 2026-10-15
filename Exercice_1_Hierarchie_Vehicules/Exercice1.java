public class Exercice1 {
    static class Vehicule {
        protected String marque;
        protected int vitesse;

        public Vehicule(String marque) {
            this.marque = marque;
            this.vitesse = 0;
        }

        public void accelerer() {
            vitesse += 10;
        }

        public void freiner() {
            vitesse -= 10;
            if (vitesse < 0) {
                vitesse = 0;
            }
        }

        public void afficher() {
            System.out.println("Marque : " + marque + " | Vitesse : " + vitesse + " km/h");
        }
    }

    static class Voiture extends Vehicule {
        private int nombrePortes;

        public Voiture(String marque, int nombrePortes) {
            super(marque);
            this.nombrePortes = nombrePortes;
        }

        public void afficherDetails() {
            System.out.println("Voiture : " + marque + " | Portes : " + nombrePortes);
            afficher();
        }
    }

    static class Moto extends Vehicule {
        private boolean sidecar;

        public Moto(String marque, boolean sidecar) {
            super(marque);
            this.sidecar = sidecar;
        }

        public void afficherDetails() {
            System.out.println("Moto : " + marque + " | Sidecar : " + sidecar);
            afficher();
        }
    }

    public static void main(String[] args) {
        Voiture v = new Voiture("Renault", 4);
        Moto m = new Moto("Yamaha", false);

        v.accelerer();
        v.afficherDetails();

        m.accelerer();
        m.accelerer();
        m.afficherDetails();
    }
}
