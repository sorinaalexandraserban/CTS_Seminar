package ro.ase.csie.cts.dp.memento;

import java.util.Date;

public class MementoErou {

	String nume;
	int puncteViata;
	String magie;
	
	Date dataSalvare;

	public MementoErou(String nume, int puncteViata, String magie) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.magie = magie;
		this.dataSalvare=new Date();
	}
}
