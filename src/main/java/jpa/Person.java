package jpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
	@NamedQuery(name="touteslepersonneparleurnom",query="select p from Person p where p.nom=:name")

})
public class Person {
	
	public Person() {
		super();
	}

	long id_pers;
	String nom;
	String prenom;
	String mail;
	Collection<Home> homes;
	Collection<Person> friends;
	Collection<ElectronicDevice> devices;

	

	public Person(long id_pers, String nom, String prenom, String mail, Collection<Home> homes,
			Collection<Person> friends, Collection<ElectronicDevice> devices) {
		super();
		this.id_pers = id_pers;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.homes = homes;
		this.friends = friends;
		this.devices = devices;
	}

	@Id @GeneratedValue
	public long getIdPers() {
		return id_pers;
	}

	public void setIdPers(long id) {
		this.id_pers = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@ManyToMany
	public Collection<Home> getHomes() {
		return homes;
	}

	public void setHomes(Collection<Home> homes) {
		this.homes = homes;
	}

	@ManyToMany
	public Collection<Person> getFriends() {
		return friends;
	}

	public void setFriends(Collection<Person> friends) {
		this.friends = friends;
	}
	

	@OneToMany(mappedBy="person")
	public Collection<ElectronicDevice> getDevices() {
		return devices;
	}

	public void setDevices(Collection<ElectronicDevice> devices) {
		this.devices = devices;
	}

}
