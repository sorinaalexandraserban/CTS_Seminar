package ro.ase.csie.cts.dp.composite;

import java.util.ArrayList;

public class GrupCaractereComposite extends UnitateAbstractaJoc {

	ArrayList<UnitateAbstractaJoc> unitati = new ArrayList<>();
	
	@Override
	public void seDeplaseaza(int x, int y) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void atacaJucator(int puncte) {
		for(UnitateAbstractaJoc unitate : unitati)
			unitate.atacaJucator(puncte);
	}

	@Override
	public void seRetrage() {
		for(UnitateAbstractaJoc unitate : unitati)
			unitate.seRetrage();	
	}
	
	//le supradefinim --- asta inseamna COMPOSITE

	@Override
	public void adaugaCaracter(UnitateAbstractaJoc unitate) {
		this.unitati.add(unitate);
	}

	@Override
	public void stergeCaracter(UnitateAbstractaJoc unitate) {
		this.unitati.remove(unitate);
	}

	@Override
	public UnitateAbstractaJoc getCaracter(int index) {
		return this.unitati.get(index);
	}
	
	
	

}
