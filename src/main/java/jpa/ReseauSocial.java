package jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ReseauSocial {
	
	long id_rs;
	ElectronicDevice ed;
	String nomreseau;
	long consoreseau;
	
	
	
	@Id @GeneratedValue
	public long getIdRs() {
		return id_rs;
	}
	
	public void setIdRs(long id) {
		this.id_rs = id;
	}
	
	public String getNomreseau() {
		return nomreseau;
	}
	
	public void setNomreseau(String nomreseau) {
		this.nomreseau = nomreseau;
	}
	
	public long getConsoreseau() {
		return consoreseau;
	}
	
	public void setConsoreseau(long consoreseau) {
		this.consoreseau = consoreseau;
	}
	public long getId_rs() {
		return id_rs;
	}

	public void setId_rs(long id_rs) {
		this.id_rs = id_rs;
	}

	@ManyToOne
	public ElectronicDevice getEd() {
		return ed;
	}

	public void setEd(ElectronicDevice ed) {
		this.ed = ed;
	}
	
}
