package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.JpaTest;
import jpa.Person;

public class PersonDAO implements GenericDAO<Person,Long>{
	
	
		private EntityManager manager;

		public PersonDAO() {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
			manager = factory.createEntityManager();
			
		}
		public Person create(Person p) {
		

			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(p);
			tx.commit();
			
			return p;
		}

		public void delete(Person p) {


			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.remove(p);
			tx.commit();
			
		}


		public Person read(Long id) {
			return manager.find(Person.class, id);
		}



		public List<Person> readByName(String name) {
			return manager.createNamedQuery("touteslepersonneparleurnom").setParameter("name", name).getResultList();
		}
		
		public List<Person> readByFirstName(String fn){
			return manager.createQuery("Select * from Person p where p.prenom = :fn").setParameter("fn", fn).getResultList();
		}


		public Person update(Person p) {

			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.merge(p);
			tx.commit();
			
			return p;
		}
		
		


}