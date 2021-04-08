package ro.ase.csie.cts.dp.factory.method;

public class TestFactory {

	public static void main(String[] args) {
 
		boolean isModJoc4Kids=true;
		
		//not ok
		if(isModJoc4Kids) {
			//dezvoltare doar cu caractere 4Kids
		}
		else {
			//dezvlotare doar cu caractere normale
		}
		
		
		
		FactoryAbstractCaracter factoryCaracter=null;
		factoryCaracter= (isModJoc4Kids) ? new FactoryMod4Kids() : new FactoryModNormal();
        
		//dezvoltare joc
		CaracterJoc superman=factoryCaracter.getCaracter(TipCaracter.MARVEL, "Superman");
		
	}

}
