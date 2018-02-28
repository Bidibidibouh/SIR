package jpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Home {
	
	long id_home;
	long taille;
	int nbPieces;
	
	Collection<Heater> heaters;

	@Id @GeneratedValue
	public long getIdHome() {
		return id_home;
	}

	public void setIdHome(long id) {
		this.id_home = id;
	}

	public long getTaille() {
		return taille;
	}

	public void setTaille(long taille) {
		this.taille = taille;
	}

	public int getNbPieces() {
		return nbPieces;
	}

	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}

	@ManyToMany
	public Collection<Heater> getHeaters() {
		return heaters;
	}

	public void setHeaters(Collection<Heater> heaters) {
		this.heaters = heaters;
	}	
	
	public void addHeaters(Heater heater){
		this.heaters.add(heater);
	}
}
