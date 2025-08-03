# API de Gestion d'Inventaire de Produits

Cette application est une API RESTful développée avec Spring Boot pour gérer un inventaire de produits. Elle permet d'effectuer les opérations CRUD (Create, Read, Update, Delete) sur les produits et inclut des fonctionnalités spécifiques de gestion des stocks bas.

## Fonctionnalités

* **Création de Produit :** Ajouter de nouveaux produits avec un nom, un prix et une quantité en stock. Le nom du produit doit être unique.
* **Consultation de Produits :** Récupérer la liste de tous les produits ou un produit spécifique par son ID.
* **Mise à Jour de Produit :** Modifier les informations d'un produit existant.
* **Suppression de Produit :** Retirer un produit de l'inventaire.
* **Alerte de Stock Bas :** Lister tous les produits dont la quantité en stock est inférieure à un seuil donné.
* **Recherche de Produit :** Rechercher des produits par une partie de leur nom (recherche insensible à la casse).
* **Validation des Données :** Assure l'intégrité des données en entrée.
* **Gestion Globale des Exceptions :** Réponses d'erreur cohérentes (400 Bad Request, 404 Not Found, 409 Conflict, 500 Internal Server Error).
* **Documentation API :** Intégration de Swagger UI pour explorer et tester les endpoints.

## Technologies Utilisées

* **Spring Boot 3.3.0** 
* **Java 17**
* **Spring Data JPA**
* **PostgreSQL** (Base de données relationnelle)
* **Lombok** (pour réduire le code boilerplate)
* **SpringDoc OpenAPI (Swagger UI 2.6.0)** (pour la documentation interactive de l'API)
* **Maven** (Gestionnaire de dépendances et de build)
* **Jakarta Validation** (pour la validation des DTOs)

## Configuration Requise

* **JDK 17** ou plus récent
* **Maven**
* **PostgreSQL** installé et en cours d'exécution

### Configuration de la Base de Données

1.   PostgreSQL  installé et accessible.
2.   base de données nommée `inventairedb` (ou adaptez le nom dans `application.properties`).
    ```sql
    CREATE DATABASE inventairedb;
    ```
3.  Mette à jour le fichier `src/main/resources/application.properties` avec vos identifiants PostgreSQL :
    ```properties
    # Database Configuration (PostgreSQL)
    spring.datasource.url=jdbc:postgresql://localhost:5432/inventairedb
    spring.datasource.username=postgres
    spring.datasource.password=admin
    spring.datasource.driver-class-name=org.postgresql.Driver

    # JPA and Hibernate Configuration
    spring.jpa.hibernate.ddl-auto=update # Permet à Hibernate de créer/mettre à jour les tables
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true
    ```
    **Note :** Le paramètre `spring.jpa.hibernate.ddl-auto=update` est pratique pour le développement car il gère automatiquement le schéma de la base de données. Pour la production, il est généralement préférable d'utiliser des outils de migration de base de données comme Flyway ou Liquibase.

## Démarrage de l'Application

1.  Clonez ce dépôt Git (si ce n'est pas déjà fait).
2.  Ouvrez le projet dans votre IDE (par exemple, IntelliJ IDEA).
3.  Assurez-vous que les dépendances Maven sont téléchargées.
4.  Lancez l'application en exécutant la classe `InventaireProduitsApiApplication.java` (méthode `main`) depuis votre IDE.

Alternativement, depuis le terminal à la racine du projet :
```bash
mvn clean install
javDocumentation de l'API (Swagger UI)

### Une fois l'application démarrée, accédez à la documentation interactive de l'API via Swagger UI :
http://localhost:8080/swagger-ui.html
