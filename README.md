# MovieList
Voici un exemple de comment rendre les pages indépendantes (RESTful) en gardant le requestscoped comme vu lors de la théorie du cours.
Je n'ai volontairement pas rajouté de validation détaillée, j'ai préféré garder l'exemple simple en convertissant les ID et rejeter tout le reste.
Les autres validations devraient suivre la même logique(excepter celle du login qui est lier aux Realms glassfish).
Pour tester cette manière de faire sur les détails d'une personne, voici l'URL.
 
http://localhost:8080/MovieList/faces/detailsperson.xhtml?personid=1
