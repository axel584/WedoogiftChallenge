# Wedoogift Challenge

### Présentation / Contexte
Ce projet est conçu dans le cadre d'un processus de recrutement pour l'entreprise Wedoogift. Il n'a pas vocation a être utilisé en production. 
La description du challenge peut se trouver sur le site https://gitlab.com/wedoogift-jobs/challenge/-/tree/master/backend
En fouillant l'historique du projet, on y trouve une ancienne version qui guide un peu plus le modèle à suivre en fournissant par exemple, un fichier json des données.

### Choix techniques
Je suis parti sur une solution Spring Boot qui m'a permis de créer un template de projet via le site https://start.spring.io/
Le template inclue Spring MVC et Spring Security dans l'optique d'une évolution future (mais qui n'a pas été implémenté)
J'y ai ajouté lombok pour la facilité qu'il apporte sur la gestion des getter/setter.
La difficulté du projet est de trouver le bon compromis par rapport à un projet réél où l'on aurait des données stockées en base, avec des classes Repository pour y accéder. Il faut accepter des compromis et garder à l'idée que ce n'est qu'une façon de présenter ses compétences techniques.

### Possibilités d'évolution
Au début du projet, j'avais penser récupérer les fichiers json de l'historique du gitlab de Wedoogift, mais si le projet a été simplifié, c'est que cette partie ne semble pas avoir d'intérêt pour le processus de recrutement. On aurait pu les insérer au démarrage dans une base H2 (ou DB2/SQLite) avec du liquidbase.
Je n'ai pas non plus fait de controlleur qui aurait pu permettre de jouer avec le projet via le web. Avec HATEOAS, on aurait pu avoir un modèle qui lie	les différents endpoint de l'api pour pouvoir utiliser les services via l'api en cliquant sur les liens proposés. Même si le projet spring boot contient du MVC par défaut et du Spring Security qui permettent de gérer cette partie.




