package ro.ase.csie.cts.dp.command;

public class TestCommand {

	public static void main(String[] args) {

		ManagerTaskuri manager=new ManagerTaskuri();
		
		manager.adaugaTask(new TaskAsincron(new ModulUpdate(), "versiunea 10.1",5));
		manager.adaugaTask(new TaskAsincron(new ModulAutoSave(), "Savare automata nivel 5", 1));
			
		System.out.println("Jocul continua...");
		
		
		manager.executaUrmatorulTask();
		System.out.println(" jocul continua...");
		
		manager.executaUrmatorulTask();
		System.out.println("Jocul continua....");
		}
	
}
