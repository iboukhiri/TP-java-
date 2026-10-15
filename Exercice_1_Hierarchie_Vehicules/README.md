# Exercice 1 — Hiérarchie de véhicules

## Objectif

Comprendre la notion d'héritage en Java.

L'idée est simple : on crée une classe générale, puis on crée des classes plus spécifiques qui héritent de cette classe.

Exemple :
- une voiture est un véhicule,
- une moto est un véhicule,
- un camion est un véhicule.

Donc, au lieu de réécrire le même code pour chaque type de véhicule, on met ce qui est commun dans une classe mère : `Vehicule`.

---

## 1) La logique à comprendre

Quand on dit :

```java
class Voiture extends Vehicule {
}
```

cela veut dire :

- `Voiture` hérite de `Vehicule`
- `Voiture` reçoit les attributs et méthodes de `Vehicule`
- `Voiture` peut aussi ajouter ses propres caractéristiques

### Exemple de structure

```text
Vehicule
├── Voiture
├── Moto
└── Camion
```

Tous ces objets partagent des choses communes :
- une marque,
- une vitesse,
- une méthode pour accélérer,
- une méthode pour freiner.

---

## 2) Version simple et correcte

```java
class Vehicule {
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
```

### Classe fille : `Voiture`

```java
class Voiture extends Vehicule {
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
```

### Classe fille : `Moto`

```java
class Moto extends Vehicule {
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
```

---

## 3) Utilisation dans le `main`

```java
public class Main {
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
```

### Sortie possible

```text
Voiture : Renault | Portes : 4
Marque : Renault | Vitesse : 10 km/h
Moto : Yamaha | Sidecar : false
Marque : Yamaha | Vitesse : 20 km/h
```

---

## 4) Pourquoi c'est bien fait ?

### Ce qui est commun

Les éléments communs à tous les véhicules sont dans `Vehicule` :
- `marque`
- `vitesse`
- `accelerer()`
- `freiner()`
- `afficher()`

### Ce qui est spécifique

Les éléments propres à une voiture ou à une moto sont dans leurs classes respectives :
- `nombrePortes` pour `Voiture`
- `sidecar` pour `Moto`

Cela évite de copier-coller du code inutilement.

---

## 5) Mots clés importants

### `extends`

```java
class Voiture extends Vehicule
```

Cela indique que `Voiture` hérite de `Vehicule`.

### `super(...)`

```java
super(marque);
```

Cela sert à appeler le constructeur de la classe mère.

### `protected`

Les attributs `protected` sont accessibles dans la classe mère et dans ses classes filles.

C'est utile pour éviter d'exposer trop de données au reste du programme.

---

## 6) Résumé simple

L'héritage permet de :
- regrouper les points communs,
- éviter les redondances,
- créer des classes plus spécifiques facilement.

Si tu veux, tu peux ensuite aller plus loin avec :
- `override` (remplacer une méthode),
- `abstract` (classe abstraite),
- `interface`.

---

## 7) Version ultra simple à retenir

```java
class Vehicule {
    String marque;

    void avancer() {
        System.out.println("Le véhicule avance");
    }
}

class Voiture extends Vehicule {
    void afficher() {
        System.out.println("C'est une voiture");
    }
}
```

Ici, `Voiture` a tout ce que `Vehicule` a, plus ce qu'on ajoute.

---

## 8) Conclusion

L'héritage est un principe fondamental de Java :

- une classe fille hérite d'une classe mère,
- la classe mère contient le code commun,
- la classe fille ajoute ses spécificités.

C'est la base pour écrire un code propre, clair et plus facile à maintenir.
