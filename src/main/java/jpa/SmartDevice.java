package jpa;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class SmartDevice {

	long id_ed;

	@Id
	@GeneratedValue
	public long getId_ed() {
		return id_ed;
	}

	
	public void setId_ed(long id_ed) {
		this.id_ed = id_ed;
	}
	
	
}
