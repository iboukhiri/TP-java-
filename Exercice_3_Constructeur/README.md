# Exercice 3 — Construction d'un objet

## Objectif

Comprendre le rôle d'un constructeur en Java et savoir comment il est appelé lors de la création d'un objet.

Un constructeur est une méthode spéciale utilisée pour initialiser un objet.

---

## 1) Concept de base

```java
public Personne(String nom) {
    this.nom = nom;
}
```

Ce constructeur permet de créer un objet `Personne` avec une valeur initiale.

---

## 2) Pourquoi `super(...)` ?

Quand une classe fille hérite d'une classe mère, son constructeur doit appeler le constructeur de la mère.

```java
public Etudiant(String nom) {
    super(nom);
}
```

Cela signifie :
- on crée d'abord la partie `Personne`,
- puis on termine la création de `Etudiant`.

---

## 3) Exemple complet

```java
class Personne {
    private String nom;

    public Personne(String nom) {
        this.nom = nom;
    }
}

class Etudiant extends Personne {
    public Etudiant(String nom) {
        super(nom);
    }
}
```

### Explication

- `new Etudiant("Sami")` appelle le constructeur de `Etudiant`
- `super(nom)` appelle le constructeur de `Personne`
- ensuite `Etudiant` continue son initialisation

---

## 4) Exemple du code fourni

On a un constructeur sans paramètre :

```java
public Personne() {
    System.out.println("Constructeur de Personne sans paramètre");
}
```

Et un autre constructeur avec paramètre :

```java
public Personne(String nom) {
    this.nom = nom;
    System.out.println("Constructeur de Personne avec nom : " + nom);
}
```

La classe `Etudiant` fait aussi appel à `super(nom)` :

```java
public Etudiant(String nom) {
    super(nom);
    System.out.println("Constructeur de Etudiant avec nom : " + nom);
}
```

---

## 5) Ce qu'il faut retenir

- Un constructeur initialise un objet.
- Une classe peut avoir plusieurs constructeurs (surcharge).
- `super(...)` sert à appeler le constructeur parent.
- L'ordre d'exécution est :
  1. constructeur parent,
  2. constructeur enfant.

---

## 6) Résumé simple

```java
class A {
    public A() {
        System.out.println("A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("B");
    }
}
```

Sortie :

```text
A
B
```

C’est la preuve que le constructeur de la classe mère est appelé avant celui de la classe fille.
