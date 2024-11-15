# Microservice Gestion Comptes - Activité Pratique N°1

Ce projet est une **activité pratique** pour développer un microservice de gestion des comptes bancaires. Il met en œuvre les concepts fondamentaux de Spring Boot, JPA, GraphQL, et Swagger.

---

## Fonctionnalités

- **Création d'un microservice avec Spring Boot** : Développement selon les principes d'architecture microservices.
- **Gestion des comptes avec persistance JPA** : CRUD complet sur les entités "Compte".
- **API REST exposée via Spring Data Rest et des projections** : Utilisation de Spring Data pour automatiser l'exposition des données.
- **Intégration de GraphQL** : Permet des requêtes et mutations flexibles sur les comptes.
- **Documentation et test des API avec Swagger** : Documentation générée automatiquement pour tester et comprendre les endpoints REST.
- **Tests des endpoints avec Postman** : Validation des API REST avec un client REST.

---
## Dépendances utilisées
Spring Boot Starter Web: Pour créer le web service Rest.
Spring Data JPA: Pour la gestion de la persistance des données.
H2 Database: Base de données en mémoire pour les tests.
Lombok: Simplification du code en évitant le boilerplate.
Spring Data Rest: Pour exposer les API automatiquement.
GraphQL: Pour exposer les données via une API GraphQL.
Swagger: Pour documenter les API Rest.

## Qu'est-ce qu'un microservice ?

Un **microservice** est une architecture logicielle où une application est divisée en plusieurs petits services indépendants. Chaque service est conçu pour remplir une fonction spécifique, est déployé de manière autonome, et communique avec d'autres services via des protocoles légers (comme HTTP/REST, ou GraphQL). Cette approche améliore la scalabilité, la résilience, et la facilité de maintenance des applications.

### Avantages des microservices :

- **Modularité** : Les services peuvent être développés, déployés et maintenus indépendamment.
- **Flexibilité technologique** : Chaque service peut utiliser des technologies ou des frameworks adaptés à ses besoins.
- **Évolutivité** : Permet de scaler uniquement les parties critiques de l'application.
- **Résilience** : Une panne dans un microservice n'affecte pas nécessairement les autres.

---

## Architecture du Microservice

Ce projet suit une architecture en couches avec les principes des microservices :

### 1. **Couche de Présentation**
   - **API RESTful** : Fournit des endpoints pour les opérations CRUD via Spring Data Rest.
   - **GraphQL API** : Permet une communication flexible avec les clients.

### 2. **Couche Métier**
   - Contient la logique métier pour la gestion des comptes.
   - Implémente les règles de validation et les calculs.

### 3. **Couche de Données**
   - **JPA/Hibernate** : Pour la gestion des entités et des relations dans une base de données H2.
   - **Spring Data JPA** : Simplifie les opérations CRUD sur les entités.
