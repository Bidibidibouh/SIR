Ce TP nous a permis de comprendre les bases de l'utilisation de JPA, Jersey, JaxRS, Servlet

Le serveur tomcat se lance via un IDE, avec le maven goal 'tomcat7:run'. 
Il est �galement n�cessaire de configurer sa base de donn�e dans le fichier persistence.xml, dans les propi�t�s de la persistence mysql.

Il faut ensuite lancer le JpaTest pour observer l'ajout de donn�es dans la base de donn�es.

Suivre le lien localhost:9000/myform.html pour voir le formulaire de base.

Nous n'avons pas r�ussi � ajouter la classe SmartDevice � temps � cause de certaines erreurs qui faisaient bugger notre programme.
Le lien entre la BD n'est pas r�ussi puisque nous n'avons pas r�ussi, hormis avec JPAtest, � ajouter un home via notre SampleWebService, 
comme par exemple avec le lien localhost:9000/rest/home qui ne fonctionne pas, 
tandis que le lien localhost:9000/rest/hello renvoie bien les donn�es choisies.


