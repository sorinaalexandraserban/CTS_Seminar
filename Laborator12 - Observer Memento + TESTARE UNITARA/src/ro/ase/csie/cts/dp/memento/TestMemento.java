package ro.ase.csie.cts.dp.memento;

public class TestMemento {

	public static void main(String[] args) {
		
		ManagerIstoric istoric=new ManagerIstoric();
		Erou superman=new Erou("Superman",100,"zboara");
		
		istoric.adaugaSalvare(superman.salvare());

	    superman.esteLovit(10);
	    superman.esteLovit(50);
	    
	    System.out.println("puncte viata:"+superman.puncteViata); 
	    
	    superman.incarcaSalvare(istoric.getUltimaSalvare());
	    
	    System.out.println("puncte viata:"+superman.puncteViata); 

	}

}
