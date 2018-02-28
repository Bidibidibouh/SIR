package jpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ElectronicDevice{

	public ElectronicDevice() {
		super();
	}

	public ElectronicDevice(long id_ed, Person person, long consomoyenne, Collection<ReseauSocial> reseausoc) {
		super();
		this.id_ed = id_ed;
		this.person = person;
		this.consomoyenne = consomoyenne;
		this.reseausoc = reseausoc;
	}

	long id_ed;
	Person person;
	long consomoyenne;
	Collection<ReseauSocial> reseausoc;
	
	@Id @GeneratedValue
	public long getIdEd() {
		return id_ed;
	}
	
	public void setIdEd(long id) {
		this.id_ed = id;
	}
	
	public long getConsomoyenne() {
		return consomoyenne;
	}
	
	public void setConsomoyenne(long consomoyenne) {
		this.consomoyenne = consomoyenne;
	}
	
	@OneToMany(mappedBy="ed")
	public Collection<ReseauSocial> getReseausoc() {
		return reseausoc;
	}
	
	public void setReseausoc(Collection<ReseauSocial> reseausoc) {
		this.reseausoc = reseausoc;
	}
	
	@ManyToOne
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	
	
}
