# Exercice 4 — Override et overload

## Objectif

Comprendre deux notions importantes en Java :
- le `overload` : plusieurs méthodes avec le même nom mais des paramètres différents
- le `override` : une méthode de la classe fille remplace la méthode de la classe mère

---

## 1) Overload

Le mot clé `overload` signifie :

> même nom, paramètres différents.

Exemple :

```java
class Calcul {
    public int additionner(int a, int b) {
        return a + b;
    }

    public double additionner(double a, double b) {
        return a + b;
    }
}
```

Ici, Java choisit la bonne méthode selon les arguments envoyés.

### Exemple d'appel

```java
Calcul c = new Calcul();
System.out.println(c.additionner(3, 5));
System.out.println(c.additionner(2.5, 3.5));
```

Résultat :

```text
8
6.0
```

---

## 2) Override

Le mot clé `override` signifie :

> une classe fille redéfinit une méthode de la classe mère.

Exemple :

```java
class Vehicule {
    public void deplacer() {
        System.out.println("Le véhicule avance");
    }
}

class Voiture extends Vehicule {
    @Override
    public void deplacer() {
        System.out.println("La voiture avance");
    }
}
```

### Exemple d'appel

```java
Vehicule v = new Vehicule();
Vehicule voiture = new Voiture();

v.deplacer();
voiture.deplacer();
```

Sortie :

```text
Le véhicule avance
La voiture avance
```

---

## 3) Différence simple

### Overload
- même méthode, mêmes noms,
- paramètres différents,
- exemple : `additionner(int, int)` et `additionner(double, double)`.

### Override
- même méthode, même nom, même paramètres,
- mais dans une classe fille,
- exemple : `deplacer()` dans `Voiture` remplace celui de `Vehicule`.

---

## 4) Pourquoi c'est utile ?

- `overload` permet d'écrire plusieurs versions d'une méthode pour différents types de données.
- `override` permet d'adapter le comportement d'une méthode à la classe fille.

---

## 5) Ce qu'il faut retenir

```java
class Calcul {
    int additionner(int a, int b) { return a + b; }
    double additionner(double a, double b) { return a + b; }
}
```

et

```java
class Vehicule {
    void deplacer() { System.out.println("Vehicule"); }
}

class Voiture extends Vehicule {
    @Override
    void deplacer() { System.out.println("Voiture"); }
}
```

---

## 6) Résumé ultime

- `overload` = plusieurs méthodes avec le même nom
- `override` = une méthode redéfinie dans une sous-classe

C’est un concept très important en Java orienté objet.
