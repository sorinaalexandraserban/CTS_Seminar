package ro.ase.csie.cts.dp.strategy;

public class Jucator {

	int totalOreJucate;
	String numePlayer;
	int clasaJucator;

	InterfataStrategieMarketing strategieMk = null;

	public Jucator(int totalOreJucate, String numePlayer, int clasaJucator) {
		this.totalOreJucate = totalOreJucate;
		this.numePlayer = numePlayer;
		this.clasaJucator = clasaJucator;
	}

	public int getTotalOreJucate() {
		return totalOreJucate;
	}

	public String getNumePlayer() {
		return numePlayer;
	}

	public int getClasaJucator() {
		return clasaJucator;
	}

	public void setStrategieMk(InterfataStrategieMarketing strategieMk) {
		this.strategieMk = strategieMk;
	}

	public void acordaPuncteBonus() {
		if (this.strategieMk != null) {
			this.strategieMk.aplicaStrategieBonus(this);
		} else {
			throw new UnsupportedOperationException();
		}
	}
}
