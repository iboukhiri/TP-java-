public class Exercice3 {
    static class Personne {
        private String nom;

        public Personne() {
            System.out.println("Constructeur de Personne sans paramètre");
        }

        public Personne(String nom) {
            this.nom = nom;
            System.out.println("Constructeur de Personne avec nom : " + nom);
        }

        public String getNom() {
            return nom;
        }

        public void afficher() {
            System.out.println("Nom : " + nom);
        }
    }

    static class Etudiant extends Personne {
        private int annee;

        public Etudiant(String nom) {
            super(nom);
            System.out.println("Constructeur de Etudiant avec nom : " + nom);
        }

        public Etudiant(String nom, int annee) {
            this(nom);
            this.annee = annee;
        }

        public void afficherEtudiant() {
            System.out.println("Étudiant : " + getNom() + " | Année : " + annee);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Test 1 ===");
        Personne p1 = new Personne();
        p1.afficher();

        System.out.println("\n=== Test 2 ===");
        Personne p2 = new Personne("Alice");
        p2.afficher();

        System.out.println("\n=== Test 3 ===");
        Etudiant e = new Etudiant("Sami", 2);
        e.afficherEtudiant();
    }
}
