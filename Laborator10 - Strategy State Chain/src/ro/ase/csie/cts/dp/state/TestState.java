package ro.ase.csie.cts.dp.state;

public class TestState {

	public static void main(String[] args) {
		
		SuperErou superman = new SuperErou("Superman");
		superman.seDeplaseaza();
		superman.esteAtacat(100);
		superman.seDeplaseaza();
		superman.esteAtacat(360);
		superman.seDeplaseaza();
		superman.seVindeca(500);
		superman.seDeplaseaza();
	}

}
