Ce TP nous a permis de comprendre les bases de l'utilisation de JPA, Jersey, JaxRS, Servlet

Le serveur tomcat se lance via un IDE, avec le maven goal 'tomcat7:run'. 
Il est également nécessaire de configurer sa base de donnée dans le fichier persistence.xml, dans les propiétés de la persistence mysql.

Il faut ensuite lancer le JpaTest pour observer l'ajout de données dans la base de données.

Suivre le lien localhost:9000/myform.html pour voir le formulaire de base.

Nous n'avons pas réussi à ajouter la classe SmartDevice à temps à cause de certaines erreurs qui faisaient bugger notre programme.
Le lien entre la BD n'est pas réussi puisque nous n'avons pas réussi, hormis avec JPAtest, à ajouter un home via notre SampleWebService, 
comme par exemple avec le lien localhost:9000/rest/home qui ne fonctionne pas, 
tandis que le lien localhost:9000/rest/hello renvoie bien les données choisies.


