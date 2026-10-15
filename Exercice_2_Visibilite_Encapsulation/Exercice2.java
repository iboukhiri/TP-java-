public class Exercice2 {
    static class Personne {
        private String nom;
        private int age;

        public Personne(String nom, int age) {
            this.nom = nom;
            this.age = age;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age >= 0) {
                this.age = age;
            } else {
                System.out.println("L'âge ne peut pas être négatif.");
            }
        }

        public void afficherInformations() {
            System.out.println("Nom : " + nom + " | Age : " + age);
        }
    }

    static class Etudiant extends Personne {
        private String filiere;

        public Etudiant(String nom, int age, String filiere) {
            super(nom, age);
            this.filiere = filiere;
        }

        public void afficherEtudiant() {
            System.out.println("Nom : " + getNom() + " | Age : " + getAge() + " | Filière : " + filiere);
        }
    }

    public static void main(String[] args) {
        Personne p = new Personne("Alice", 20);

        System.out.println(p.getNom());
        p.setAge(25);
        p.afficherInformations();

        p.setAge(-5);

        Etudiant e = new Etudiant("Sami", 19, "Informatique");
        e.afficherEtudiant();
    }
}
