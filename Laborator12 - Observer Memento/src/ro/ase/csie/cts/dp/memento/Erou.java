package ro.ase.csie.cts.dp.memento;

public class Erou {

	String nume;
	int puncteViata;
	String magie;


	public Erou(String nume, int puncteViata, String magie) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.magie = magie;
	}

	public void ataca() {
		System.out.println("ataca");
	}

	public void esteLovit(int puncte) {
		this.puncteViata-=puncte;
	}

	public void seVindeca(int puncte) {
	this.puncteViata+=puncte;
	}

	public MementoErou salvare() {
		return new MementoErou(nume, puncteViata, magie);
	}

	public void incarcaSalvare(MementoErou memento) {
		this.nume=memento.nume;
		this.puncteViata=memento.puncteViata;
		this.magie=memento.magie;
	}
}
