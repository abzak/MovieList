# MovieList
Voici un exemple de comment rendre les pages indépendantes (RESTful) en gardant le requestscoped comme vu lors de la théorie du cours.
Je n'ai volontairement pas rajouté de validation de type ou autres, j'ai préféré garder l'exemple simple en gérant les ID négatif.
Les autres validation devrait suivre la même logique(excepter celle du login qui est lier au Realms glassfish).

Pour tester cette manière de faire sur les détails d'une personne , voici l'URL.
http://localhost:8080/MovieList/faces/detailsperson.xhtml?personid=-2
