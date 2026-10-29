# TP Java Avancé — Chapitre 2 : Programmation Fonctionnelle

> **École Marocaine des Sciences de l'Ingénieur (EMSI)**  
> **Professeur :** Yassine Rhazali  
> **Auteur :** Iliass Boukhiri  

---

## 📁 Organisation des dossiers

Chaque exercice possède son propre dossier indépendant contenant ses fichiers source `.java` et ses fichiers compilés `.class` :

```text
CHapitre 2 - TP/
├── Exercice1/
│   ├── Exercice1.java
│   └── Exercice1.class
├── Exercice2/
│   ├── Exercice2.java
│   ├── Exercice2.class
│   └── Operation.class
├── Exercice3/
│   ├── Exercice3.java
│   └── Exercice3.class
├── Exercice4/
│   ├── Exercice4.java
│   └── Exercice4.class
├── Exercice5/
│   ├── Exercice5.java
│   └── Exercice5.class
├── Exercice6/
│   ├── Exercice6.java
│   ├── Exercice6.class
│   └── Candidat.class
├── Exercice7/
│   ├── Exercice7.java
│   └── Exercice7.class
├── Exercice8/
│   ├── Exercice8.java
│   └── Exercice8.class
├── Exercice9/
│   ├── Exercice9.java
│   ├── Exercice9.class
│   └── Employe.class
├── Exercice10/
│   ├── Exercice10.java
│   └── Exercice10.class
├── sujet/
│   └── (Photos du sujet de TP)
└── README.md
```

---

## 📝 Liste des Exercices

| Dossier | Sujet | Notions abordées |
|---------|-------|------------------|
| **Exercice1** | Évaluer des résultats avec des expressions lambda | `Predicate<T>`, `Function<T,R>`, chaînage `and()`, lambdas |
| **Exercice2** | Construire une calculatrice paramétrable | Interface fonctionnelle personnalisée `@FunctionalInterface` `Operation` |
| **Exercice3** | Traiter des étudiants avec les interfaces fonctionnelles | `Predicate`, `Function`, `Consumer`, `Supplier` |
| **Exercice4** | Remplacer des lambdas par des références de méthode | Références de méthode statiques, d'instance et constructeur (`::`) |
| **Exercice5** | Nettoyer et normaliser des chaînes | Composition de fonctions avec `andThen()` et `compose()` |
| **Exercice6** | Combiner des règles de validation | Composition de prédicats (`and()`, `negate()`) avec classe `Candidat` |
| **Exercice7** | Capturer une configuration dans une lambda | Variables capturées, portée, notion d'« effectively final » |
| **Exercice8** | Créer un pipeline de transformation de commandes | Pipeline à trois étapes avec `andThen()` et `compose()` |
| **Exercice9** | Trier et comparer des objets métier | `Comparator` avec lambda, tri par attribut, `thenComparing()` avec `Employe` |
| **Exercice10** | Concevoir un moteur de traitement configurable | Combinaison `Predicate`, `Function` et `Consumer` |

---

## ▶️ Compilation et Exécution

Pour compiler et exécuter n'importe quel exercice :

```bash
cd Exercice1
javac Exercice1.java
java Exercice1
```
