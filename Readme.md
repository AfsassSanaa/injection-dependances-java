# 🧪 TP Injection des Dépendances – Partie 1

## 👩‍🎓 Informations Étudiante

- **Nom** : Sanaa Afssass
- **Filière** : Master BDCC (Big Data & Cloud Computing)
- **Année universitaire** : 2024 – 2025

---

## 🎯 Objectif

Mettre en place différentes techniques d'injection des dépendances en Java en simulant un cas simple de traitement métier basé sur une source de données.

---

## 📋 Étapes réalisées

### 1. Création des interfaces
- Création de l’interface `IDao` pour représenter l'accès aux données.
- Création de l’interface `IMetier` pour représenter la couche métier.

### 2. Création des implémentations
- Création de la classe `DaoImpl` qui implémente `IDao`.
- Création de la classe `MetierImpl` qui implémente `IMetier`.

### 3. Injection des dépendances par :
- **Instanciation statique** : injection manuelle des objets dans le code principal.
- **Instanciation dynamique** : chargement des classes et injection via `Class.forName` (réflexion).
- **Spring avec configuration XML** :
    - Création d’un fichier XML contenant les définitions des beans.
    - Chargement du contexte via Spring pour gérer l’injection.
- **Spring avec annotations** :
    - Utilisation de `@Component`, `@Autowired` et `@Configuration` pour l'injection automatique.

### 4. Tests
- Affichage d’un simple calcul utilisant la méthode de chaque injection.
- Vérification du bon fonctionnement de chaque approche.

---

## 📁 Structure du projet

- `src/main/java/...` : contient les interfaces, implémentations, classes de présentation.
- `src/main/resources/spring-config.xml` : configuration Spring XML.
- `pom.xml` : fichier de configuration Maven avec les dépendances nécessaires.