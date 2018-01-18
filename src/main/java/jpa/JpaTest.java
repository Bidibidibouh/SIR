package jpa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
	
			// create a new Person
			Person p = new Person();
			p.setMail("daniel@exemple.fr");
			p.setPrenom("Robert");
			p.setNom("Lepeltier");

			// save p in database
			manager.persist(p);
			
			Person p2 = new Person();
			p2.setMail("vivien@busson.fr");
			p2.setPrenom("Vivi");
			p2.setNom("Natasha");

			// save p in database
			manager.persist(p2);
			
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		
		
		/*CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
		// assuming a is an Integer  
		// if returning multiple fields, look into using a Tuple 
//		    or specifying the return type as an Object or Object[]
		CriteriaQuery<Integer> query = criteriaBuilder.createQuery(Integer.class);
		Root<Person> from = query.from(Person.class);
		query.multiselect(from.get("PERSON")).where(from.get("*").in(1, 2, 3, 4));

		// create query and execute...
		
		*/
		
		
		
//		String s = "SELECT e FROM Person as e where e.name=:name";
		
//		Query q = manager.createQuery(s,Person.class);
//		q.setParameter("name", "martin"); 
//		List<Person> res = q.getResultList();
		
//		System.err.println(res.size());
//		System.err.println(res.get(0).getName());
		
		manager.close();
		factory.close();
	}

}
