package ro.ase.csie.cts.dp.decorator;

public abstract class SuperErou {
	
	String nume;
	int puncteViata;
	
	public SuperErou(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
	}
	
	public abstract int getPuncteViata();
	public abstract void alearga();
	public abstract void esteLovit(int puncte);
	public abstract void seVindeca(int puncte);
}
