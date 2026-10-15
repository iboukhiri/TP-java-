# Exercice 2 — Visibilité et encapsulation

## Objectif

Comprendre les niveaux de visibilité en Java et pourquoi l'encapsulation est importante.

On apprend ici :
- `public`
- `private`
- `protected`
- package-private (sans modificateur)

---

## 1) Pourquoi cette notion est importante ?

En Java, on ne veut pas laisser n'importe qui modifier les données d'un objet directement.

Exemple :

```java
Personne p = new Personne();
p.age = -20;
```

Cela est mauvais, car l'âge ne peut pas être négatif.

L'encapsulation permet de protéger les données et de forcer l'utilisateur à passer par des méthodes contrôlées.

---

## 2) Les niveaux de visibilité

### `public`
Accessible depuis n'importe où.

```java
public String nom;
```

### `private`
Accessible seulement dans la classe où il est déclaré.

```java
private int age;
```

### `protected`
Accessible dans la classe, dans les classes filles et dans le même package.

```java
protected String ville;
```

### Niveau par défaut (package-private)
Pas de mot clé : accessible dans le même package.

```java
String prenom;
```

---

## 3) Explication simple avec un exemple

```java
class Personne {
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
```

### Ce que cela signifie

- `nom` et `age` sont privés
- on ne peut pas les modifier directement depuis l'extérieur
- pour les lire ou les modifier, on passe par `get...()` et `set...()`

C'est l'encapsulation.

---

## 4) Exemple d'utilisation

```java
public class Main {
    public static void main(String[] args) {
        Personne p = new Personne("Alice", 20);

        System.out.println(p.getNom());
        p.setAge(25);
        p.afficherInformations();

        p.setAge(-5);
    }
}
```

### Sortie attendue

```text
Alice
Nom : Alice | Age : 25
L'âge ne peut pas être négatif.
```

---

## 5) Pourquoi utiliser `private` ?

Parce que cela protège l'objet.

Exemple : si on laisse `age` public, n'importe où dans le code on peut écrire :

```java
p.age = -500;
```

Cela casse les règles du programme.

Avec `private`, on contrôle la donnée.

---

## 6) Exemple avec héritage : `Etudiant`

```java
class Etudiant extends Personne {
    private String filiere;

    public Etudiant(String nom, int age, String filiere) {
        super(nom, age);
        this.filiere = filiere;
    }

    public void afficherEtudiant() {
        System.out.println("Nom : " + getNom() + " | Age : " + getAge() + " | Filière : " + filiere);
    }
}
```

### Ce qui se passe

`Etudiant` hérite de `Personne`.

Mais il ne peut pas accéder directement à :

```java
private String nom;
private int age;
```

car ils sont privés dans `Personne`.

Il doit passer par les méthodes publiques :
- `getNom()`
- `getAge()`
- `setNom()`
- `setAge()`

C'est exactement le principe de l'encapsulation : on protège les données et on n'autorise qu'un accès contrôlé.

---

## 7) Règle simple à retenir

- `public` : tout le monde peut y accéder
- `private` : seulement la classe actuelle
- `protected` : la classe, les sous-classes, et le package
- sans modificateur : seulement dans le package

---

## 8) Version très simple

```java
class Personne {
    private int age;

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}
```

Ici, l'âge ne peut pas être changé n'importe comment.

On a un contrôle total sur les valeurs.

---

## 9) Conclusion

L'encapsulation consiste à :
- cacher les données importantes,
- n'autoriser que des accès contrôlés,
- protéger l'objet contre des valeurs invalides.

C'est une bonne pratique en Java et elle est très importante pour écrire du code propre et fiable.

---

## 10) En une phrase

> Une classe doit contrôler ses données plutôt que de les laisser être modifiées librement par le reste du programme.

Si tu veux, je peux aussi te faire les deux versions en code Java complet avec une classe `Main` prête à copier-coller dans IntelliJ ou VS Code.
