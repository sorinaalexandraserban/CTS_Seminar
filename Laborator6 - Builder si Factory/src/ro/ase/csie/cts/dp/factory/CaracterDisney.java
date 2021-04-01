package ro.ase.csie.cts.dp.factory;

public class CaracterDisney extends CaracterAbstract{
	String culoare;
    boolean okPentruCopiiMici=true;
    
	@Override
	public void alearga() {
		System.out.println("Alearga....");
	}

	@Override
	public void sare() {
		System.out.println("Sare.....");
		
	}

	public CaracterDisney(String culoare,String nume) {
		this.nume=nume;
		this.culoare = culoare;
	}
	
	

}