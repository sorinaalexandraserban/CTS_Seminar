package ro.ase.csie.cts.dp.command;

public class TaskAsincron implements InterfataTaskAsincron {

	private InterfataModulJoc modul=null;
	private String detalii;
    int prioritati;

    
	public TaskAsincron(InterfataModulJoc modul, String detalii, int prioritati) {
		super();
		this.modul = modul;
		this.detalii = detalii;
		this.prioritati = prioritati;
	}


	@Override
	public void startTaskAsincron() {
   
		this.modul.executaTask(detalii);
		
	}
	
}
