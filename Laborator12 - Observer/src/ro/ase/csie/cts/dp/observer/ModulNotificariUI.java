package ro.ase.csie.cts.dp.observer;

public class ModulNotificariUI implements InterfataStatusConexiuneServer {

	@Override
	public void conexiuneIntrerupta() {
		System.out.println("PopUP:conexiune pierduta!");	
	}

	@Override
	public void conexiuneActiva() {
		System.out.println("PopUP:conexiune activa!");		
	}

}
